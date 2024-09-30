
package PaqueteMetodos;


import javax.swing.JOptionPane;


public class CLEJ6 {
    private int numero1, numero2;
    private int suma, resta, multiplicacion;
    private float division;
    
   public void Suma(){
       numero1=Integer.parseInt(JOptionPane.showInputDialog("SUMA\n "+"\n"+"Ingrese el primero numero"));
       numero2=Integer.parseInt(JOptionPane.showInputDialog("SUMA\n "+"\n"+"Ingrese el segundo numero"));
       suma=numero1+numero2;
       JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma);
   } 
   
   public void Resta(){
       numero1=Integer.parseInt(JOptionPane.showInputDialog("RESTA\n "+"\n"+"Ingrese el primero numero"));
       numero2=Integer.parseInt(JOptionPane.showInputDialog("RESTA\n "+"\n"+"Ingrese el segundo numero"));
       resta=numero1-numero2;
       JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resta);
   }
   public void Mutiplicacion(){
       numero1=Integer.parseInt(JOptionPane.showInputDialog("MULTIPLICACION\n "+"\n"+"Ingrese el primero numero"));
       numero2=Integer.parseInt(JOptionPane.showInputDialog("MULTIPLICACION\n "+"\n"+"Ingrese el segundo numero"));
       multiplicacion=numero1*numero2;
       JOptionPane.showMessageDialog(null, "El resultado de la multiplicaion es: " + multiplicacion);
   }
   
   public void Division(){
       numero1=Integer.parseInt(JOptionPane.showInputDialog("DIVICION\n "+"\n"+"Ingrese el primero numero"));
       numero2=Integer.parseInt(JOptionPane.showInputDialog("DIVICION\n "+"\n"+"Ingrese el segundo numero"));
       while(numero2==0){
           JOptionPane.showMessageDialog(null,"                 ¡ERROR!\n" + "El divisor no puede ser cero ");
           numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero diferente de cero"));
       }
       division=numero1/numero2;
       JOptionPane.showMessageDialog(null,"El resultado de la division es: " + division);
    }
 
   
    public static void main(String[] args) {
        CLEJ6 invocar;
        invocar = new CLEJ6();
        invocar.Suma();
        invocar.Resta();
        invocar.Mutiplicacion();
        invocar.Division(); 
    }
}
