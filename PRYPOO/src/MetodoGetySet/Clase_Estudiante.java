
package MetodoGetySet;

public class Clase_Estudiante {
    //Atributos
    String nombre;
    int edad;
    char genero;
    float promedio;
    boolean aprobado;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    public float getPromedio() {
        return promedio;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }
    
    
}
