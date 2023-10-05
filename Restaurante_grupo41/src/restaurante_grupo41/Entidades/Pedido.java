
package restaurante_grupo41.Entidades;

import java.time.LocalDate;

public class Pedido {
    private Producto producto;
    private int idpedido;
    private Mesero mesero;
    private Mesa mesa;
    private double total;
    private LocalDate fechaHora;
    private boolean cobrada;

    public Pedido() {
    }

    public Pedido(Producto producto, Mesero mesero, Mesa mesa, double total, LocalDate fechaHora, boolean cobrada) {
        this.producto = producto;
        this.mesero = mesero;
        this.mesa = mesa;
        this.total = total;
        this.fechaHora = fechaHora;
        this.cobrada = cobrada;
    }

    public Pedido(Producto producto, int idpedido, Mesero mesero, Mesa mesa, double total, LocalDate fechaHora, boolean cobrada) {
        this.producto = producto;
        this.idpedido = idpedido;
        this.mesero = mesero;
        this.mesa = mesa;
        this.total = total;
        this.fechaHora = fechaHora;
        this.cobrada = cobrada;
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

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public boolean isCobrada() {
        return cobrada;
    }

    public void setCobrada(boolean cobrada) {
        this.cobrada = cobrada;
    }

    @Override
    public String toString() {
        return "Pedido{" + "producto=" + producto + ", idpedido=" + idpedido + ", mesero=" + mesero + ", mesa=" + mesa + ", total=" + total + ", fechaHora=" + fechaHora + ", cobrada=" + cobrada + '}';
    }

    
    
}
