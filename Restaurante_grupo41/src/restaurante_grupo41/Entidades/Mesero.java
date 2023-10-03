
package restaurante_grupo41.Entidades;

public class Mesero {
    private String nombre, usuario, pass;
    private boolean administrador;
    private int idMesero;

    public Mesero() {
    }

    public Mesero(String nombre, String usuario, String pass, boolean administrador) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.pass = pass;
        this.administrador = administrador;
    }

    public Mesero(String nombre, String usuario, String pass, boolean administrador, int idMesero) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.pass = pass;
        this.administrador = administrador;
        this.idMesero = idMesero;
    }

    public Mesero(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    @Override
    public String toString() {
        return "Mesero{" + "nombre=" + nombre + ", usuario=" + usuario + ", idMesero=" + idMesero + '}';
    }
    
    
    
    
}
