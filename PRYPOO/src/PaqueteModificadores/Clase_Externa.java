
package PaqueteModificadores;

import javax.swing.JOptionPane;


public class Clase_Externa {
    public static void main(String[] args) {
        Modificadores objeto1 = new Modificadores();
        
        objeto1.nombreDeafult = JOptionPane.showInputDialog("Ingrese el nombre por Dafault");
        objeto1.nombrePublico = JOptionPane.showInputDialog("Ingrese el nombre Publico");
        objeto1.nombreProtegido = JOptionPane.showInputDialog("Ingrese el nombre protegido");
        objeto1.setNombrePrivado(JOptionPane.showInputDialog("Ingrese el nombre Privado"));
        
        JOptionPane.showMessageDialog(null, "Default: " + objeto1.nombreDeafult);
        JOptionPane.showMessageDialog(null, "Publico: " + objeto1.nombrePublico);
        JOptionPane.showMessageDialog(null, "protegido: " + objeto1.nombreProtegido);
        JOptionPane.showMessageDialog(null, "Privado: " + objeto1.getNombrePrivado());
    }
}
