/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteModificadores;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Clase_Auxiliar {
    public static void main(String[] args) {
        String nombrePersona;
        
        nombrePersona=JOptionPane.showInputDialog("Ingrese el nombre");
        
        
        Clase_Privada invocar = new Clase_Privada();
        //invocar.setNombrePersona(nombrePersona);
        //Al ser private un atributo o metodo solo funciona en la misma clase, no se puede usar en otra clase
        
       // JOptionPane.showMessageDialog(null, invocar.getNombrePersona());
        
    }
   
}
