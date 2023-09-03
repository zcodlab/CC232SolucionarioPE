package uni.aed.cc232solucionariope;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Persona {	

	String nombre;
	int edad;
	String genero;	
	
        Persona(){}
	Persona(String n, int e, String g) {		
		this.nombre = n;
		this.edad = e;
		this.genero = g;
	}
	
	void setearNombre(String n)
	{
		nombre=n;
	}
	
	String obtenerNombre()
	{
		return nombre;
	}
	
	int obtenerEdad()
	{
		return edad;
	}	
        
        void setearEdad(int e)
	{
		edad=e;
	}	
	
        float calcularEdadPromedio(ArrayList<Persona> personal)	{ 	
            int edadPromedio=0;		
            for (Persona p : personal)
                 edadPromedio+= p.obtenerEdad();            
            return edadPromedio/personal.size();
        }
}

