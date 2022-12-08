package Catalogos.Vehiculos;

import Catalogos.personas;
import Catalogos.personas;
import Catalogos.personas;
import Catalogos.Conductores.OCConductores;
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
   protected String conductor;
   protected int seguro;
   protected char disponible;
   

    public OCVehiculos() {
        this.matricula =0;
        this.marca ="";
        this.modelo = "";
        this.capacidadPersonas =0;
        this.conductor="";
        this.seguro=0;
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

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public int getSeguro() {
        return seguro;
    }

    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }
   
   
}
