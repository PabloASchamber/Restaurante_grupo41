
package restaurante_grupo41.Entidades;

public class Pedido {
    private Producto producto;
    private int idpedido;
    private Mesero mesero;
    private Mesa mesa;
    private double total;

    public Pedido() {
    }

    public Pedido(Producto producto, Mesero mesero, Mesa mesa, double total) {
        this.producto = producto;
        this.mesero = mesero;
        this.mesa = mesa;
        this.total = total;
    }

    public Pedido(Producto producto, int idpedido, Mesero mesero, Mesa mesa, double total) {
        this.producto = producto;
        this.idpedido = idpedido;
        this.mesero = mesero;
        this.mesa = mesa;
        this.total = total;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido{" + "producto=" + producto + ", idpedido=" + idpedido + ", mesero=" + mesero + ", mesa=" + mesa + ", total=" + total + '}';
    }
    
    
}
