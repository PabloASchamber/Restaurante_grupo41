
package restaurante_grupo41.Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restaurante_grupo41.Entidades.Mesa;

public class MesaData {
    private Connection con=null;

    public MesaData() {
       con=ConexionBD.conectar();
    }
    
    public ArrayList<Mesa> listaMesasLibres(){
         ArrayList<Mesa> mesasLibres = new ArrayList<>();
         String sqlLista="select * from mesa where estado=1";
        try {
            PreparedStatement ps=con.prepareStatement(sqlLista);
            ResultSet rs =ps.executeQuery();
            while (rs.next()){
                Mesa mesa=new Mesa();
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("estado"));
                mesa.setAtendida(rs.getBoolean("atendida"));
                mesasLibres.add(mesa);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesasLibres;
    }
    
    
    
        public ArrayList<Mesa> listaMesasOcupadas(){
         ArrayList<Mesa> mesasOcupadas = new ArrayList<>();
         String sqlLista="select * from mesa where estado=0";
          try {
            PreparedStatement ps=con.prepareStatement(sqlLista);
            ResultSet rs =ps.executeQuery();
            while (rs.next()){
                Mesa mesa=new Mesa();
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("estado"));
                mesa.setAtendida(rs.getBoolean("atendida"));
                mesasOcupadas.add(mesa);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesasOcupadas;
    }
        
        
        public ArrayList<Mesa> listaMesasCobrar(){
         ArrayList<Mesa> mesasCobro = new ArrayList<>();
         String sqlLista="select * from mesa where atendida=1";
          try {
            PreparedStatement ps=con.prepareStatement(sqlLista);
            ResultSet rs =ps.executeQuery();
             while (rs.next()){
                Mesa mesa=new Mesa();
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("estado"));
                mesa.setAtendida(rs.getBoolean("atendida"));
                mesasCobro.add(mesa);
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesasCobro;
    }
       
        
        
        
    public void agregarMesas(Mesa mesa){
        String sqlagregar="INSERT INTO mesa (capacidad, estado, atendida) VALUES (?,1,0)";
        try {
            PreparedStatement ps = con.prepareStatement(sqlagregar, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getCapacidad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
             if(rs.next()){
                mesa.setNumero(rs.getInt(1));
                mesa.setCapacidad(mesa.getCapacidad());
                mesa.setEstado(true);
                mesa.setAtendida(false);
              JOptionPane.showMessageDialog(null, "mesa agregada correctamente");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
        
    }
    
    
    public void eliminarMesa(int numero){
        String sqlEliminar="DELETE FROM `mesa` WHERE numero=?";
        try {
            PreparedStatement ps = con.prepareStatement(sqlEliminar, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, numero);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
             if(rs.next()){
              JOptionPane.showMessageDialog(null, "mesa borrada correctamente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    
    
}
