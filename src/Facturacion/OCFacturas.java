
package Facturacion;

public class OCFacturas  {// falta catalogo servicios
    private String cliente;
    private int id;
    private String destino;
    
    public OCFacturas(){
        this.id=0;
        this.cliente="";
        this.destino="";
        
        
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
