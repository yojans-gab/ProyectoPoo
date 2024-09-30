
package Productos;

import javax.swing.JOptionPane;


public class Compra {
     public void realizarCompra(Producto producto, int cantidad) {
        double total;
        if (producto.getStock() >= cantidad) {
            producto.ajustarStock(-cantidad); // Reducción del stock después de la compra
            total=cantidad*producto.getPrecio();
            JOptionPane.showMessageDialog(null, "Compra realizada: "+"\nHa comprado " + cantidad + " " + producto.getNombre()+"\n"+
                    "Cantidad Gastada: Q. "+total);
        } else {
            JOptionPane.showMessageDialog(null, "Stock insuficiente para comprar " + cantidad + " unidades.");
        }
    } 
}
