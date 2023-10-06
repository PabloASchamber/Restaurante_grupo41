
package restaurante_grupo41.Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import restaurante_grupo41.Entidades.Mesa;
import restaurante_grupo41.Entidades.Pedido;

public class PedidoData {
    
    private Connection con=null;

    public PedidoData() {
        con=ConexionBD.conectar();
    }
    
    
    public Pedido buscarPedido(int id){
        String sql="SELECT * FROM pedido WHERE idPedido=?";
           
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
         if(rs.next()){
             MesaData medat=new MesaData();
             Mesa mesa=medat.buscarMesa(rs.getInt("idmesa"));
             MeseroData meseroD
             Mesero mesero=
            Pedido pedido=new Pedido();
            pedido.setMesa(mesa);
            pedido.setIdpedido(id);
            pedido.setFechaHora(rs.getDate("fechahora"));
            pedido.setCobrada(rs.getBoolean("cobrada"));
            pedido.setMesero(mesero);
         }
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
        
    
    
    
    
}
