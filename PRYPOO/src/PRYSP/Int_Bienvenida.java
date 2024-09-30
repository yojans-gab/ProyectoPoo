
package PRYSP;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Int_Bienvenida extends JFrame implements ActionListener{
    //Atributos
    private JPanel panel, Barra;
    private JLabel Titulo1, Titulo2, ingNombre, info1, info2, logo, imgcafe;
    private JTextField Ingreso;
    private JButton BtnIngresar;
    public static String nombre = "";
    
    
    //METODOS
    //Metodo contructor
    
    public Int_Bienvenida(){
        setTitle("Bienvenido"); //Agregar Titulo a la ventana
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Logo.png")); //Crear el favicon
        setIconImage(icon); //mostrar el favicon
    }

    public void ventana() {
        //Crear ventana
        setSize(450, 600); //Definir dimeciones
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar ventana
        setLocationRelativeTo(null); //centrar ventana
    }
    
    protected void iniciarComponentes(){
        //Font fuente = new Font("Arial", Font.BOLD,23); //Objeto para la fuente
        
        //Panel
        panel = new JPanel(); //Creación de un panel
        panel.setBackground(new Color(223, 208, 184));
        panel.setLayout(null); //Desactivar el diseño
        this.getContentPane().add(panel); //Agregamos el panel a la ventana
        
        //Etiquetas
        Barra = new JPanel(); //Crear etiqueta y centrar
        Barra.setBounds(0, 10, 600, 80);
        Barra.setLayout(null);
        Barra.setBackground(new Color(201, 107, 60)); //Cambiar color a la Letra
        panel.add(Barra); //Agrega la etiqueta al panel
        
        Titulo1 = new JLabel("Aroma Guatemalteco ", SwingConstants.RIGHT); //Crear etiqueta y centrar
        Titulo1.setOpaque(true);
        Titulo1.setBounds(5, 5, 421, 70);
        Titulo1.setBackground(new Color(44, 22, 14));
        Titulo1.setForeground(new Color(252, 238, 212)); //Cambiar color a la Letra
        Titulo1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD,33)); //Agregar una fuente al texto
        Barra.add(Titulo1); //Agrega la etiqueta al panel
        
        Titulo2 = new JLabel("Sistema de Control Vacacional", SwingConstants.CENTER); //Crear etiqueta y centrar
        Titulo2.setBounds(10, 120, 400, 40);
        Titulo2.setOpaque(true);
        Titulo2.setBackground(new Color(237, 226, 201));
        Titulo2.setForeground(new Color(0, 0, 0)); //Cambiar color a la Letra
        Titulo2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD,26)); //Agregar una fuente al texto
        panel.add(Titulo2); //Agrega la etiqueta al panel
        
        ingNombre = new JLabel("Ingrese su Nombre", SwingConstants.RIGHT);
        ingNombre.setBounds(0, 270, 250, 30);
        ingNombre.setForeground(new Color(44, 22, 14));
        ingNombre.setFont(new Font("Berlin Sans FB Demi", Font.BOLD,25));
        panel.add(ingNombre);
        
        info1 = new JLabel("@Aroma Guatemalteco", SwingConstants.CENTER); //Linea1
        info2 = new JLabel("Yojans Gabriel Marroquín Melendez, Programación II A", SwingConstants.CENTER); //Linea2
        info1.setBounds(10, 500, 400, 25); //Linea1
        info2.setBounds(10, 520, 400, 25); //Linea2
        info1.setForeground(new Color(44, 22, 14)); //Linea1
        info2.setForeground(new Color(44, 22, 14)); //Linea2
        info1.setFont(new Font("Serif", Font.PLAIN,16)); //Linea1
        info2.setFont(new Font("Serif", Font.PLAIN,16)); //Linea2
        panel.add(info1); //Linea1
        panel.add(info2);//Linea2
        
        //Imagenes
        ImageIcon Ilogo = new ImageIcon(getClass().getResource("/Imagenes/Logo.png")); //Objeto Imagen, se obtiene imagen de la ruta SRC/Imagenes
        logo = new JLabel();// Etiqueta donde se encuentra la imagen
        logo.setBounds(0,-10,120,120);
        logo.setIcon(new ImageIcon(Ilogo.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        panel.add(logo);
        panel.setComponentZOrder(logo, 0); // El logo se coloca al frente (índice 0)
        
        ImageIcon cafe = new ImageIcon(getClass().getResource("/Imagenes/cafe.png")); //Objeto Imagen, se obtiene imagen de la ruta SRC/Imagenes
        imgcafe = new JLabel();// Etiqueta donde se encuentra la imagen
        imgcafe.setBounds(270,180,140,140);
        imgcafe.setIcon(new ImageIcon(cafe.getImage().getScaledInstance(140, 140, Image.SCALE_SMOOTH)));
        panel.add(imgcafe);
        
        
        //Entrada
        Ingreso = new JTextField(); //Crear Caja de texto
        Ingreso.setBounds(40, 330, 230, 50);
        Ingreso.setBackground(new Color(197,164,129));
        Ingreso.setBorder(BorderFactory.createLineBorder(new Color(152, 113, 54), 2));
        Ingreso.setForeground(new Color(41,23,13));
        Ingreso.setFont(new Font("Berlin Sans FB Demi",3,24));
        panel.add(Ingreso);
        
        //BOTON
        BtnIngresar = new JButton("INGRESAR"); //Crear Boton
        BtnIngresar.setBounds(260, 430, 140, 40);
        //BtnIngresar.setMnemonic('a');// con alt + a sustituye el click
        BtnIngresar.setForeground(new Color(216, 178, 152));
        BtnIngresar.setFont(new Font("Berlin Sans FB Demi", Font.BOLD,20)); //Fuente al texto del boton
        BtnIngresar.setBackground(new Color(118, 50, 26));//color al boton
        BtnIngresar.setBorder(BorderFactory.createLineBorder(new Color(189, 147, 105), 3)); // Borde al botón
        panel.add(BtnIngresar);
        //.setEnabled(false); bloquea el boton
        BtnIngresar.addActionListener(this); //LLamar al evento
        
      /*  //BOTON CON IMAGEN
        JButton boton2 = new JButton(); 
        boton2.setBounds(50,450,100,30);
        ImageIcon clicAqui = new ImageIcon(getClass().getResource("/Imagenes/descarga.jfif"));  //Se crea el objeto Imagen
        boton2.setIcon(new ImageIcon(clicAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH))); // Se le aplica al boton el objeto imagen, getWidh y get height se usan para obtener las dimensiones del boton y aplicarselo a la imagen
        panel.add(boton2);*/        
    }
    
    //Evento escucha 
     @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==BtnIngresar){
            nombre = Ingreso.getText().trim();
            if(nombre.isEmpty()) //isEmpty verifica si la cadena esta vacia
                JOptionPane.showMessageDialog(null, "Debe ingresar un nombre.");
            else{
                TerminosYCondiciones licencia = new TerminosYCondiciones();
                licencia.ventana2();
                licencia.Componentes();
                licencia.setVisible(true);
                this.setVisible(false);
            }
        }    
    }
    
    //Metodo Principal
    public static void main(String[] args) {
        Int_Bienvenida formulario = new Int_Bienvenida();
        formulario.ventana();
        formulario.iniciarComponentes();
        formulario.setVisible(true);
    }
}
