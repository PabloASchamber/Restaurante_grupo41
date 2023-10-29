
package restaurante_grupo41.Datos;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restaurante_grupo41.Entidades.PedidoProducto;



public class PedidoProductoData {
     private Connection con=null;

    public PedidoProductoData() {
        con=ConexionBD.conectar();
    }
     

public void NuevoPedidoProducto(PedidoProducto pp) {
    String sql = "INSERT INTO pedidoproducto (idPedido, idProducto, cantidad) VALUES (?, ?, ?)";

    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        ps.setInt(1, pp.getPedido().getIdpedido());
        ps.setInt(2, pp.getProducto().getIdProducto());
        ps.setInt(3, pp.getCantidad());

        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();

        if (rs.next()) {
//            PedidoData pedat = new PedidoData();
//            ProductoData prodat = new ProductoData();
//            Producto producto = prodat.buscarProducto(rs.getInt("insert_id"));
//            Pedido pedido = pedat.buscarPedido(rs.getInt("insert_id"));
//            pp.setPedido(pedido);
//            pp.setProducto(producto);
//            pp.setCantidad(rs.getInt("insert_id"));
            pp.setPedidoProducto(rs.getInt("insert_id"));
            JOptionPane.showMessageDialog(null, "Pedido producto agregado correctamente");
        }
    } catch (SQLException ex) {
        Logger.getLogger(PedidoProductoData.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    
    public void cambiarPedido(PedidoProducto pp){
        String sql="UPDATE pedidoproducto SET  idProducto=?, cantidad=?  WHERE idPedidoProducto=?";
        
         try {
             PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1, pp.getProducto().getIdProducto());
             ps.setInt(2,pp.getCantidad());
             ps.setInt(3,pp.getPedidoProducto());
             ps.executeUpdate();
              ResultSet rs = ps.getGeneratedKeys();
              if(rs.next()){
                  JOptionPane.showMessageDialog(null, "Pedido modificado correctamente");
              }else{
                  JOptionPane.showMessageDialog(null, "No se pudo modificar el pedido");
              }
             
         } catch (SQLException ex) {
             Logger.getLogger(PedidoProductoData.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    }
    
    public void cancelarPedido(PedidoProducto pp){
         String sql=" DELETE FROM pedidoproducto WHERE idPedidoProducto=?";
         try {
             PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1,pp.getPedidoProducto());
             int exito=ps.executeUpdate();
             if(exito>0){
                  JOptionPane.showMessageDialog(null, "Pedido cancelado correctamente");
             }else{
                  JOptionPane.showMessageDialog(null, "No se pudo cancelar el pedido");
              }
         } catch (SQLException ex) {
             Logger.getLogger(PedidoProductoData.class.getName()).log(Level.SEVERE, null, ex);
         }
         
    }
    
    public ArrayList<PedidoProducto> listaPedidos(int idMesa){
    
        ArrayList<PedidoProducto> listPedido= new ArrayList<>();
            String sql="SELECT * FROM PedidoProducto JOIN Pedido ON PedidoProducto.idPedido= Pedido.idPedido WHERE Pedido.idMesa= ?";
            PreparedStatement ps;
            
         try {
             
             ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1, idMesa);
             ResultSet rs= ps.executeQuery();
             while  (rs.next()){
                 PedidoProducto pp= new PedidoProducto();
                 PedidoData pedido=new PedidoData();
                 ProductoData producto =new ProductoData();
                 pp.setCantidad(rs.getInt("cantidad"));
                 pp.setPedido(pedido.buscarPedido(rs.getInt("idPedido")));
                 pp.setPedidoProducto(rs.getInt("idPedidoProducto"));
                 pp.setProducto(producto.buscarProducto(rs.getInt("idProducto")));
                 
                 listPedido.add(pp);
                
             }
         } catch (SQLException ex) {
             Logger.getLogger(PedidoProductoData.class.getName()).log(Level.SEVERE, null, ex);
         }
          
         return listPedido;
            
        
    
    
    }
    
}//fin
