
package PaqueteModificadores;

import javax.swing.JOptionPane;


public class Modificadores {
   String nombreDeafult; // Java aplica el modificador por defecto por lo tanto solo es accesible desde el mismo paquete
   public String nombrePublico; // funciona en cualquier clase, sin importar si es otro paquete
   private String nombrePrivado; // solo funciona dentro de la misma clase
   protected String nombreProtegido; //Es accesible desde cualquier clase del mismo paquete o incluso otro paquete, pero protegiendo del acceso no autorizado

   // Utilizamos los metodos Set y Get para que el atributo privado pueda ser accesible para otra clase
    public String getNombrePrivado() {
        return nombrePrivado;
    }

    public void setNombrePrivado(String nombrePrivado) {
        this.nombrePrivado = nombrePrivado;
    }
   
    public static void main(String[] args) {
        Modificadores Objeto1 = new Modificadores();
        Objeto1.nombrePrivado=JOptionPane.showInputDialog("Ingrese el nombre privado: ");
        JOptionPane.showMessageDialog(null, "Nombre Privado: "+ Objeto1.nombrePrivado);
    }
}
