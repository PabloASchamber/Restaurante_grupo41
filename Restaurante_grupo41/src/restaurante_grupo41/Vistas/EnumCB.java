
package restaurante_grupo41.Vistas;

public enum EnumCB {
    OPCION_1(" "),
    OPCION_2("Bebida"),
    OPCION_3("Comida"),
    OPCION_4("Postre");
    
    private final String label;

    private EnumCB(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
    
}
