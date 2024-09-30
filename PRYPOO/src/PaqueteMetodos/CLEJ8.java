
package PaqueteMetodos;

import javax.swing.JOptionPane;


public class CLEJ8 {
    private String nombre;
    private int edad;

    public CLEJ8(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public static CLEJ8 comparar(CLEJ8 empleado1, CLEJ8 empleado2){
        if(empleado1.edad>=empleado2.edad)
            return empleado1;
        else
            return empleado2;
    }
    
    public static void main(String[] args) {
        String nombre1, nombre2;
        int edad1, edad2;
        
        nombre1=JOptionPane.showInputDialog("Empleado #1\n" + "Ingrese el nombre del primer empleado");
        edad1=Integer.parseInt(JOptionPane.showInputDialog("Empleado #1\n"+"Ingrese la edad del primer empleado"));
        nombre2=JOptionPane.showInputDialog("Empleado #2\n" + "Ingrese el nombre del segundo empleado");
        edad2=Integer.parseInt(JOptionPane.showInputDialog("Empleado #2\n"+"Ingrese la edad del segundo empleado"));
        
        CLEJ8 empleado1 = new CLEJ8(nombre1, edad1);
        CLEJ8 empleado2 = new CLEJ8(nombre2, edad2);
        
        CLEJ8 mayor = CLEJ8.comparar(empleado1, empleado2);
        
        JOptionPane.showMessageDialog(null,"El empleado con mayor edad es: " + mayor.nombre + " con " + mayor.edad + " años");
    }
}
