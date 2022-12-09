package Catalogos.Vehiculos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jefry
 */
public class MainVehiculos{
    public static  ArrayList<OCVehiculos> arVehiculos=new ArrayList(); 
    public void agregar(int matricula, String marca, String modelo, int capacidadPersonas, String conductor, int seguro, boolean disponible){
    
     
 
  OCVehiculos veh=new OCVehiculos();
    
    veh.setMatricula(matricula);
    veh.setModelo(modelo);
    veh.setMarca(marca);
    veh.setCapacidadPersonas(capacidadPersonas);
    veh.setConductor(conductor);
    veh.setSeguro(seguro);
    
    
                        if (disponible == true) {
                            veh.setDisponible('A');
                        } else {
                              veh.setDisponible('I');
                        }     
        arVehiculos.add(veh);
         
        JOptionPane.showMessageDialog(null, "Vehiculo agregado");
    
    
    }

   

    public void mostrar() {
        int x;
        String s = "";
        for (x = 0; x < arVehiculos.size(); x++) {
            s = s + " | Matricula: " + arVehiculos.get(x).getMatricula() + " || Modelo: "
                    + arVehiculos.get(x).getModelo() + "  | Marca:  "
                    +arVehiculos.get(x).getMarca()+ " | Capacidad Personas: "
                    +arVehiculos.get(x).getCapacidadPersonas() + " | Conductor: "
                    +arVehiculos.get(x).getConductor() + " | Seguro: "
                    +arVehiculos.get(x).getSeguro() + "\n";
        }
        JOptionPane.showMessageDialog(null,
                "**Lista de vehiculos**\n" + s);
    }
    
    
 public String[] buscar(int id) {
        int x;
        String data[] = new String[7];
        for (x = 0; x < arVehiculos.size(); x++) {
            if (id == arVehiculos.get(x).getMatricula()) {
                data[0] = Integer.toString(arVehiculos.get(x).getMatricula());
                data[1] = arVehiculos.get(x).getModelo();
                data[2] = arVehiculos.get(x).getMarca();
                data[3] = Integer.toString(arVehiculos.get(x).getCapacidadPersonas());
                data[4] = arVehiculos.get(x).getConductor();
                data[5] = Integer.toString(arVehiculos.get(x).getSeguro());
                data[6] = Integer.toString(arVehiculos.get(x).getDisponible());
            }
        }
        return data;
    }

    public void modificar(int matricula, String modelo, String marca, int capacidadPersonas, String conductor, int seguro ,boolean disponible) {
        for (int x = 0; x < arVehiculos.size(); x++) {
            if (matricula == arVehiculos.get(x).getMatricula()) {

                arVehiculos.get(x).setModelo(modelo);
                arVehiculos.get(x).setMarca(marca);
                arVehiculos.get(x).setCapacidadPersonas(capacidadPersonas);
                arVehiculos.get(x).setConductor(conductor);
                arVehiculos.get(x).setSeguro(seguro);
                if (disponible == true) {
                    arVehiculos.get(x).setDisponible('A');
                } else {
                    arVehiculos.get(x).setDisponible('I');
                }
            }
        }
        }
    
    
    public String validarestado(int matricula ){
        String data ="Hola Mundo";
        for (int x = 0; x < arVehiculos.size(); x++) {
            if (matricula == arVehiculos.get(x).getMatricula()) {
                data= Integer.toString(arVehiculos.get(x).getDisponible());
            }
        }
        return data;
    
    
    }

   
    
}
    

