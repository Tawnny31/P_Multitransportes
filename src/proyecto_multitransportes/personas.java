package proyecto_multitransportes;
public abstract class personas {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String correo;
    protected String ciudad;
    protected String direccion;
    private char estado;
    
    public personas(){
        this.id=0;
        this.nombre="";
        this.apellido="";
        this.telefono="";
        this.correo="";
        this.ciudad="";
        this.direccion="";
        this.estado='\0';
    }
    
    public void agregar(){    
    }
    public void editar(){
    }
    public void inactivar(){
    }
}

