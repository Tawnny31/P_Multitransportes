package Cajas;

import Catalogos.Clientes.MainClientes;
import Catalogos.Destinos.MainDestinos;
import Catalogos.Vehiculos.MainVehiculos;
import Facturacion.MainFacturas;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class MainCajas {
    MainFacturas mf = new MainFacturas();
MainDestinos md = new MainDestinos();
MainClientes mc = new MainClientes();
MainVehiculos mv = new MainVehiculos();
    public void escoger(int id, int id2, int id3) {

        String clientes = mc.buscacaja(id);
       System.out.print(clientes);
       String destino = md.buscacaja(1);
  System.out.print(destino);
  String vehiculos = mv.buscacaja(id3);
    System.out.print(vehiculos);
    }



    public void buscar() {
        int id =Integer.parseInt( JOptionPane.showInputDialog("Escribe el ID de la reservacion"));
        if (mf.preguntar(id) == "N/A") {
            
        }else{
         String[] data =  mf.buscacaja(id).split("//");
         System.out.print(data);
            escoger(Integer.parseInt(data[0]), Integer.parseInt(data[1]),Integer.parseInt(data[2])
            );
                        
        }

    }
}
