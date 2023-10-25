package restaurante_grupo41.Datos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restaurante_grupo41.Entidades.Mesa;
import restaurante_grupo41.Entidades.Mesero;
import restaurante_grupo41.Entidades.Pedido;

public class PedidoData {

    private Connection con = null;

    public PedidoData() {
        con = ConexionBD.conectar();
    }

    public Pedido buscarPedido(int id) {
        String sql = "SELECT * FROM pedido JOIN pedidoproducto ON pedidoproducto.idPedido = pedido.idPedido JOIN mesero ON pedido.mesero = mesero.idmesero JOIN mesa ON pedido.idmesa = mesa.numero WHERE pedido.idpedido=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mesa mesa = new Mesa();
                Mesero mesero = new Mesero();
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("ocupada"));
                mesa.setAtendida(rs.getBoolean("atendida"));
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                Pedido pedido = new Pedido();
                pedido.setMesa(mesa);
                pedido.setIdpedido(id);
                pedido.setFechaHora(rs.getDate("fechahora").toLocalDate());
                pedido.setCobrada(rs.getBoolean("cobrada"));
                pedido.setMesero(mesero);
                pedido.setTotal(rs.getDouble("importe"));
                return pedido;
            } 
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public void agregarPedido(Pedido pedido) {

        String sql = "INSERT INTO pedido( idMesa, mesero, fechaHora, importe, cobrada) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getMesa().getNumero());
            ps.setInt(2, pedido.getMesero().getIdMesero());
            ps.setDate(3, Date.valueOf(pedido.getFechaHora()));
            ps.setDouble(4, pedido.getTotal());
            ps.setBoolean(5, pedido.isCobrada());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                JOptionPane.showMessageDialog(null, "Pedido agregado correctamente");

            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    public void cancelarPedido (int id){

        String sql= "DELETE FROM pedido WHERE idpedido= ?";
        
               
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, id);
            
            int exito= ps.executeUpdate();
            
            if (exito > 0){
                
                JOptionPane.showMessageDialog(null, "Pedido cancelado correctamente");
            }else{
                
               JOptionPane.showMessageDialog(null, "No se encontró el Pedido"); 
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }

    public void cobrarPedido (int id){
        
        
        String sql= "UPDATE pedido SET cobrada = true WHERE idPedido =?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            int exito= ps.executeUpdate();
            
            if (exito ==1){
                
                JOptionPane.showMessageDialog(null, "Pedido cobrado correctamente");
             
            }else{
                
               JOptionPane.showMessageDialog(null, "No se encontró el Pedido"); 
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    } 
    
    public void modificarPedido (Pedido pedido){
        
      String sql= "UPDATE pedido SET idMesa=?, mesero=?,fechaHora=?, importe=? ,cobrada=? WHERE idPedido=?";
        
      
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            ps.setInt(1,pedido.getMesa().getNumero());
            ps.setInt(2, pedido.getMesero().getIdMesero());
            ps.setDate(3, Date.valueOf(pedido.getFechaHora()));
            ps.setDouble(4, pedido.getTotal());
            ps.setBoolean(5, pedido.isCobrada());
            ps.setInt(6, pedido.getIdpedido());
            int exito= ps.executeUpdate();
            
            if (exito==1){
                
              JOptionPane.showMessageDialog(null, "Pedido modificado correctamente");
              
            }else{
                
                JOptionPane.showMessageDialog(null, "No se pudo modificar el Pedido");
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Pedido> listaPedidosxCobrar(){
        ArrayList<Pedido> pedidosxcobrar = new ArrayList<>();
        String sql= "SELECT * FROM pedido JOIN pedidoproducto ON pedidoproducto.idPedido = pedido.idPedido JOIN mesero ON pedido.mesero = mesero.idmesero JOIN mesa ON pedido.idmesa = mesa.numero WHERE cobrada=0";

        try {
          PreparedStatement ps = con.prepareStatement(sql);
          ResultSet rs =ps.executeQuery();
            while (rs.next()) {
                Mesa mesa = new Mesa();
                Mesero mesero = new Mesero();
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("ocupada"));
                mesa.setAtendida(rs.getBoolean("atendida"));
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                Pedido pedido = new Pedido();
                pedido.setMesa(mesa);
                pedido.setIdpedido(rs.getInt("idPedido"));
                pedido.setFechaHora(rs.getDate("fechahora").toLocalDate());
                pedido.setCobrada(rs.getBoolean("cobrada"));
                pedido.setMesero(mesero);
                pedido.setTotal(rs.getDouble("importe"));
                pedidosxcobrar.add(pedido);
                return pedidosxcobrar;
            } 
            
            ps.close();
          
          
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
    
    
        public ArrayList<Pedido> listaPedidosCobrados(){
        ArrayList<Pedido> pedidoscobrados = new ArrayList<>();
        String sql= "SELECT * FROM pedido JOIN pedidoproducto ON pedidoproducto.idPedido = pedido.idPedido JOIN mesero ON pedido.mesero = mesero.idmesero JOIN mesa ON pedido.idmesa = mesa.numero WHERE cobrada=1";

        try {
          PreparedStatement ps = con.prepareStatement(sql);
          ResultSet rs =ps.executeQuery();
            if (rs.next()) {
                Mesa mesa = new Mesa();
                Mesero mesero = new Mesero();
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("ocupada"));
                mesa.setAtendida(rs.getBoolean("atendida"));
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                Pedido pedido = new Pedido();
                pedido.setMesa(mesa);
                pedido.setIdpedido(rs.getInt("idPedido"));
                pedido.setFechaHora(rs.getDate("fechahora").toLocalDate());
                pedido.setCobrada(rs.getBoolean("cobrada"));
                pedido.setMesero(mesero);
                pedido.setTotal(rs.getDouble("importe"));
                pedidoscobrados.add(pedido);
                return pedidoscobrados;
            } else {

                JOptionPane.showMessageDialog(null, "error al acceder a la tabla pedido");
            }
            ps.close();
          
          
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
    
    
          public ArrayList<Pedido> listaPedidos(){
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql= "SELECT * FROM pedido JOIN pedidoproducto ON pedidoproducto.idPedido = pedido.idPedido JOIN mesero ON pedido.mesero = mesero.idmesero JOIN mesa ON pedido.idmesa = mesa.numero";

        try {
          PreparedStatement ps = con.prepareStatement(sql);
          ResultSet rs =ps.executeQuery();
            while (rs.next()) {
                Mesa mesa = new Mesa();
                Mesero mesero = new Mesero();
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("ocupada"));
                mesa.setAtendida(rs.getBoolean("atendida"));
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                Pedido pedido = new Pedido();
                pedido.setMesa(mesa);
                pedido.setIdpedido(rs.getInt("idPedido"));
                pedido.setFechaHora(rs.getDate("fechahora").toLocalDate());
                pedido.setCobrada(rs.getBoolean("cobrada"));
                pedido.setMesero(mesero);
                pedido.setTotal(rs.getDouble("importe"));
                pedidos.add(pedido);
                return pedidos;
            } 
            
            ps.close();
          
          
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
          
            public Pedido buscarPedidoMesa(int nro) {
        String sql = "SELECT * FROM pedido JOIN pedidoproducto ON pedidoproducto.idPedido = pedido.idPedido JOIN mesero ON pedido.mesero = mesero.idmesero JOIN mesa ON pedido.idmesa = mesa.numero WHERE pedido.idmesa=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nro);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mesa mesa = new Mesa();
                Mesero mesero = new Mesero();
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("ocupada"));
                mesa.setAtendida(rs.getBoolean("atendida"));
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                Pedido pedido = new Pedido();
                pedido.setMesa(mesa);
                pedido.setIdpedido(rs.getInt("idpedido"));
                pedido.setFechaHora(rs.getDate("fechahora").toLocalDate());
                pedido.setCobrada(rs.getBoolean("cobrada"));
                pedido.setMesero(mesero);
                pedido.setTotal(rs.getDouble("importe"));
                return pedido;
            } 
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
     public void actualizarTotal (Pedido pedido){
         
             
      String sql= "UPDATE pedido SET importe=? WHERE idPedido=?";
        
      
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
           
            ps.setDouble(1, pedido.getTotal());
            ps.setInt(2, pedido.getIdpedido());
            int exito= ps.executeUpdate();
            
            if (exito==1){
                
                System.out.println("Total modificado correctamente");
           
              
            }else{
                
                JOptionPane.showMessageDialog(null, "No se pudo modificar el total");
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
         
     }
    
}// fin
