package Facturacion;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainFacturas {

    public static ArrayList<OCFacturas> arFactura = new ArrayList();

    public void agregar(int id, int cliente, int destino, int vehiculo, String fecha) {

        OCFacturas fa = new OCFacturas();

        fa.setCliente(cliente);
        fa.setDestino(destino);
        fa.setFecha(fecha);
        fa.setId(id);
        fa.setVehiculo(vehiculo);
        arFactura.add(fa);

        JOptionPane.showMessageDialog(null, "Reservacion agregada");
    }

    public void mostrar() {
        int x;
        String s = "";
        for (x = 0; x < arFactura.size(); x++) {
            s = s
                    + " | ID " + arFactura.get(x).getId()
                    + "| ID Cliente" + arFactura.get(x).getCliente()
                    + " | ID Vehiculo" + arFactura.get(x).getVehiculo()
                    + " | ID Destino" + arFactura.get(x).getDestino()
                    + " | ID Fecha" + arFactura.get(x).getFecha()
                    + "\n";
        }
        JOptionPane.showMessageDialog(null,
                "**Lista de reservaciones**\n" + s);
    }

    public String[] buscar(int id) {
        int x;
        String data[] = new String[4];
        for (x = 0; x < arFactura.size(); x++) {
            if (id == arFactura.get(x).getId()) {
                data[0] = String.valueOf(arFactura.get(x).getCliente());
                data[1] = String.valueOf(arFactura.get(x).getDestino());
                data[2] = String.valueOf(arFactura.get(x).getVehiculo());
                data[3] = String.valueOf(arFactura.get(x).getId());
            }
        }
        return data;
    }

    public String buscacaja(int id) {
        int x;
        String data = "";
        for (x = 0; x < arFactura.size(); x++) {
            if (id == arFactura.get(x).getId()) {
                data = String.valueOf(arFactura.get(x).getCliente()) + "//"
                        + String.valueOf(arFactura.get(x).getDestino()) + "//"
                        + String.valueOf(arFactura.get(x).getVehiculo()) + "//"
                        + String.valueOf(arFactura.get(x).getId());
            }
        }
        return data;
    }

    public String preguntar(int id) {
        String Nombres = "N/A";
        for (int x = 0; x < arFactura.size(); x++) {
            if (id == arFactura.get(x).getId()) {
                Nombres = "Hola si existe";
            }
        }
        return Nombres;
    }

}
