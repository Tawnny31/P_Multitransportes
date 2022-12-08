package Catalogos.Vehiculos;

import Catalogos.personas;
import Catalogos.personas;
import Catalogos.personas;
import javax.swing.JOptionPane;
/**
 *
 * @author jefry
 */
public class OCVehiculos {
    
   protected int matricula;
   protected String marca;
   protected String modelo;
   protected int capacidadPersonas;
   protected char disponible;

    public OCVehiculos() {
        this.matricula =0;
        this.marca ="";
        this.modelo = "";
        this.capacidadPersonas =0;
        this.disponible = '\0';
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public char getDisponible() {
        return disponible;
    }

    public void setDisponible(char disponible) {
        this.disponible = disponible;
    }
   
   
}
