
package PaqueteMain;

import Productos.Producto;
import Productos.Compra;
import Productos.Venta;
import javax.swing.JOptionPane;

public class ClaseCompraVenta {
   public static void main(String[] args) {
       int opcion=0;
     
        // Creando objetos productos
        Producto producto = new Producto();
        Producto producto2 = new Producto();
        
        //Datos iniciales para producto 1
        producto.setNombre("Laptop");
        producto.setPrecio(1000.00);
        producto.setStock(5);
        
        //Datos iniciales para producto 2
        producto2.setNombre("Smartphone");
        producto2.setPrecio(500.00);
        producto2.setStock(10);

        // Instanciando las clases Compra y Venta
        Compra compra = new Compra();
        Venta venta = new Venta();
        
         do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menú de Opciones\n\n"
                    + "1. Comprar producto\n"
                    + "2. Vender producto\n"
                    + "3. Modificar precio\n"
                    + "4. Salir\n\n"
                    + "Seleccione una opción:"
            ));

            switch (opcion) {
                case 1:
                    int cantidadCompra;
                    cantidadCompra=Integer.parseInt(JOptionPane.showInputDialog("Detalles del producto\n"+"Nombre: " + producto.getNombre()+"\n"
                    +"Precio: Q" + producto.getPrecio()+"\n"+"Stock disponible: " + producto.getStock()+"\n\n"+"Ingrese la cantidad que desea comprar"));
                    compra.realizarCompra(producto, cantidadCompra);
                    
                    break;

                case 2:
                    int cantidadVenta;
                    cantidadVenta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad cantidad a vender"));
                    venta.realizarVenta(producto, cantidadVenta);
                    break;

                case 3:
                    double nuevoPrecio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo precio del producto"));
                    producto.setPrecio(nuevoPrecio);
                    JOptionPane.showMessageDialog(null, "El precio ha sido actualizado a: Q" + nuevoPrecio);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 4);
    } 
}
