/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogos.Proveedores;

/**
 *
 * @author Daniel
 */
public class OCPaquetes {

    private int id;
    private String descripcion;
    private int servicio;
    private int proveedores;
    private char estado;

    public OCPaquetes() {
        this.id = 0;
        this.descripcion = "";
        this.servicio = 0;
        this.proveedores = 0;
        this.estado = '\0';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getServicio() {
        return servicio;
    }

    public void setServicio(int servicio) {
        this.servicio = servicio;
    }

    public int getProveedores() {
        return proveedores;
    }

    public void setProveedores(int proveedores) {
        this.proveedores = proveedores;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

}
