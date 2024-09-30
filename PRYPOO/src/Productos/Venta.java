
package Productos;

import javax.swing.JOptionPane;

public class Venta {
   public void realizarVenta(Producto producto, int cantidad) {
       double totalventa;
        producto.ajustarStock(cantidad); // Aumenta el stock después de una venta
        totalventa=cantidad*producto.getPrecio();
        JOptionPane.showMessageDialog(null, "Venta realizada: " + cantidad + " " + producto.getNombre()+"\n"+
                    "Cantidad recibida: Q. "+totalventa);
    } 
}
