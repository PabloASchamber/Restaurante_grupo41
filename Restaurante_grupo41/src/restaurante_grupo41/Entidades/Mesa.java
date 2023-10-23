
package restaurante_grupo41.Entidades;

public class Mesa {
    private int numero, capacidad;
    private boolean estado, atendida;

    public Mesa() {
    }

    public Mesa(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public Mesa(int numero, boolean atendida) {
        this.numero = numero;
        this.atendida = atendida;
    }

    public Mesa(int numero, int capacidad, boolean estado) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Mesa(int numero, int capacidad, boolean estado, boolean atendida) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = estado;
        this.atendida = atendida;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isAtendida() {
        return atendida;
    }

    public void setAtendida(boolean atendida) {
        this.atendida = atendida;
    }

    @Override
    public String toString() {
        return "Mesa{" + numero + '}';
    }


    
    
}
