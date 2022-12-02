/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tawnny
 */
public class MainProveedores {
      private ArrayList<OCProveedores> arProveedores=new ArrayList();    
       
          public void agregar(int id, String nombre, String ciudad, String direccion, int telefono, String correo) {
      int x;
       String ape = "sddfs";

        OCProveedores pro=new OCProveedores();
        pro.setNombre(nombre);
        pro.setApellido(ape);
        pro.setId(id);
        pro.setCiudad(ciudad);
        pro.setTelefono(ape);
        pro.setCorreo(correo);
        arProveedores.add(pro);
         
        JOptionPane.showMessageDialog(null, "Proveedor agregado");
   }

    public void mostrar() {
        int x;
        String s = "";
        for (x = 0; x < arProveedores.size(); x++) {
            s = s + arProveedores.get(x).getNombre() + " "
                    + arProveedores.get(x).getId() + "\n";
        }
        JOptionPane.showMessageDialog(null,
                "El arreglo contiene:\n" + s);
    }
    
///falta el editar y el inactivar es lo mismo
}

