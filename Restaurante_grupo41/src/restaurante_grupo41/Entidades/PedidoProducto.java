
package restaurante_grupo41.Entidades;

public class PedidoProducto {
    
    
    private int pedidoProducto;
    private Pedido pedido;
    private Producto producto;
    private int cantidad;

    public PedidoProducto() {
    }

    public PedidoProducto(Pedido pedido, Producto producto, int cantidad) {
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public PedidoProducto(int pedidoProducto, Pedido pedido, Producto producto, int cantidad) {
        this.pedidoProducto = pedidoProducto;
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getPedidoProducto() {
        return pedidoProducto;
    }

    public void setPedidoProducto(int pedidoProducto) {
        this.pedidoProducto = pedidoProducto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "PedidoProducto{" + "pedidoProducto=" + pedidoProducto + ", pedido=" + pedido + ", producto=" + producto + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
    
}
