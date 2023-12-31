package restaurante_grupo41.Datos;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import restaurante_grupo41.Entidades.Mesero;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MeseroData {

    private Connection con = null;

    public MeseroData() {
        con = ConexionBD.conectar();

    }

    public void agregarMesero(Mesero mesero) {
        String sql = "INSERT INTO mesero( nombre, password, usuario, administrador) VALUES (?,?,?,?)";

        try {
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
            } catch (java.sql.SQLIntegrityConstraintViolationException ex2) {
                JOptionPane.showMessageDialog(null, " Usuario existente ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public void modificarMesero(Mesero mesero) {

        String sql = "UPDATE mesero SET nombre =? ,password=?, usuario=?  WHERE idMesero= ? ";

        try {
            try {
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                ps.setString(1, mesero.getNombre());
                ps.setString(2, mesero.getPass());
                ps.setString(3, mesero.getUsuario());
                ps.setInt(4, mesero.getIdMesero());
                int exito = ps.executeUpdate();
                if (exito == 1) {
                    JOptionPane.showMessageDialog(null, "mesero modificado");

                }
            } catch (java.sql.SQLIntegrityConstraintViolationException ex2) {
                JOptionPane.showMessageDialog(null, " Usuario existente ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarMesero(int id) {
        String sql = "DELETE FROM mesero WHERE idMesero = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Mesero eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún mesero con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mesero buscarMeseroPorId(int id) {
        String sql = "SELECT * FROM mesero WHERE idMesero=" + id;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Mesero mesero = new Mesero();

                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setPass(rs.getString("password"));
                mesero.setUsuario(rs.getString("usuario"));
                mesero.setAdministrador(rs.getBoolean("administrador"));

                ps.close();
                return mesero;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún mesero con ese Id");
            }

            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    public void agregarAdministrador(Mesero mesero) {

        String sql = "UPDATE mesero SET administrador= true WHERE idMesero=?";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, mesero.getIdMesero());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "administrador agregado exitosamente");

            }

        } catch (SQLException ex) {
            Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void eliminarAdministrador(Mesero mesero) {

        String sql = "UPDATE mesero SET administrador= false WHERE idMesero=?";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, mesero.getIdMesero());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "administrador eliminado exitosamente");

            }

        } catch (SQLException ex) {
            Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Mesero ingreso(Mesero mesero) {
        Mesero ingreso = new Mesero();
        String sqlu = "SELECT * FROM mesero WHERE usuario= BINARY ?";

        try {
            PreparedStatement psu = con.prepareStatement(sqlu, Statement.RETURN_GENERATED_KEYS);
            psu.setString(1, mesero.getUsuario());
            ResultSet rsu = psu.executeQuery();
            if (rsu.next()) {

                String sqluc = "SELECT * FROM mesero WHERE usuario= BINARY ? && password= BINARY ?";

                PreparedStatement ps = con.prepareStatement(sqluc, Statement.RETURN_GENERATED_KEYS);

                ps.setString(1, mesero.getUsuario());
                ps.setString(2, mesero.getPass());

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    ingreso.setIdMesero(rs.getInt("idmesero"));
                    ingreso.setNombre(rs.getNString("nombre"));
                    ingreso.setUsuario(mesero.getUsuario());
                    ingreso.setPass(mesero.getPass());
                    ingreso.setAdministrador(rs.getBoolean("administrador"));
                    return ingreso;

                } else {
                    JOptionPane.showMessageDialog(null, "contraseña incorrecta");
                    return null;
                }

            } else {
                JOptionPane.showMessageDialog(null, "usuario no encontrado");
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MeseroData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    public ArrayList<Mesero> ListaMesero() {
        ArrayList<Mesero> listam = new ArrayList<>();
        String sqlLista = "select * from mesero";
        try {
            PreparedStatement ps = con.prepareStatement(sqlLista);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mesero mesero = new Mesero();
                mesero.setNombre(rs.getString("nombre"));
                mesero.setUsuario(rs.getString("usuario"));
                mesero.setPass(rs.getString("password"));
                mesero.setAdministrador(rs.getBoolean("administrador"));
                mesero.setIdMesero(rs.getInt("idmesero"));
                listam.add(mesero);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listam;
    }

}//fin
