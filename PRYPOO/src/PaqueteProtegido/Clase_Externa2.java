
package PaqueteProtegido;
import PaqueteModificadores.Modificadores; //Importa la Clase Modificadores desde el paquete PaqueteModificadores
import javax.swing.JOptionPane;

public class Clase_Externa2 {
    
    public static void main(String[] args) {
        Modificadores objeto2 = new Modificadores();
        
        objeto2.nombrePublico=JOptionPane.showInputDialog("Ingrese nombre Publico ");
        objeto2.setNombrePrivado(JOptionPane.showInputDialog("Ingrese nombre Privado"));
        
        JOptionPane.showMessageDialog(null,"Nombre Publico: " + objeto2.nombrePublico);
        JOptionPane.showMessageDialog(null, "Nombre Privado usando set y get: "+ objeto2.getNombrePrivado());
    }
}
