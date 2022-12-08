/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogos.Conductores;

import Catalogos.Clientes.OCClientes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tawnny
 */
public class MainConductores {
    public static ArrayList<OCConductores> arConductores=new ArrayList();    
       
          public void agregar(int id, String nombre, String ciudad, String direccion, String telefono, String correo, boolean estado) {
      
        OCConductores con=new OCConductores();
        
        con.setNombre(nombre);
        con.setId(id);
        con.setCiudad(ciudad);
        con.setTelefono(telefono);
        con.setDireccion(direccion);
        con.setCorreo(correo);
                        if (estado == true) {
                            con.setEstado('A');
                        } else {
                              con.setEstado('I');
                        }     
        arConductores.add(con);
         
        JOptionPane.showMessageDialog(null, "Conductor agregado");
   }

    public void mostrar() {
        int x;
        String s = "";
        for (x = 0; x < arConductores.size(); x++) {
             s = s + arConductores.get(x).getId() + " | Nombre: "
                    + arConductores.get(x).getNombre() + " | Ciudad: "
                    +arConductores.get(x).getCiudad()+ " | Direccion: "
                    +arConductores.get(x).getDireccion() + " | Telefono: "
                    +arConductores.get(x).getTelefono() + " | Correo: "
                    +arConductores.get(x).getCorreo()+ " | Estado: "
                    +arConductores.get(x).getEstado()+ "\n";
        }
        JOptionPane.showMessageDialog(null,
                "**Lista de conductores**\n" + s);
    }
        public boolean buscarid(int id) {
        boolean estado = false;
        for (int x = 0; x < arConductores.size(); x++) {
            if (id == arConductores.get(x).getId()) {
                estado = true;
            }
        }
        return estado;
    }
        
 public String[] buscar(int id) {
        int x;
        String data[] = new String[7];
        for (x = 0; x < arConductores.size(); x++) {
            if (id == arConductores.get(x).getId()) {
                data[0] = Integer.toString(arConductores.get(x).getId());
                data[1] = arConductores.get(x).getNombre();
                data[2] = arConductores.get(x).getCiudad();
                data[3] = arConductores.get(x).getDireccion();
                data[4] = arConductores.get(x).getTelefono();
                data[5] = arConductores.get(x).getCorreo();
                data[6] = Integer.toString(arConductores.get(x).getEstado());
            }
        }
        return data;
    }

    public void modificar(int id, String nombre, String ciudad, String direccion, String telefono, String correo, boolean estado) {
        int x;
        for (x = 0; x < arConductores.size(); x++) {
            if (id == arConductores.get(x).getId()) {

                arConductores.get(x).setNombre(nombre);
                arConductores.get(x).setDireccion(direccion);
                arConductores.get(x).setTelefono(telefono);
                arConductores.get(x).setCorreo(correo);
                arConductores.get(x).setCiudad(ciudad);
                if (estado == true) {
                    arConductores.get(x).setEstado('A');
                } else {
                    arConductores.get(x).setEstado('I');
                }
            }
        }
    }

}

