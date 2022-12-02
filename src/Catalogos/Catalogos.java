package Catalogos;


import Catalogos.Clientes.OCClientes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

class Catalogos {

    public ArrayList<OCClientes> cliente = new ArrayList();
 
    private ArrayList<OCConductores> conductor = new ArrayList();


    public void agregar(int id, String nombre, String ciudad, String direccion, int telefono, String correo) {
        int x;
            String ape = "sddfs";
            OCClientes cli = new OCClientes();
            cli.setNombre(nombre);
            cli.setApellido(ape);
            cli.setId(id);
            cli.setCiudad(ciudad);
            cli.setTelefono(ape);
            cli.setCorreo(correo);

            cliente.add(cli);
            JOptionPane.showMessageDialog(null, "Cliente agregado");
        }
    
    public void mostrar() {
        int x;
        String s = "";

        OCClientes clien = new OCClientes();

        for (x = 0; x < cliente.size(); x++) {
            clien.ver();
        }
    }

}
