package Catalogos.Destinos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tawnny Elizondo
 */
public class MainDestinos {

    String[] Chepe = {
        "Hacienda La Chimba",
        "30min",
        "7000",
        "Hacienda la Chimba. Un lugar mágico rodeado de naturaleza ideal para hacer un recorrido junto a nuestros guías por la historia y proceso de producción del café.",
        "Incluye Cuerdas altas,Sendero La Mano del Mantra y almuerzo.",
        "23000",
        "16,9km"
    };
    String[] carta = {
        "Volcán Irazú y Sanatorio Durán",
        "1 hora",
        "7000",
        "Parque Nacional Volcán Irazú es uno de los majestuosos macizos de la cordillera volcánica central donde tambien encontramos el Parque de Prusia.",
        "Incluye pozas celestes, catarata y almuerzo.",
        "15000",
        "42km"
    };

    String[] Here = {
        "Volcán Barva – P.N Braulio Carrillo",
        "1 hora 30min",
        "7000", "El Parque Nacional Braulio Carrillo es una de las áreas protegidas más grandes de Costa Rica con 50 000 hectáreas y está ubicado en una de las zonas con la topografía más abrupta del país.",
        "Incluye Almuerzo, entrada al parque y snacks",
        "12000",
        "30,5km"
    };

    String[] Guana = {
        "P.N Rincón de la Vieja y Río Blanco",
        "4 horas 30min",
        "20000",
        "Este sitio cuenta con una red de senderos que van desde aquellos 100% naturales, a otros ligeramente modificados y tramos adaptados para permitir la accesibilidad de personas con necesidades especiales.",
        "Incluye desayuno, almuerzo, snack y entrada al parque.",
        "30000",
        "262km"
    };

    String[] Punta = {
        "Cañón de Aranjuez y Cerro el Encanto",
        "1 hora 45min",
        "9000",
        "Nos fuimos a las montañas de Miramar de Puntarenas para conocer el majestuoso Cañón del Río Aranjuéz, un lugar con vista Golfo de Nicoya y una caminata que los dejará impresionados y con la lengua afuera",
        "Con desayuno y almuerzo incluido.",
        "15000",
        "115km"
    };

    String[] Lim = {
        "Figues Farm",
        "2 horas",
        "13000",
        "Figue´s Farm es una opción única y familiar para los amantes de la naturaleza. Nuestros senderos le guiaran a través del bosque tropical húmedo para llegar a dos de las cataratas más hermosas del caribe.",
        "Con desayuno y almuerzo incluido.",
        "20000",
        "86,3km"};

    String[] Alaj = {
        "Pozas celestes + Catarata Río Agrio",
        "2 horas",
        "9000",
        "Catarata Río Agrio y las Pozas Celestes se han convertido en uno de los principales atractivos turísticos del cantón de Sarchí.",
        "Incluye pozas celestes, catarata y almuerzo.",
        "12000",
        "68km"};

    public static ArrayList<OCDestinos> arDestino = new ArrayList();

    public void agregar(int id, String provincia, String tiempo, double precioregular,
            String descripcion, boolean pacEspecial, double precioEspecial,
            String distancia, boolean estado, int conductor, String paqdes, String destino) {

        OCDestinos des = new OCDestinos();
        des.setId(id);
        des.setProvincia(provincia);
        des.setDestino(destino);
        des.setTiempo(tiempo);
        des.setProveedor(conductor);
        des.setPrecioRegular(precioregular);
        des.setDistancia(distancia);
        des.setDescripcion(descripcion);
        des.setDescriPaEs(paqdes);
        des.setPrecioEspecial(precioEspecial);

        if (pacEspecial == true) {
            des.setPacEspecial('A');
            des.setTotalfinal(precioEspecial);
        } else {
            des.setPacEspecial('I');
            des.setTotalfinal(precioregular);
        }

        if (estado == true) {
            des.setEstado('A');
        } else {
            des.setEstado('I');
        }
        arDestino.add(des);

        JOptionPane.showMessageDialog(null, "Destino agregado");
    }

    public void mostrar() {
        String s = "";
        for (int x = 0; x < arDestino.size(); x++) {
            s = s + " | Id " + arDestino.get(x).getId()
                    + " | Distancia" + arDestino.get(x).getDistancia()
                    + " | Provincia " + arDestino.get(x).getProvincia()
                    + " | Destino " + arDestino.get(x).getDestino()
                    + " | Tiempo Viaje " + arDestino.get(x).getTiempo()
                    + " | Precio Regular " + arDestino.get(x).getPrecioRegular()
                    + " | Estado " + arDestino.get(x).getEstado()
                    + " | Descripcion " + arDestino.get(x).getDescripcion()
                    + " | Paquete especial " + arDestino.get(x).getDescriPaEs()
                    + " | Precio especial " + arDestino.get(x).getPrecioEspecial()
                    + " | Estado paquete especial " + arDestino.get(x).getPacEspecial()
                    + " | Precio Final " + arDestino.get(x).getTotalfinal()+ "\n";

        }
        JOptionPane.showMessageDialog(null,
                "**Lista de destinos**\n" + s);
    }

    public String[] llenarcombobox() {
        int cantidad = 0;
        String[] Nombres = new String[10];
        for (int x = 0; x < arDestino.size(); x++) {
            if (arDestino.get(x).getEstado() == 'A') {
                Nombres[cantidad] = String.valueOf(arDestino.get(x).getId());
                cantidad = cantidad + 1;
            }
        }
        return Nombres;
    }
    
    
    public String[] buscar(int id) {
        int x;
        String data[] = new String[11];
        for (x = 0; x < arDestino.size(); x++) {
            if (id == arDestino.get(x).getId()) {
                data[0] = arDestino.get(x).getProvincia();
                data[1] = arDestino.get(x).getDestino();
                data[2] = arDestino.get(x).getTiempo();
                data[3] = String.valueOf(arDestino.get(x).getProveedor());
                data[4] = String.valueOf(arDestino.get(x).getPrecioRegular());
                data[5] = arDestino.get(x).getDistancia();
                data[6] = arDestino.get(x).getDescripcion();
                data[7] = arDestino.get(x).getDescriPaEs();
                data[8] = String.valueOf(arDestino.get(x).getPrecioEspecial());
                data[9] = String.valueOf(arDestino.get(x).getEstado());
                data[10] = String.valueOf(arDestino.get(x).getPacEspecial());
            }
        }
        return data;
    }
    
        public double buscarpreciofinal(int id) {
double data=0;
    for (int x = 0; x < arDestino.size(); x++) {
            if (id == arDestino.get(x).getId()) {
                data=arDestino.get(x).getTotalfinal();
            }
        }
        return data;
    }

    public String buscacaja(int id) {
        int x;
        String data = "";
        for (x = 0; x < arDestino.size(); x++) {
            if (id == arDestino.get(x).getId()) {
                data = "DESTINO\nProvincia " + String.valueOf(arDestino.get(x).getProvincia()) + "\nDestino "
                        + arDestino.get(x).getDestino() + "\nDistancia "
                        + arDestino.get(x).getDistancia() + "\n Tiempo "
                        + arDestino.get(x).getTiempo() + "\nDescripcion "
                        + arDestino.get(x).getDescripcion() +  "\nPrecio Final "
                        + arDestino.get(x).getTotalfinal()+ "\n";
 

            }
        }
        return data;
    }
public void modificar(int id,boolean disponible, boolean paquete) {
        for (int x = 0; x < arDestino.size(); x++) {
            if (id == arDestino.get(x).getId()) {
                if (disponible == true) {
                    arDestino.get(x).setEstado('A');
                } else {
                    arDestino.get(x).setEstado('I');
                }
                 if (paquete == true) {
                    arDestino.get(x).setPacEspecial('A');
                } else {
                    arDestino.get(x).setPacEspecial('I');
                }
            }
        }
        }
}
