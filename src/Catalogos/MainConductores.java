/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class MainConductores {
    private ArrayList<OCConductores> arConductores=new ArrayList();    
       
          public void agregar(int id, String nombre, String ciudad, String direccion, int telefono, String correo) {
      int x;
       String ape = "sddfs";

        OCConductores con=new OCConductores();
        con.setNombre(nombre);
        con.setApellido(ape);
        con.setId(id);
        con.setCiudad(ciudad);
        con.setTelefono(ape);
        con.setCorreo(correo);
        arConductores.add(con);
         
        JOptionPane.showMessageDialog(null, "Conductor agregado");
   }

    public void mostrar() {
        int x;
        String s = "";
        for (x = 0; x < arConductores.size(); x++) {
            s = s + arConductores.get(x).getNombre() + " "
                    + arConductores.get(x).getId() + "\n";
        }
        JOptionPane.showMessageDialog(null,
                "El arreglo contiene:\n" + s);
    }
    
///falta el editar y el inactivar es lo mismo
}

