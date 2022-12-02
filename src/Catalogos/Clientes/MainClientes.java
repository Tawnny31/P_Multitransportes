package Catalogos.Clientes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class MainClientes {

    private ArrayList<OCClientes> arCliente = new ArrayList();

    public void agregar(int id, String nombre, String ciudad, String direccion, String telefono, String correo, boolean estado) {

        OCClientes cli = new OCClientes();
        
        cli.setNombre(nombre);
        cli.setId(id);
        cli.setCiudad(ciudad);
        cli.setTelefono(telefono);
        cli.setDireccion(direccion);
        cli.setCorreo(correo);
                        if (estado == true) {
                            cli.setEstado('A');
                        } else {
                              cli.setEstado('I');
                        }     
        arCliente.add(cli);

        JOptionPane.showMessageDialog(null, "Cliente agregado");
    }

    public void mostrar() {
        int x;
        String s = "";
        for (x = 0; x < arCliente.size(); x++) {
            s = s + arCliente.get(x).getNombre() + " "
                    + arCliente.get(x).getId() + "\n";
        }
        JOptionPane.showMessageDialog(null,
                "El arreglo contiene:\n" + s);
    }

    public String[] buscar(int id) {
        int x;
        String data[] = new String[7];
        for (x = 0; x < arCliente.size(); x++) {
            if (id == arCliente.get(x).getId()) {
                data[0] = Integer.toString(arCliente.get(x).getId());
                data[1] = arCliente.get(x).getNombre();
                data[2] = arCliente.get(x).getCiudad();
                data[3] = arCliente.get(x).getDireccion();
                data[4] = arCliente.get(x).getTelefono();
                data[5] = arCliente.get(x).getCorreo();
                data[6] = Integer.toString(arCliente.get(x).getEstado());
            }
        }
        return data;
    }

    public void modificar(int id, String nombre, String ciudad, String direccion, String telefono, String correo, boolean estado) {
        int x;
        for (x = 0; x < arCliente.size(); x++) {
            if (id == arCliente.get(x).getId()) {

                arCliente.get(x).setNombre(nombre);
                arCliente.get(x).setDireccion(direccion);
                arCliente.get(x).setTelefono(telefono);
                arCliente.get(x).setCorreo(correo);
                arCliente.get(x).setCiudad(ciudad);
                if (estado == true) {
                    arCliente.get(x).setEstado('A');
                } else {
                    arCliente.get(x).setEstado('I');
                }
            }
        }
    }

}
