
package Constructor;

public class Persona {
   //Atributos
    String nombre;
    int edad;
    
    //Metodos
    
    //Metodo Constructor
    public Persona(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }
}
