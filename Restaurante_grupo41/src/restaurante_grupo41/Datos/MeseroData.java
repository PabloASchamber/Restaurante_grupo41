package restaurante_grupo41.Datos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import restaurante_grupo41.Entidades.Mesero;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MeseroData {

    private Connection con = null;

    public MeseroData() {
        con = ConexionBD.conectar();

    }

    public void agregarMesero(Mesero mesero) {
        String sql = "INSERT INTO mesero( nombre, password, usuario, administrador) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mesero.getNombre());
            ps.setString(2, mesero.getPass()); //hacerle el mismo password
            ps.setString(3, mesero.getUsuario());
            ps.setBoolean(4, false);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                mesero.setNombre(rs.getString("insert_id"));
                mesero.setPass(rs.getString("insert_id"));
                mesero.setUsuario(rs.getString("insert_id"));
                mesero.setAdministrador(false);
                mesero.setIdMesero(rs.getInt("insert_id"));

                JOptionPane.showMessageDialog(null, "mesero agregado correctamente");
            }

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public void modificarMesero(Mesero mesero) {

        String sql = "UPDATE mesero SET nombre =? ,password=?, usuario=?  WHERE idMesero= ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, mesero.getNombre());
            ps.setString(2, mesero.getPass());
            ps.setString(3, mesero.getUsuario());
            ps.setInt(4, mesero.getIdMesero());
            int exito = ps.executeUpdate();
              if(exito==1){
                JOptionPane.showMessageDialog(null, "mesero modificado");

            }

        } catch (SQLException ex) {
            Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarMesero(Mesero mesero) {

        String sql = "DELETE FROM mesero WHERE idMesero= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, mesero.getIdMesero());
            int exito = ps.executeUpdate();
              if(exito==1){
                JOptionPane.showMessageDialog(null, "mesero eliminado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

   public Mesero buscarMeseroPorId (int id){
       String sql= "SELECT * FROM mesero WHERE idMesero="+ id ;
       
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(1, id);
            
            ps.executeQuery();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                
                Mesero mesero= new Mesero ();
                
                mesero.setNombre(rs.getString("insert_id"));
                mesero.setPass(rs.getString("insert_id"));
                mesero.setUsuario(rs.getString("insert_id"));
                mesero.setIdMesero(id);
                mesero.setAdministrador(rs.getBoolean("insert_id"));
                            
                
                 return mesero; 
            } else{
             JOptionPane.showMessageDialog(null, "no se encontró ningún mesero con ese Id");  
             
            }
            
               ps.close();
               
        } catch (SQLException ex) {
            Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return null;
       
       
   } 
   
   
   public void agregarAdministrador (Mesero mesero){
     
       String sql=  "UPDATE mesero SET administrador= true WHERE idMesero=?";
       
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
           ps.setInt(1, mesero.getIdMesero());
           
            int exito = ps.executeUpdate();
              if(exito==1){
                JOptionPane.showMessageDialog(null, "administrador agregado exitosamente");
       
   }
     
            
        } catch (SQLException ex) {
            Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);
        }

        
   }
   
   public void eliminarAdministrador (Mesero mesero){
     
       String sql=  "UPDATE mesero SET administrador= false WHERE idMesero=?";
       
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
           ps.setInt(1, mesero.getIdMesero());
           
            int exito = ps.executeUpdate();
              if(exito==1){
                JOptionPane.showMessageDialog(null, "administrador eliminado exitosamente");
       
   }
     
            
        } catch (SQLException ex) {
            Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);
        }

        
   }
   
   
   
}//fin
