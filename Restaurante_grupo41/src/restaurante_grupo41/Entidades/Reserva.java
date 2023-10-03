
package restaurante_grupo41.Entidades;

import java.time.LocalDate;

public class Reserva {
  private String nombre;
  private int dni, idReserva;
  private Mesa mesa;
  private LocalDate fecha, hora;
  private boolean estado; 

    public Reserva() {
    }

    public Reserva(String nombre, int dni, Mesa mesa, LocalDate fecha, LocalDate hora) {
        this.nombre = nombre;
        this.dni = dni;
        this.mesa = mesa;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Reserva(String nombre, int dni, int idReserva, Mesa mesa, LocalDate fecha, LocalDate hora, boolean estado) {
        this.nombre = nombre;
        this.dni = dni;
        this.idReserva = idReserva;
        this.mesa = mesa;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "nombre=" + nombre + ", dni=" + dni + ", idReserva=" + idReserva + ", mesa=" + mesa + ", fecha=" + fecha + ", hora=" + hora + ", estado=" + estado + '}';
    }
    
    
}
