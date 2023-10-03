
package restaurante_grupo41.Entidades;

public class Producto {
    private int codigo, cantidad;
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(int cantidad, String nombre, double precio) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(int codigo, int cantidad, String nombre, double precio) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", cantidad=" + cantidad + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
}
