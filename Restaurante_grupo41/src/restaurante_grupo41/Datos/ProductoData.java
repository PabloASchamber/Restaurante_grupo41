package restaurante_grupo41.Datos;

import java.sql.Connection;
import restaurante_grupo41.Entidades.Producto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.ArrayList;


public class ProductoData {

    private Connection con = null;

    public ProductoData() {

        con = ConexionBD.conectar();
    }

    public void agregarProducto(Producto producto) {

        String sql = "INSERT INTO producto( nombreProducto, precio, stock, estado, tipo) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setBoolean(4, producto.isEstado());
            ps.setString(5, producto.getTipo());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                producto.setNombre(rs.getString("insert_id"));
                producto.setPrecio(rs.getDouble("insert_id"));
                producto.setStock(rs.getInt("insert_id"));
                producto.setTipo(rs.getString("insert_id"));
                producto.setEstado(rs.getBoolean("insert_id"));

                JOptionPane.showMessageDialog(null, "producto agregado correctamente");

            }

            ps.close();

        } catch (SQLException ex) {

            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarProducto(Producto producto) {

        String sql = " DELETE FROM producto WHERE idProducto= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, producto.getIdProducto());

            int exito = ps.executeUpdate();

            if (exito > 0) {

                JOptionPane.showMessageDialog(null, "producto borrado correctamente");

            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void modificarProducto(Producto producto) {

        String sql = "UPDATE producto SET nombreProducto=?, precio=?, stock=?, estado=?, tipo=? WHERE idProducto= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setBoolean(4, producto.isEstado());
            ps.setString(5, producto.getTipo());
            ps.setInt(6, producto.getIdProducto());
          
            int exito = ps.executeUpdate();

            if (exito > 0) {

                JOptionPane.showMessageDialog(null, "producto modificado correctamente");

            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Producto buscarProducto(int id) {

        String sql = "SELECT * FROM producto WHERE idProducto= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Producto producto = new Producto();

                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombreProducto"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setTipo(rs.getString("tipo"));
                producto.setEstado(rs.getBoolean("estado"));

                ps.close();
                return producto;
            } else {

                JOptionPane.showMessageDialog(null, "no se encontró ningún producto");
                return null;

            }

        } catch (SQLException ex) {

            Logger.getLogger(ProductoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    
    public ArrayList<Producto> listaProductos() {
     ArrayList<Producto> listaP = new ArrayList<>();
        String sql="SELECT * FROM producto WHERE estado=1";
          try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();
            while (rs.next()){
               Producto producto =new Producto();
              producto.setIdProducto(rs.getInt("idProducto"));
              producto.setNombre(rs.getNString("nombreProducto"));
              producto.setPrecio(rs.getDouble("precio"));
              producto.setStock(rs.getInt("stock"));
              producto.setTipo(rs.getString("tipo"));
              producto.setEstado(true);
              
              listaP.add(producto);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaP;
    }
    
    
     public ArrayList<Producto> listaBebidas() {
     ArrayList<Producto> listaP = new ArrayList<>();
        String sql="SELECT * FROM producto WHERE tipo like 'bebida' ";
          try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();
            while (rs.next()){
               Producto producto =new Producto();
              producto.setIdProducto(rs.getInt("idProducto"));
              producto.setNombre(rs.getNString("nombreProducto"));
              producto.setPrecio(rs.getDouble("precio"));
              producto.setStock(rs.getInt("stock"));
              producto.setTipo(rs.getString("tipo"));
              producto.setEstado(true);
              
              listaP.add(producto);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaP;
    }
    
    
    public ArrayList<Producto> listaComida() {
     ArrayList<Producto> listaP = new ArrayList<>();
        String sql="SELECT * FROM producto WHERE tipo like 'comida' ";
          try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();
            while (rs.next()){
               Producto producto =new Producto();
              producto.setIdProducto(rs.getInt("idProducto"));
              producto.setNombre(rs.getNString("nombreProducto"));
              producto.setPrecio(rs.getDouble("precio"));
              producto.setStock(rs.getInt("stock"));
              producto.setTipo(rs.getString("tipo"));
              producto.setEstado(true);
              
              listaP.add(producto);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaP;
    }
    
    
    public ArrayList<Producto> listaPostre() {
     ArrayList<Producto> listaP = new ArrayList<>();
        String sql="SELECT * FROM producto WHERE tipo like 'postre' ";
          try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();
            while (rs.next()){
               Producto producto =new Producto();
              producto.setIdProducto(rs.getInt("idProducto"));
              producto.setNombre(rs.getNString("nombreProducto"));
              producto.setPrecio(rs.getDouble("precio"));
              producto.setStock(rs.getInt("stock"));
              producto.setTipo(rs.getString("tipo"));
              producto.setEstado(true);
              
              listaP.add(producto);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaP;
    }
    
    
      public ArrayList<Producto> listaTipo(String tipo) {
     ArrayList<Producto> listaP = new ArrayList<>();
        String sql="SELECT * FROM producto WHERE tipo like ? ";
          try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, tipo);
            ResultSet rs =ps.executeQuery();
            while (rs.next()){
               Producto producto =new Producto();
              producto.setIdProducto(rs.getInt("idProducto"));
              producto.setNombre(rs.getNString("nombreProducto"));
              producto.setPrecio(rs.getDouble("precio"));
              producto.setStock(rs.getInt("stock"));
              producto.setTipo(tipo);
              producto.setEstado(true);
              
              listaP.add(producto);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaP;
    }

}
