
package Catalogos.Destinos;

/**
 *
 * @author Tawnny Elizondo
 */
public class OCDestinos {
    private String provincia;
    private String destino;
    private String tiempo;
    private double precioRegular;
    private String descripcion;
    private String pacEspecial;
    private double precioEspecial;
    private String distancia;
    
    public OCDestinos(){
        this.provincia="";
        this.destino="";
        this.tiempo="";
        this.precioRegular=0.00;
        this.descripcion="";
        this.pacEspecial="";
        this.precioEspecial=0.00;
        this.distancia="";
        
    }

    public OCDestinos(String provincia, String destino, String tiempo, double precioRegular, String descripcion, String pacEspecial, double precioEspecial, String distancia) {
        this.provincia = provincia;
        this.destino = destino;
        this.tiempo = tiempo;
        this.precioRegular = precioRegular;
        this.descripcion = descripcion;
        this.pacEspecial = pacEspecial;
        this.precioEspecial = precioEspecial;
        this.distancia = distancia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public double getPrecioRegular() {
        return precioRegular;
    }

    public void setPrecioRegular(double precioRegular) {
        this.precioRegular = precioRegular;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPacEspecial() {
        return pacEspecial;
    }

    public void setPacEspecial(String pacEspecial) {
        this.pacEspecial = pacEspecial;
    }

    public double getPrecioEspecial() {
        return precioEspecial;
    }

    public void setPrecioEspecial(double precioEspecial) {
        this.precioEspecial = precioEspecial;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    
}
