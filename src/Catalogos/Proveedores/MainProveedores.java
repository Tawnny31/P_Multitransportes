package Catalogos.Proveedores;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tawnny
 */
public class MainProveedores {

    public static ArrayList<OCProveedores> arProveedores = new ArrayList();

    public void agregar(int id, String nombre, String ciudad, String direccion, String telefono, String correo, boolean estado) {

        OCProveedores pro = new OCProveedores();

        pro.setNombre(nombre);
        pro.setId(id);
        pro.setCiudad(ciudad);
        pro.setTelefono(telefono);
        pro.setDireccion(direccion);
        pro.setCorreo(correo);

        if (estado == true) {
            pro.setEstado('A');
        } else {
            pro.setEstado('I');
        }
        arProveedores.add(pro);

        JOptionPane.showMessageDialog(null, "Proveedor agregado");
    }

    public void mostrar() {
        int x;
        String s = "";
        for (x = 0; x < arProveedores.size(); x++) {
            s = s + arProveedores.get(x).getId() + " | Nombre: "
                    + arProveedores.get(x).getNombre() + " | Ciudad: "
                    + arProveedores.get(x).getCiudad() + " | Direccion: "
                    + arProveedores.get(x).getDireccion() + " | Telefono: "
                    + arProveedores.get(x).getTelefono() + " | Correo: "
                    + arProveedores.get(x).getCorreo() + " | Estado: "
                    + arProveedores.get(x).getEstado() + "\n";
        }
        JOptionPane.showMessageDialog(null,
                "**Lista de proveedores**\n" + s);
    }

    public String[] buscar(int id) {
        int x;
        String data[] = new String[7];
        for (x = 0; x < arProveedores.size(); x++) {
            if (id == arProveedores.get(x).getId()) {
                data[0] = Integer.toString(arProveedores.get(x).getId());
                data[1] = arProveedores.get(x).getNombre();
                data[2] = arProveedores.get(x).getCiudad();
                data[3] = arProveedores.get(x).getDireccion();
                data[4] = arProveedores.get(x).getTelefono();
                data[5] = arProveedores.get(x).getCorreo();
                data[6] = Integer.toString(arProveedores.get(x).getEstado());
            }
        }
        return data;
    }
    

    public void modificar(int id, String nombre, String ciudad, String direccion, String telefono, String correo, boolean estado) {
        for (int x = 0; x < arProveedores.size(); x++) {
            if (id == arProveedores.get(x).getId()) {

                arProveedores.get(x).setNombre(nombre);
                arProveedores.get(x).setDireccion(direccion);
                arProveedores.get(x).setTelefono(telefono);
                arProveedores.get(x).setCorreo(correo);
                arProveedores.get(x).setCiudad(ciudad);
                if (estado == true) {
                    arProveedores.get(x).setEstado('A');
                } else {
                    arProveedores.get(x).setEstado('I');
                }
            }
        }
    }

    public String[] llenarcombobox() {
        int cantidad = 0;
        String[] Nombres = new String[10];
        for (int x = 0; x < arProveedores.size(); x++) {
            if (arProveedores.get(x).getEstado() == 'A') {
                Nombres[cantidad] = String.valueOf(arProveedores.get(x).getId());
                cantidad = cantidad + 1;
            }
        }
        return Nombres;
    }

}
