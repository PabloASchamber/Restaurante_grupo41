
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
         String sqlLista="select * from mesa where ocupada=0";
        try {
            PreparedStatement ps=con.prepareStatement(sqlLista);
            ResultSet rs =ps.executeQuery();
            while (rs.next()){
                Mesa mesa=new Mesa();
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("ocupada"));
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
         String sqlLista="select * from mesa where ocupada=1";
          try {
            PreparedStatement ps=con.prepareStatement(sqlLista);
            ResultSet rs =ps.executeQuery();
            while (rs.next()){
                Mesa mesa=new Mesa();
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("ocupada"));
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
                mesa.setEstado(rs.getBoolean("ocupada"));
                mesa.setAtendida(rs.getBoolean("atendida"));
                mesasCobro.add(mesa);
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesasCobro;
    }
       
        
        
        
    public void agregarMesas(Mesa mesa){
        String sqlagregar="INSERT INTO mesa (capacidad, ocupada, atendida) VALUES (?,0,0)";
        try {
            PreparedStatement ps = con.prepareStatement(sqlagregar, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getCapacidad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
             if(rs.next()){
                mesa.setNumero(rs.getInt(1));
                mesa.setCapacidad(mesa.getCapacidad());
                mesa.setEstado(false);
                mesa.setAtendida(false);
              JOptionPane.showMessageDialog(null, "mesa agregada correctamente");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
        
    }
    
    
    public void eliminarMesa(int numero){
        String sqlEliminar="DELETE FROM mesa WHERE numero=?";
        try {
            PreparedStatement ps = con.prepareStatement(sqlEliminar);
            ps.setInt(1, numero);
             int exito = ps.executeUpdate();
             
               if (exito>0) {
             
              JOptionPane.showMessageDialog(null, "mesa borrada correctamente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public Mesa buscarMesa(int numero){
        String sql= "SELECT * FROM mesa WHERE numero=?";
           try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, numero);
        
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Mesa mesa = new Mesa();
      
            mesa.setNumero(numero);
            mesa.setCapacidad(rs.getInt("capacidad"));
            mesa.setEstado(rs.getBoolean("ocupada"));
            mesa.setAtendida(rs.getBoolean("atendida"));
            
            ps.close();
            return mesa;
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningúna mesa con ese numero");
        }

        ps.close();
    } catch (SQLException ex) {
        Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);
    }
        return null;
        
    }
    
    public void mesaAtendida(int numero){
        String sql="UPDATE mesa SET atendida=1 WHERE ocupada= 1 && numero=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, numero);
             int exito = ps.executeUpdate();
               if (exito>0) {
               JOptionPane.showMessageDialog(null, "la mesa "+numero+" esta atendida");
               }else{
                   JOptionPane.showMessageDialog(null, "error al acceder a la tabla mesa");
               }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
               
    }
            
    public void limpiarMesa(int numero){
     String sql="UPDATE mesa SET atendida=0, ocupada=0 WHERE numero=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, numero);
             int exito = ps.executeUpdate();
               if (exito>0) {
               JOptionPane.showMessageDialog(null, "la mesa "+numero+" está disponible");
               }else{
                   JOptionPane.showMessageDialog(null, "error al acceder a la tabla mesa");
               }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Mesa> listaMesas(){
         ArrayList<Mesa> mesas = new ArrayList<>();
         String sqlLista="select * from mesa ";
        try {
            PreparedStatement ps=con.prepareStatement(sqlLista);
            ResultSet rs =ps.executeQuery();
            while (rs.next()){
                Mesa mesa=new Mesa();
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado(rs.getBoolean("ocupada"));
                mesa.setAtendida(rs.getBoolean("atendida"));
                mesas.add(mesa);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesas;
    }
    
    
    
     public void ocuparMesa(int numero){
     String sql="UPDATE mesa SET atendida=0, ocupada=1 WHERE numero=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, numero);
             int exito = ps.executeUpdate();
               if (exito>0) {
               JOptionPane.showMessageDialog(null, "la mesa "+numero+" se asignó correctamente");
               }else{
                   JOptionPane.showMessageDialog(null, "error al acceder a la tabla mesa");
               }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}//fin
