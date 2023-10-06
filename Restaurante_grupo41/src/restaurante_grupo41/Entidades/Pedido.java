
package restaurante_grupo41.Entidades;

import java.time.LocalDate;

public class Pedido {
    private int idpedido;
    private Mesero mesero;
    private Mesa mesa;
    private double total;
    private LocalDate fechaHora;
    private boolean cobrada;

    public Pedido() {
    }

    public Pedido(Mesero mesero, Mesa mesa, double total, LocalDate fechaHora, boolean cobrada) {
        this.mesero = mesero;
        this.mesa = mesa;
        this.total = total;
        this.fechaHora = fechaHora;
        this.cobrada = cobrada;
    }

    public Pedido(int idpedido, Mesero mesero, Mesa mesa, double total, LocalDate fechaHora, boolean cobrada) {
        this.idpedido = idpedido;
        this.mesero = mesero;
        this.mesa = mesa;
        this.total = total;
        this.fechaHora = fechaHora;
        this.cobrada = cobrada;
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
        return "Pedido{" + "idpedido=" + idpedido + ", mesero=" + mesero + ", mesa=" + mesa + ", total=" + total + ", fechaHora=" + fechaHora + ", cobrada=" + cobrada + '}';
    }

    
}
