package Facturacion;

import java.net.*;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class MainFacturas {

    private static final String HOST = "localhost";
    private static final int PUERTO = 5000;
    private Socket sc;
    private DataInputStream entrada;
    private DataOutputStream salida;
    private String mensajeRecibido = "";
    private String mensajeEnviar = "";

    public void inicializarCliente() {
        try {
            Scanner lectura = new Scanner(System.in);
            sc = new Socket(HOST, PUERTO);
            entrada = new DataInputStream(sc.getInputStream());
            salida = new DataOutputStream(sc.getOutputStream());
            while (!mensajeEnviar.equals("SALIR")) {
                mensajeEnviar = JOptionPane.showInputDialog("Hola");
                salida.writeUTF(mensajeEnviar);
                mensajeRecibido = entrada.readUTF();
                System.out.print(mensajeRecibido);

            }
        } catch (IOException ex) {
            System.out.print("¡Error durante el proceso de conexión, revise!");
        }
    }
}
