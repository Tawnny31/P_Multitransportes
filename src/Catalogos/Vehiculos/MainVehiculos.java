package Catalogos.Vehiculos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jefry
 */
public class MainVehiculos 
 public static  ArrayList<OCVehiculos> arVehiculos=new ArrayList(); 
 
  OCVehiculos veh=new OCVehiculos();
    
    veh.setMatricula(matricula);
    veh.setModelo(modelo);
    veh.setMarca(marca);
    veh.setCapacidadPersonas(capacidadPersonas);
    
    
                        if (disponible == true) {
                            veh.setDisponible('A');
                        } else {
                              veh.setDisponible('I');
                        }     
        arVehiculos.add(veh);
         
        JOptionPane.showMessageDialog(null, "Vehiculo agregado");
   

    public void mostrar() {
        int x;
        String s = "";
        for (x = 0; x < arVehiculos.size(); x++) {
            s = s + arVehiculos.get(x).getMatricula() + " | Matricula: "
                    + arVehiculos.get(x).getModelo() + " | Modelo: "
                    +arVehiculos.get(x).getMarca()+ " | Marca: "
                    +arVehiculos.get(x).getCapacidadPersonas() + " | Capacidad Personas: "
                    +arVehiculos.get(x).getDisponible()+ "\n";
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
                data[4] = Integer.toString(arVehiculos.get(x).getDisponible());
            }
        }
        return data;
    }

    public void modificar(int matricula, String modelo, String marca, String capacidadPersonas, boolean disponible) {
        for (int x = 0; x < arVehiculos.size(); x++) {
            if (matricula == arVehiculos.get(x).getMatricula()) {

                arVehiculos.get(x).setModelo(modelo);
                arVehiculos.get(x).setMarca(marca);
                arVehiculos.get(x).setCapacidadPersonas(capacidadPersonas);
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
    

