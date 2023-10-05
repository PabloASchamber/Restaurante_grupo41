
package restaurante_grupo41;

import java.sql.Connection;
import java.util.ArrayList;
import restaurante_grupo41.Datos.ConexionBD;
import restaurante_grupo41.Datos.MesaData;
import restaurante_grupo41.Datos.MeseroData;
import restaurante_grupo41.Entidades.Mesa;
import restaurante_grupo41.Entidades.Mesero;

public class Restaurante_grupo41 {

    public static void main(String[] args) {
        Connection cbd = ConexionBD.conectar();
//        Mesa mesa=new Mesa(4);
        //Mesa mesa=new Mesa(6,4,true);
        MesaData mdat=new MesaData();
//        mdat.agregarMesas(mesa);
        //mdat.eliminarMesa(6);
        MeseroData medat= new MeseroData ();
       // Mesero mesero= new Mesero ("Milton", "Mil", "12345");
     //   medat.agregarMesero(mesero);
    
          
          System.out.println(medat.buscarMeseroPorId(1));
        
//        ArrayList<Mesa> mesas = mdat.listaMesasLibres();
//        for (Mesa mesa: mesas) {
//            System.out.println(mesa.getNumero());
//        }

//        ArrayList<Mesa> mesas = mdat.listaMesasOcupadas();
//        for (Mesa mesa: mesas) {
//            System.out.println(mesa.getNumero());
//        }
        




    }
    
}
