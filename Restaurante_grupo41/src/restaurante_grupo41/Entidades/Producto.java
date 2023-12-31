
package restaurante_grupo41.Entidades;

public class Producto {
   private int idProducto;
   private String nombre, tipo;
   private double precio;
   private int stock;
   private boolean estado;
  

    public Producto() {
    }

    public Producto(String nombre, String tipo, double precio, int stock) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(String nombre, String tipo, double precio, int stock, boolean estado) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    public Producto(int idProducto, String nombre, String tipo, double precio, int stock, boolean estado) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + ", stock=" + stock + '}';
    }




    
    
}
    