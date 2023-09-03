package uni.aed.cc232solucionariope;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class CC232SolucionarioPE {

    public static void main(String[] args) {
        ArrayList<Persona> personal = new ArrayList<>();
		Persona per = new Persona();
		
        String  snombre,sgenero;
        int     iedad;
        String  inputStr;
        String  Rpta="S";        
        
            do {
                snombre   = JOptionPane.showInputDialog(null,"Nombre");
                inputStr  = JOptionPane.showInputDialog(null,"Edad");
                iedad 	    = Integer.parseInt(inputStr);
                sgenero   = JOptionPane.showInputDialog(null,"Genero");
                personal.add(new Persona(snombre,iedad,sgenero));

                Rpta    = JOptionPane.showInputDialog(null,"Desea continuar registrando personas(pulsa S o N para finalizar)");
                        Rpta	= Rpta.toUpperCase();
            }while(Rpta.equals("S")==true);

            System.out.println("La Edad Promedio de las personas es: " + per.calcularEdadPromedio(personal));

    }
}
