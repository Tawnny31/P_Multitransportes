
package Facturacion;

public class OCFacturas  {// falta catalogo servicios
    private int cliente;
    private int id;
    private int destino;
    private int vehiculo;
    private String fecha;
    
    public OCFacturas(){
        this.id=0;
        this.cliente=0;
        this.destino=0;
        this.vehiculo=0;
        this.fecha="";
        
        
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public int getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(int vehiculo) {
        this.vehiculo = vehiculo;
    }

  
}
