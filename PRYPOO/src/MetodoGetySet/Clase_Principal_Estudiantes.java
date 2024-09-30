
package MetodoGetySet;

import javax.swing.JOptionPane;



public class Clase_Principal_Estudiantes {
    public static void main(String[] args) {
        //crear un  arreglo
        
        Clase_Estudiante[] estudiante = new Clase_Estudiante[10];
        
        for (int i = 0; i < estudiante.length; i++) {
            estudiante[i] = new Clase_Estudiante();
            estudiante[i].setNombre(JOptionPane.showInputDialog("Estudiante #"+(i+1)+"\n"+"Ingrese el Nombre: "));
            estudiante[i].setEdad(Integer.parseInt(JOptionPane.showInputDialog("Estudiante #"+(i+1)+"\n"+"Ingrese la Edad: ")));
            estudiante[i].setGenero(JOptionPane.showInputDialog("Estudiante #"+(i+1)+"\n"+"Ingrese el Genero(M/F): ").charAt(0));
            estudiante[i].setPromedio(Float.parseFloat(JOptionPane.showInputDialog("Estudiante #"+(i+1)+"\n"+"Ingrese el Promedio: ")));
            estudiante[i].setAprobado(Boolean.parseBoolean(JOptionPane.showInputDialog("Estudiante #"+(i+1)+"\n"+"¿Ha aprobado?(True/False): ")));
        }
        
        for (int i = 0; i < estudiante.length; i++) {
            JOptionPane.showMessageDialog(null,"Estudiante #"+(i+1)+ "\n"
            + "Nombre del Estudiante: " + estudiante[i].getNombre() + "\n"
            + "Edad del Estudiante: " + estudiante[i].getEdad() + " años\n"
            + "Genero del Estudiante: " + estudiante[i].getGenero() + "\n"
            + "Promedio del Estudiante: " + estudiante[i].getPromedio() + "\n"
            + "¿El estudiante aprobo?: " + estudiante[i].isAprobado());      
        }
    }
}
