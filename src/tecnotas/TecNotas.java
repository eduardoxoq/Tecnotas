//Proyecto para un control de notas 
package tecnotas;

import java.util.ArrayList;
import org.eduardo.bean.Alumno;

/**
 *
 * @author Eduardo Xoquic
 */
public class TecNotas {

    /**
     * Metodo principar UNICO en todo el proyecto
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a=new Alumno();
        Alumno b= new Alumno();
        ArrayList <Alumno> listaAlumno = new ArrayList<Alumno>();
        
        
        a.setNombre("Juan");
        b.setNombre("pedro");
        listaAlumno.add(a);
        System.out.println("Tu nombre es: "+a.getNombre());
        System.out.println("Tu nombre es: "+b.getNombre());
        
    }
    
}
