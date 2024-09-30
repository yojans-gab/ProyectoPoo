/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteMetodos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CLEJ2 {
    public void ingresarValor() {
        Scanner teclado=new Scanner(System.in);
        int valor,resultado;
        do {
            System.out.print("Ingrese valor:");
            valor=teclado.nextInt();
            if (valor!=-1) {
                resultado = calcular(valor);
                System.out.println("El cuadrado de: "+valor +" es: " +resultado);
            }
        } while (valor!=-1);
    }//fin metodo ingresarValor()
 
    public int calcular(int v) {
        return v * v; //calcula y retorna el resultado
    }//fin metodo calcular()
 
    public static void main(String[] ar) {
        CLEJ2 invocar;
        invocar=new CLEJ2();
        invocar.ingresarValor();
        }//fin metodo main()
}//fin método clase cuadrado    

