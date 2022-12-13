package Cajas;
/**
 *
 * @author Daniel
 */
public class OCCaja {
    private int id;
    private String datosCliente;
    private String datosVehiculo;
    private String datosConductor;
    private String datosDestinos;
    
    public OCCaja(){
        this.id=0;
        this.datosCliente="";
        this.datosConductor="";
        this.datosDestinos="";
        this.datosVehiculo="";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatosCliente() {
        return datosCliente;
    }

    public void setDatosCliente(String datosCliente) {
        this.datosCliente = datosCliente;
    }

    public String getDatosVehiculo() {
        return datosVehiculo;
    }

    public void setDatosVehiculo(String datosVehiculo) {
        this.datosVehiculo = datosVehiculo;
    }

    public String getDatosConductor() {
        return datosConductor;
    }

    public void setDatosConductor(String datosConductor) {
        this.datosConductor = datosConductor;
    }

    public String getDatosDestinos() {
        return datosDestinos;
    }

    public void setDatosDestinos(String datosDestinos) {
        this.datosDestinos = datosDestinos;
    }
    
    
}
