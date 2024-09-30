
package PRYSP;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TerminosYCondiciones extends JFrame implements ActionListener, ChangeListener{
    //Atributos
    private JLabel Titulo2, impNombre, img, lbAroma, lbCafe, logo;
    private JCheckBox aceptar;
    private JButton continuar, NoAceptar;
    private JScrollPane ScrTexto;
    private JTextArea Texto;
    private JPanel Panel, Barra;
    String NombreObtenido="";
    
    //METODOS
    //Metodo Contructor
    public TerminosYCondiciones() {
        setTitle("Licencia de uso");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Logo.png"));
        setIconImage(icon);
        
        //Crear un objeto
        Int_Bienvenida capturar = new Int_Bienvenida();
        NombreObtenido = capturar.nombre;
    }
    
     public void ventana2() {
        //Crear ventana
        setSize(750, 480); //Definir dimeciones
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar ventana
        setLocationRelativeTo(null); //centrar ventana
    }
    
    protected void Componentes(){
        //Panel
        Panel = new JPanel(); //Creación de un panel
        Panel.setBackground(new Color(223, 208, 184));
        Panel.setLayout(null); //Desactivar el diseño
        this.getContentPane().add(Panel);
        
        //ETIQUETAS
        //Titulo
        Barra = new JPanel(); //Crear etiqueta y centrar
        Barra.setBounds(0, 5, 750, 38);
        Barra.setLayout(null);
        Barra.setBackground(new Color(201, 107, 60)); //Cambiar color a la Letra
        Panel.add(Barra); //Agrega la etiqueta al panel
        
        Titulo2 = new JLabel("TÉRMINOS Y CONDICIONES", SwingConstants.CENTER);
        Titulo2.setBounds(5, 4, 720, 30);
        Titulo2.setOpaque(true);
        Titulo2.setBackground(new Color(44, 22, 14));
        Titulo2.setFont(new Font("Berlin Sans FB Demi", 1, 16));
        Titulo2.setForeground(new Color(252, 238, 212));
        Barra.add(Titulo2);
        
        //Texto Aroma 
        lbCafe = new JLabel("Cafetería");
        lbCafe.setBounds(470,350,130,20);
        lbCafe.setOpaque(true);
        lbCafe.setBackground(new Color(223, 208, 184));
        lbCafe.setFont(new Font("Forte", 1, 25));
        lbCafe.setForeground(new Color(44, 22, 14));
        Panel.add(lbCafe);
        
        lbAroma = new JLabel("Aroma Guatemalteco");
        lbAroma.setBounds(400,380,300,20);
        lbAroma.setOpaque(true);
        lbAroma.setBackground(new Color(223, 208, 184));
        lbAroma.setFont(new Font("Forte", 1, 25));
        lbAroma.setForeground(new Color(44, 22, 14));
        Panel.add(lbAroma);
        
        //Imagenes
        ImageIcon Imge = new ImageIcon(getClass().getResource("/Imagenes/Gcafe.png")); //Objeto Imagen, se obtiene imagen de la ruta SRC/Imagenes
        img = new JLabel();// Etiqueta donde se encuentra la imagen
        img.setBounds(605,260,200,200);
        img.setIcon(new ImageIcon(Imge.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH)));
        Panel.add(img);
        
        ImageIcon Ilogo = new ImageIcon(getClass().getResource("/Imagenes/Logo.png")); //Objeto Imagen, se obtiene imagen de la ruta SRC/Imagenes
        logo = new JLabel();// Etiqueta donde se encuentra la imagen
        logo.setBounds(30,-11,70,70);
        logo.setIcon(new ImageIcon(Ilogo.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        Panel.add(logo);
        Panel.setComponentZOrder(logo, 0); // El logo se coloca al frente (índice 0)
        
        //Area de Texto
        Texto = new JTextArea(); //Se crea el Objeto Area texto
        Texto.setEditable(false); // No permitir la edicion
        Texto.setFont(new Font("Andale Mono", 0, 11));
        Texto.setText("\n\n          TÉRMINOS Y CONDICIONES" +
              "\n\n            A.  PROHIBIDA LA VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE AROMA GUATEMALTECO." +
              "\n            B.  PROHIBIDA LA ALTERACIÓN DEL DISEÑO, LOGOTIPO O MARCAS RELACIONADAS." +
              "\n            C.  AROMA GUATEMALTECO NO SE HACE RESPONSABLE DEL MAL USO DE SUS PRODUCTOS." +
              "\n\n          LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE NUESTROS PRODUCTOS" +
              "\n          AROMA GUATEMALTECO Y SUS REPRESENTANTES NO SE RESPONSABILIZAN POR EL USO INCORRECTO" + 
              "\n          O INDEBIDO DE LOS PRODUCTOS Y SERVICIOS ADQUIRIDOS." + 
              "\n\n          PARA ACEPTAR ESTOS TÉRMINOS, HAGA CLIC EN (ACEPTO)." +
              "\n          SI NO ACEPTA ESTOS TÉRMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE NUESTROS SERVICIOS." + 
              "\n\n          PARA MÁS INFORMACIÓN SOBRE NUESTROS PRODUCTOS, VISITE" + 
              "\n          http://www.aromaguatemalteco.com");  


        ScrTexto = new JScrollPane(Texto); // Se crea objeto scroll y contiene a el Area de texto
        ScrTexto.setBounds(15,45,690,275);
        Panel.add(ScrTexto);
        
        
        //ChexkBox
        aceptar = new JCheckBox("Yo " + NombreObtenido + " Acepto"); //Crear checkbox
        aceptar.setBounds(10, 330, 300, 40);
        aceptar.setFont(new Font("Berlin Sans FB Demi", Font.BOLD,20));
        aceptar.setBackground(new Color(223, 208, 184));
        aceptar.addChangeListener(this);
        Panel.add(aceptar);
        
        //Botones
        continuar = new JButton("Continuar");
        continuar.setBounds(10, 380, 120, 40);
        continuar.setFont(new Font("Berlin Sans FB Demi", Font.BOLD,20)); //Fuente al texto del boton
        continuar.setBackground(new Color(118, 50, 26));//color al boton
        continuar.setBorder(BorderFactory.createLineBorder(new Color(189, 147, 105), 3)); // Borde al botón
        continuar.setForeground(new Color(216, 178, 152));
        continuar.addActionListener(this);
        continuar.setEnabled(false);
        Panel.add(continuar);
        
        NoAceptar = new JButton("No Acepto");
        NoAceptar.setBounds(150, 380, 120, 40);
        NoAceptar.setFont(new Font("Berlin Sans FB Demi", Font.BOLD,20)); //Fuente al texto del boton
        NoAceptar.setBackground(new Color(118, 50, 26));//color al boton
        NoAceptar.setBorder(BorderFactory.createLineBorder(new Color(189, 147, 105), 3)); // Borde al botón
        NoAceptar.setForeground(new Color(216, 178, 152));
        NoAceptar.addActionListener(this);
        NoAceptar.setEnabled(true);
        Panel.add(NoAceptar);
    }
     
     @Override
    public void stateChanged(ChangeEvent ce) {
        if(aceptar.isSelected() == true){
            continuar.setEnabled(true);
            NoAceptar.setEnabled(false);
        }
        else{
           continuar.setEnabled(false);
           NoAceptar.setEnabled(true); 
        }
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == continuar){
            Principal formulario2 = new Principal();
            formulario2.ventana3();
            formulario2.IComponentes();
            formulario2.setVisible(true);
            this.setVisible(false);
        }
        else if(e.getSource() == NoAceptar){
           Int_Bienvenida formulario = new Int_Bienvenida();
            formulario.ventana();
            formulario.iniciarComponentes();
            formulario.setVisible(true); 
            this.setVisible(false);
        }
    }

    
    
    public static void main(String[] args) {
        TerminosYCondiciones licencia = new TerminosYCondiciones();
        licencia.ventana2();
        licencia.Componentes();
        licencia.setVisible(true);
    }
 
}
