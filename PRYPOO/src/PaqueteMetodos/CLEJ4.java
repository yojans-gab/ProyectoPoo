
package PaqueteMetodos;

import javax.swing.JOptionPane;

public class CLEJ4 {
    public void ingreso(){
        int numero1, numero2, numero3;
        
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        numero3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));  
        
        if(numero1==numero2 && numero2==numero3 && numero1==numero3)
            JOptionPane.showMessageDialog(null,"Todos los numeros son iguales");
        else
            ordenar(numero1, numero2, numero3);
}
    public void ordenar(int num1, int num2,int num3){
        int temp1, temp2, temp3;
        if(num1<num2){
            temp1=num1;
            num1=num2;
            num2=temp1;
        }
        if(num1<num3){
            temp2=num1;
            num1=num3;
            num3=temp2;
        }
        if(num2<num3){
            temp3=num2;
            num2=num3;
            num3=temp3;
        }
        JOptionPane.showMessageDialog(null,"El numero mayor es: " + num1);
        JOptionPane.showMessageDialog(null,"El numero menor es: " + num3);
        
    }
    
    public static void main(String[] args) {  
        CLEJ4 invocar;
        invocar=new CLEJ4();
        invocar.ingreso();
    }
}
