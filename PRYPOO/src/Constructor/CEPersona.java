
package Constructor;

public class CEPersona {
    String nombre;
    String apellido;
    int edad;
    float altura;
    Double peso;

    public CEPersona(){
        nombre="Desconocido";
        edad=0;
        altura=0.00f;
        peso=0.00; 
    }
    public CEPersona(String vlnombre,int vledad, float vlaltura, double vlpeso){
        nombre = vlnombre;
        edad=vledad;
        altura=vlaltura;
        peso=vlpeso; 
    }
    public CEPersona(String nombre, String apellido,int edad, float altura, double peso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "CEPersona{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    public String toSring2(){
        return "CEPersona{" + "nombre=" + nombre +", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }

    public static void main(String[] args) {
        CEPersona ObjPersona1 = new CEPersona();
        CEPersona ObjPersona2 = new CEPersona("Haroldo Turcios",50,1.67f,3.6);
        CEPersona ObjPersona3 = new CEPersona("Yojans","Melendez",21,1.69f,58.4);
        System.out.println(ObjPersona2.toString());
        System.out.println(ObjPersona3.toSring2());
    }
}
