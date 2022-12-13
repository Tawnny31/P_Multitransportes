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

    public double total(int id2) {

        double total = md.buscarpreciofinal(id2);
        return total;
    }

    public String descripcion(int id, int id2, int id3) {

        String clientes = mc.buscacaja(id);
        String destino = md.buscacaja(id2);
        String vehiculos = mv.buscacaja(id3);
        String descripcion = clientes + destino + vehiculos;
        System.out.print(descripcion);
        return descripcion;
    }
public   String[] data;
   
    public String buscar(int id) {
       data = mf.buscacaja(id).split("//");
       String de ="";
        if (mf.preguntar(id) == "N/A") {

        } else {
            
            System.out.print(data);
         
                    de = String.valueOf(total(Integer.parseInt(data[1]))) +"//"+  descripcion(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]));
       
    }
 return de;
    }
 
    
}
