
package MetodoGetySet;

import java.util.Scanner;

public class Personas_main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre1;
        int edad;
        float Estatura;
        char genero;
        double peso;
        boolean soltero;
     
        
        System.out.println("         Objetos de la clase personas");
        System.out.println("        -----------------------------");
        //Crear objeto persona 1: Yojans Marroquín
        Personas persona1 = new Personas();
        Personas persona2 = new Personas();
        Personas persona3 = new Personas();
        //Asignar datos al objeto persona 1 utilizando los metodos set de cada atributo
        System.out.print("--> Ingrese el nombre de persona1:   ");
        nombre1=teclado.nextLine();
        System.out.print("--> Ingrese la edad de persona1:     ");
        edad=teclado.nextInt();
        System.out.print("--> Ingrese la Estatura de persona1: ");
        Estatura=teclado.nextFloat();
        System.out.print("--> Ingrese el genero de persona1:   ");
        genero=teclado.next().charAt(0);
        System.out.print("--> Ingrese el peso de persona1:     ");
        peso=teclado.nextDouble();
        System.out.print("--> ¿Persona1 es soltero?:           ");
        soltero=teclado.nextBoolean();
       
        
        persona1.setNombrePersona(nombre1);
        persona1.setEdadPersona(edad);
        persona1.setEstaturaPersona(Estatura);
        persona1.setGeneroPersona(genero);
        persona1.setPesoPersona(peso);
        persona1.setSolteroPersona(soltero);   
        System.out.println("");
        
        System.out.println("===============================================================");
        System.out.println("Nombre del objeto persona1: ............... " + persona1.getNombrePersona());
        System.out.println("Edad del objeto persona1: .................." + persona1.getEdadPersona()+ "años"); 
        System.out.println("Estatura del objeto persona1: .............." + persona1.getEstaturaPersona());
        System.out.println("Genero del objeto persona1: ................" + persona1.getGeneroPersona());
        System.out.println("Peso del objeto persona1: .................." + persona1.getPesoPersona());
        System.out.println("El objeto persona1 es soltero: ............." + persona1.isSolteroPersona());
        System.out.println("==============================================================");
        System.out.println("");
        
         //Asignar datos al objeto persona 2 utilizando los metodos set de cada atributo
    /*    persona2.setNombrePersona("Gabriel Melendez");
        persona2.setEdadPersona(20);
        persona2.setEstaturaPersona(1.70f);
        persona2.setGeneroPersona('M');
        persona2.setPesoPersona(157.55);
        persona2.setSolteroPersona(true);   
        
        System.out.println("Nombre del objeto persona1: " + persona2.getNombrePersona());
        System.out.println("Edad del objeto persona1: " + persona2.getEdadPersona());
        System.out.println("Estatura del objeto persona1:" + persona2.getEstaturaPersona());
        System.out.println("Genero del objeto persona1: " + persona2.getGeneroPersona());
        System.out.println("Peso del objeto persona1: " + persona2.getPesoPersona());
        System.out.println("Estado civil del objeto persona1: " + persona2.isSolteroPersona());
        System.out.println("");
         //Asignar datos al objeto persona 1 utilizando los metodos set de cada atributo
        persona3.setNombrePersona("Stevan Marroquín");
        persona3.setEdadPersona(22);
        persona3.setEstaturaPersona(1.80f);
        persona3.setGeneroPersona('M');
        persona3.setPesoPersona(170.55);
        persona3.setSolteroPersona(false);   
        
        System.out.println("Nombre del objeto persona1: " + persona3.getNombrePersona());
        System.out.println("Edad del objeto persona1: " + persona3.getEdadPersona());
        System.out.println("Estatura del objeto persona1:" + persona3.getEstaturaPersona());
        System.out.println("Genero del objeto persona1: " + persona3.getGeneroPersona());
        System.out.println("Peso del objeto persona1: " + persona3.getPesoPersona());
        System.out.println("Estado civil del objeto persona1: " + persona3.isSolteroPersona());*/
    }
}
