
package Catalogos.Destinos;

/**
 *
 * @author Tawnny Elizondo
 */
public class OCDestinos {
    private int id;
    private String provincia;
    private String destino;
    private String tiempo;
    private double precioRegular;
    private String descripcion;
    private char pacEspecial;
    private double precioEspecial;
    private String distancia;
    private char estado;
    private int proveedor;
    private String DescriPaEs;
    private double totalfinal;
    public OCDestinos(){
        this.id=0;
        this.provincia="";
        this.destino="";
        this.tiempo="";
        this.precioRegular=0.00;
        this.descripcion="";
        this.pacEspecial='\0';
        this.estado='\0';
        this.precioEspecial=0.00;
        this.distancia="";
        this.proveedor=0;
        this.DescriPaEs="";
        this.totalfinal=0.00;
        
    }

    public double getTotalfinal() {
        return totalfinal;
    }

    public void setTotalfinal(double totalfinal) {
        this.totalfinal = totalfinal;
    }

    public String getProvincia() {
        return provincia;
    }

    public char getEstado() {
        return estado;
    }

    public String getDescriPaEs() {
        return DescriPaEs;
    }

    public void setDescriPaEs(String DescriPaEs) {
        this.DescriPaEs = DescriPaEs;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDestino() {
        return destino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public char getPacEspecial() {
        return pacEspecial;
    }

    public void setPacEspecial(char pacEspecial) {
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
