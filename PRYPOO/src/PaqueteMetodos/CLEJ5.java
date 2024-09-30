
package PaqueteMetodos;


import javax.swing.JOptionPane;

public class CLEJ5 { 
    private String nombre;
    private float sueldo;
    
    public void ingresar(){     
        nombre=JOptionPane.showInputDialog("Ingrese su nombre: ");
        sueldo=Float.parseFloat(JOptionPane.showInputDialog("Ingrese su sueldo: "));
    }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null,"Nombre: " + nombre);
        JOptionPane.showMessageDialog(null, "Sueldo: Q. " + sueldo);
       
    }
    
    public void impuestos(){
        if(sueldo>3000){
            JOptionPane.showMessageDialog(null,nombre + " Debe pagar impuestos"); 
        }
        else 
            JOptionPane.showMessageDialog(null,nombre + " No debe pagar impuestos");
    }
    
    public static void main(String[] args) {
        CLEJ5 invocar;
        invocar=new CLEJ5();
        invocar.ingresar();
        invocar.mostrar();
        invocar.impuestos();        
    }
}
