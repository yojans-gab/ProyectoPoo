/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteModificadores;

import javax.swing.JOptionPane;


public class Clase_Privada {
   private String nombrePersona;
   
   public String getNombrePersona(){
       return nombrePersona;
   }

    private void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
   
    private void Ingresar(){
        nombrePersona=JOptionPane.showInputDialog("Ingrese el nombre");
        JOptionPane.showMessageDialog(null,nombrePersona);
    }
    
   
   public static void main(String[] args) {
      Clase_Privada invocar;
      invocar=new Clase_Privada();
   }
}
