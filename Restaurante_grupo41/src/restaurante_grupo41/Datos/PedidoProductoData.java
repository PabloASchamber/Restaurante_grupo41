
package restaurante_grupo41.Datos;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restaurante_grupo41.Entidades.Pedido;
import restaurante_grupo41.Entidades.PedidoProducto;
import restaurante_grupo41.Entidades.Producto;


public class PedidoProductoData {
     private Connection con=null;

    public PedidoProductoData() {
        con=ConexionBD.conectar();
    }
     
    
    public void NuevoPedidoProducto(PedidoProducto pp){
        String sql="INSERT INTO pedidoproducto (idPedido, idProducto,  cantidad) VALUES (?,?,?)";
       
        try {
             PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             
             ps.setInt(1, pp.getPedido().getIdpedido());
             ps.setInt(2,pp.getProducto().getIdProducto());
             ps.setInt(3, pp.getCantidad());
             
             ps.executeUpdate();
              ResultSet rs = ps.getGeneratedKeys();
              
             if(rs.next()){
                 PedidoData pedat=new PedidoData();
                 ProductoData prodat=new ProductoData();
                 Producto producto=prodat.buscarProducto(rs.getInt("idProducto"));
                 Pedido pedido=pedat.buscarPedido(rs.getInt("idPedido"));
                 pp.setPedido(pedido);
                 pp.setProducto(producto);
                 pp.setCantidad(rs.getInt("cantidad"));
                 
                 JOptionPane.showMessageDialog(null, "Pedido producto agregado correctamente");
                 
             }
        } catch (SQLException ex) {
             Logger.getLogger(PedidoProductoData.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    
    
}
