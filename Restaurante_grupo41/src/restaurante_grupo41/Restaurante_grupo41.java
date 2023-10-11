
package restaurante_grupo41;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import restaurante_grupo41.Datos.ConexionBD;
import restaurante_grupo41.Datos.MesaData;
import restaurante_grupo41.Datos.MeseroData;
import restaurante_grupo41.Datos.PedidoData;
import restaurante_grupo41.Datos.ProductoData;
import restaurante_grupo41.Entidades.Mesa;
import restaurante_grupo41.Entidades.Mesero;
import restaurante_grupo41.Entidades.Pedido;
import restaurante_grupo41.Entidades.Producto;
import restaurante_grupo41.Vistas.VistaMain;

public class Restaurante_grupo41 {

    public static void main(String[] args) {
        Connection cbd = ConexionBD.conectar();
        
        VistaMain vista = new VistaMain();
        vista.setVisible(true); 
        
        
//        Mesa mesa=new Mesa(4);
//        Mesa mesa=new Mesa(1,4,true);
//        MesaData mdat=new MesaData();
//        mdat.agregarMesas(mesa);
        //mdat.eliminarMesa(6);
//        MeseroData medat= new MeseroData ();
//       Mesero mesero= new Mesero ("Pablox", "Pablitox", "12345",5);
     //   medat.agregarMesero(mesero);
//    medat.eliminarMesero(3);
//       medat.modificarMesero(mesero);
//        medat.agregarAdministrador(mesero);
//            medat.eliminarAdministrador(mesero);

//Mesero mesero=new Mesero("Admin", "Admin");
//       System.out.println(medat.ingreso(mesero));


          
//          System.out.println(medat.buscarMeseroPorId(2));
        
//        ArrayList<Mesa> mesas = mdat.listaMesasLibres();
//        for (Mesa mesa: mesas) {
//            System.out.println(mesa.getNumero());
//        }

//        ArrayList<Mesa> mesas = mdat.listaMesasOcupadas();
//        for (Mesa mesa: mesas) {
//            System.out.println(mesa.getNumero());
//        }
  
//  Producto product= new Producto (1,"arepa", 1500, 10, true);
//    ProductoData prodat= new ProductoData ();
//    prodat.agregarProducto(product);
//    prodat.eliminarProducto(prodat.buscarProducto(1));
//    System.out.println(prodat.buscarProducto(2));
  
//prodat.modificarProducto(product);

    
//        ArrayList<Producto> prod = prodat.listaProductos();
//        for (Producto producto: prod) {
//            System.out.println(producto.getNombre());
//        }
//    

//    PedidoData pedat= new PedidoData();
//        System.out.println(pedat.buscarPedido(1));
//    LocalDate ld= LocalDate.now ();
//    Pedido pedido= new Pedido (mesero, mesa, 3500,ld,true);
//    pedat.agregarPedido(pedido);
//    pedat.cancelarPedido(6);
//      pedat.cobrarPedido(1);
//    Pedido pedido = new Pedido (1, mesero, mesa, 6700,ld, false);
//pedat.modificarPedido(pedido);


    }
   
        
}
