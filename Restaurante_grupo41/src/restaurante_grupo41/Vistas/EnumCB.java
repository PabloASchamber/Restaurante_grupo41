
package restaurante_grupo41.Vistas;

public enum EnumCB {
    OPCION_1(" "),
    OPCION_2("bebida"),
    OPCION_3("comida"),
    OPCION_4("postre");
    
    private final String label;

    private EnumCB(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
    
    
}
