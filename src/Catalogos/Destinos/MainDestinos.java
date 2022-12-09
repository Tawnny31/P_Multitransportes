
package Catalogos.Destinos;

import static Catalogos.Conductores.MainConductores.arConductores;
import Catalogos.Conductores.OCConductores;
import Catalogos.personas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tawnny Elizondo
 */
public class MainDestinos {
    public static OCDestinos arDestinos[]=new OCDestinos[7];
    OCDestinos con=new OCDestinos();
    
    public void infoPred(){
        arDestinos[0]=new OCDestinos("1-San Jose","Hacienda La Chimba","30min",(double)7000,
        "Hacienda la Chimba. Un lugar mágico rodeado de naturaleza ideal para "
        + "hacer un recorrido junto a nuestros guías por la historia y "
        + "proceso de producción del café.","Incluye Cuerdas altas, "
        + "Sendero La Mano del Mantra y almuerzo.",(double)23000,"16,9km");
        arDestinos[1]=new OCDestinos("2-Alajuela","Pozas celestes + Catarata Río Agrio",
        "2 horas",(double)9000,"Catarata Río Agrio y las Pozas Celestes se han "
        + "convertido en uno de los principales atractivos turísticos del cantón"
        + " de Sarchí.","Incluye pozas celestes, catarata y almuerzo.",(double)12000,"68km");
        arDestinos[2]=new OCDestinos("3-Cartago","Volcán Irazú y Sanatorio Durán",
        "1 hora",(double)7000,"Parque Nacional Volcán Irazú es uno de los majestuosos "
        + "macizos de la cordillera volcánica central donde tambien encontramos el"
        + " Parque de Prusia.","Incluye pozas celestes, catarata y almuerzo.",
        (double)15000,"42km");
        arDestinos[3]=new OCDestinos("4-Heredia","Volcán Barva – P.N Braulio Carrillo",
        "1 hora 30min",(double)7000,"El Parque Nacional Braulio Carrillo es una de las"
        + " áreas protegidas más grandes de Costa Rica con 50 000 hectáreas y está "
        + "ubicado en una de las zonas con la topografía más abrupta del país.",
        "Incluye Almuerzo, entrada al parque y snacks",(double)12000,"30,5km");
        arDestinos[4]=new OCDestinos("5-Guanacaste","P.N Rincón de la Vieja y Río Blanco",
        "4 horas 30min",(double)20000,"Este sitio cuenta con una red de senderos"
        + " que van desde aquellos 100% naturales, a otros ligeramente "
        + "modificados y tramos adaptados para permitir la accesibilidad "
        + "de personas con necesidades especiales.","Incluye desayuno, almuerzo, snack "
        + "y entrada al parque.",(double)30000,"262km");
        arDestinos[5]=new OCDestinos("6-Puntarenas","Cañón de Aranjuez y Cerro el Encanto",
        "1 hora 45min",(double)9000,"Nos fuimos a las montañas de Miramar de Puntarenas "
        + "para conocer el majestuoso Cañón del Río Aranjuéz, un lugar con vista "
        + "Golfo de Nicoya y una caminata que los dejará impresionados y con la "
        + "lengua afuera","Con desayuno y almuerzo incluido.",(double)15000,"115km");
        arDestinos[6]=new OCDestinos("7-Limon","Figues Farm","2 horas",
        (double)13000,"Figue´s Farm es una opción única y familiar para los amantes "
        + "de la naturaleza. Nuestros senderos le guiaran a través del bosque tropical "
        + "húmedo para llegar a dos de las cataratas más hermosas del caribe.",
        "Con desayuno y almuerzo incluido.",(double)20000,"86,3km");
    }
    
    public void mostrar(String provincia, String destino, String tiempo, double precioRegular, String descripcion, String pacEspecial, double precioEspecial, String distancia) {
        int x;
        String s = "";
        for (x = 0; x < arDestinos.length; x++) {
             s = s + arDestinos[x].getProvincia() + " | Provincia: "
                    +arDestinos[x].getDestino() + " | Destino: "
                    +arDestinos[x].getTiempo()+ " | Tiempo: "
                    +arDestinos[x].getPrecioRegular() + " | Precio Regular: "
                    +arDestinos[x].getDescripcion() + " | Descripcion: "
                    +arDestinos[x].getPacEspecial()+ " | Paquete Especial: "
                    +arDestinos[x].getPrecioEspecial()+ " | Precio Especial: "
                    +arDestinos[x].getDistancia()+ "\n";
        }
        JOptionPane.showMessageDialog(null,
                "**Lista de destinos**\n" + s);
    }
    
}
