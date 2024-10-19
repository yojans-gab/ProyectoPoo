
package ProyectoBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class ConexionBD {
    //Atibutos
    private static final String URL = "jdbc:mysql://localhost:3306/BDAromaGuatemalteco";
    private static final String USER = "root";
    private static final String PASSWORD = "1905";
    
    //Metodos

    //Metodo conectar a base de datos
    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            //  System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }// fin conectar()
    
    //Metodo Para verificar existencia del codigo
    public static boolean productoExiste(String codigoProducto) {
        String query = "SELECT COUNT(*) FROM producto WHERE codigoProducto = ?";
        try (Connection con = ConexionBD.conectar(); PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, codigoProducto);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;  // Si el resultado es mayor a 0, el producto existe
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar el código del producto: " + e.getMessage());
        }
        return false;  // Si no se encontró el producto o hubo un error
    } // fin metodo
    
    public static void insertarProducto(String codigo,String nombre, double precio, int cantidad, String fecha) {
        String query = "INSERT INTO producto (codigoProducto, nombreProducto, precioProducto, cantidadProducto, fechaVencimiento) VALUES (?,?, ?, ?, ?)";
        try (Connection con = ConexionBD.conectar(); PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, codigo);
            pst.setString(2, nombre);
            pst.setDouble(3, precio);
            pst.setInt(4, cantidad);
            pst.setDate(5, java.sql.Date.valueOf(fecha));
            pst.executeUpdate();
            System.out.println("Producto insertado correctamente");
        } catch (SQLException e) {
        }
    }// fin insertarProducto()
    
    //Metodo Busar Producto
    public static void buscarProductos(String codigo) {
        String query = "SELECT * FROM producto WHERE codigoProducto = ?";  
        try (Connection con = ConexionBD.conectar(); 
             PreparedStatement ps = con.prepareStatement(query)) { // Usamos PreparedStatement

            ps.setString(1, codigo); // Asignamos el valor del código al primer "?"

            try (ResultSet rs = ps.executeQuery()) {  // Ejecutamos la consulta
                boolean hayResultados = false;
                while (rs.next()) {
                    hayResultados = true; 
                    System.out.println("Código: " + rs.getString("codigoProducto"));
                    System.out.println("Nombre: " + rs.getString("nombreProducto"));
                    System.out.println("Precio: " + rs.getDouble("precioProducto"));
                    System.out.println("Cantidad: " + rs.getInt("cantidadProducto"));
                    System.out.println("Fecha de Vencimiento: " + rs.getDate("fechaVencimiento"));
                    System.out.println("");
                }
                if (!hayResultados) {
                    System.out.println("No hay productos disponibles con el código: " + codigo);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el producto: " + e.getMessage());
        }
    }// fin del metodo

    //Metodo para mostrar productos 
    public static void listarProductos() {
        String query = "select * from producto;";  
        try (Connection con = ConexionBD.conectar(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery(query)) {
            boolean hayResultados = false;
            while (rs.next()) {
                hayResultados = true; 
                System.out.println("Código: " + rs.getString("codigoProducto"));
                System.out.println("Nombre: " + rs.getString("nombreProducto"));
                System.out.println("Precio: " + rs.getDouble("precioProducto"));
                System.out.println("Cantidad: " + rs.getInt("cantidadProducto"));
                System.out.println("Fecha de Vencimiento: " + rs.getDate("fechaVencimiento"));     
                System.out.println("");
            }
            if (!hayResultados) {
                System.out.println("No hay productos disponibles.");
            }//fin if

        } catch (SQLException e) {

        }//fin catch
    }// fin listarProductos()
    
    //Metodo para actualizar
    public static void actualizarProducto(String codigoProducto, String nombre, double precio) {
        String query = "UPDATE producto SET nombreProducto = ?, precioProducto = ? WHERE codigoProducto = ?";
        try (Connection con = ConexionBD.conectar(); PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, nombre);
            pst.setDouble(2, precio);
            pst.setString(3, codigoProducto);
            pst.executeUpdate();
            System.out.println("Producto actualizado correctamente");
        } catch (SQLException e) {
        }
    }// fin actualizarProducto
    
    //Metodo para eliminar un producto 
    public static void eliminarProducto(String codigoProducto) {
        String query = "DELETE FROM producto WHERE codigoProducto = ?";
        try (Connection con = ConexionBD.conectar(); PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, codigoProducto);
            pst.executeUpdate();
            System.out.println("Producto eliminado correctamente");
        } catch (SQLException e) {
            //e.printStackTrace();
        }
    }// fin eliminarProducto
    
    //METODO MAIN
    public static void main(String[] args) {
        
        int opcion=0, cant;
        String cod, nom, fecha;
        double prec;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("**********************************************");
            System.out.println("**************Bienvenido al Menu**************");
            System.out.println("**********************************************");
            System.out.println("1......... Ingresar producto");
            System.out.println("2......... Mostrar productos");
            System.out.println("3......... Buscar productos");
            System.out.println("4......... Modificar productos");
            System.out.println("5......... Eliminar productos");
            System.out.println("6......... Salir del menu principal");
            System.out.println("Escriba la funcion a realizar");
            System.out.print("--> ");
            opcion=teclado.nextInt();
            System.out.println("");
            switch (opcion) {
               case 1:
                    teclado.nextLine();
                    System.out.print("Ingrese el código del producto: ");
                    cod = teclado.nextLine();
                    System.out.println("");

                    if (productoExiste(cod)) {
                        System.out.println("El producto con el código " + cod + " ya existe.");
                    } else {
                        System.out.println("Ingrese el nombre del producto");
                        nom = teclado.nextLine();
                        System.out.println("Ingrese el precio del producto");
                        prec = teclado.nextDouble();
                        System.out.println("Ingrese la cantidad del producto");
                        cant = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Ingrese la fecha de vencimiento del producto");
                        fecha = teclado.nextLine();
                        insertarProducto(cod, nom, prec, cant, fecha);
                    }
                   break;
               case 2:
                   listarProductos(); 
                   break;
               case 3:
                   teclado.nextLine();
                   System.out.print("Ingrese el código del producto a buscar: ");
                   cod = teclado.nextLine();
                   System.out.println("");
                   if (productoExiste(cod)) {
                        buscarProductos(cod);
                    } else {
                        System.out.println("El producto con el código " + cod + " no existe.");
                    }
                   break;
               case 4:
                    teclado.nextLine();
                    System.out.print("Ingrese el código del producto a actualizar: ");
                    cod = teclado.nextLine();
                    System.out.println("");

                    if (productoExiste(cod)) {
                        System.out.println("Ingrese el nuevo nombre del producto");
                        nom = teclado.nextLine();
                        System.out.println("Ingrese el nuevo precio del producto");
                        prec = teclado.nextDouble();
                        actualizarProducto(cod, nom, prec);
                    } else {
                        System.out.println("El producto con el código " + cod + " no existe.");
                    }
                   break;
               case 5:
                   teclado.nextLine();
                   System.out.print("Ingrese el código del producto a eliminar: ");
                   cod = teclado.nextLine();
                   System.out.println("");
                   if (productoExiste(cod)) {
                        eliminarProducto(cod);
                    } else {
                        System.out.println("El producto con el código " + cod + " no existe.");
                    }
                   break;
               case 6:
                   System.out.println("Saliendo del programa...");
                   break;
               default:
                   System.out.println("Opción no válida, por favor elija una opción entre 1 y 6.");
                   break;
            }
            System.out.println("******************************************************************");
            System.out.println("");
        }while(opcion<6);
    }
    
}
