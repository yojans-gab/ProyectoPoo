
package PaqueteMetodos;

import javax.swing.JOptionPane;


public class CLEJ7 {

public static void sumar() {
        int numero1, numero2, resultado;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Suma\nIngrese primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Suma\nIngrese segundo número: "));
        resultado = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
    }

    public static void restar() {
        int numero1, numero2, resultado;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Resta\nIngrese primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Resta\nIngrese segundo número: "));
        resultado = numero1 - numero2;
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resultado);
    }

    public static void multiplicacion() {
        int numero1, numero2, resultado;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Multiplicación\nIngrese primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Multiplicación\nIngrese segundo número: "));
        resultado = numero1 * numero2;
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + resultado);
    }

    public static void dividir() {
        int numero1, numero2, resultado;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("División\nIngrese primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("División\nIngrese segundo número: "));
        
        while (numero2 == 0) {
            JOptionPane.showMessageDialog(null, "Error. No se puede dividir por cero.");
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un divisor diferente de cero: "));
        }
        
        resultado = numero1 / numero2;
        JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultado);
    }

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menú de Opciones\n\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n\n"
                    + "Seleccione una opción:"
            ));
            
            switch (opcion) {
                case 1: {
                    sumar();
                    break;
                }
                case 2: {
                    restar();
                    break;
                }
                case 3: {
                    multiplicacion();
                    break;
                }
                case 4: {
                    dividir();
                    break;
                }
                case 5: {
                    JOptionPane.showMessageDialog(null, "Saliendo de la calculadora.");
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
                }
            }
        } while (opcion != 5);
    }
}//fin clase Calculadora

    

