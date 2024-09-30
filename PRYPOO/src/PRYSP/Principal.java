
package PRYSP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
    //Atributos
    private JMenuBar mb;
    private JMenu menuOpciones, Archivo, menuAcerca, menuColor;
    private JMenuItem Cerrar, Cafe, Azul, Verde, Creador, Salir, Nuevo;
    private JLabel lbLogo, lbBienvenido, lbTitulo, lbEmp, lbNombre, lbApellidoPa, lbApellidoMa, lbDepartamento, lbAntiguedad, lbResultado, lbInfo;
    private JTextField txtNombreT, txtApelPa, txtApelMa;
    private JComboBox cmbDepartamento, cmbAntiguedad;
    private JScrollPane ScrResult;
    private JTextArea Result;
    private JPanel panelP;
    private JButton BtnCalculo;
    String nombreAdmin="";
    
    //Metodos
    //Metodo Constructor
    public Principal() {
        setTitle("Pantalla principal");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Logo.png"));
        setIconImage(icon);
        
        //Crear el objeto que almacenara el nombre
        Int_Bienvenida capturarNombre = new Int_Bienvenida();
        nombreAdmin = capturarNombre.nombre; //Almacenar el valor de nombre en nombreAdmin mediante un objeto
    }
    
    public void ventana3(){
        setSize(800,690);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar ventana
        setLocationRelativeTo(null); //centrar ventana
    }
    
    protected void IComponentes(){
        //Panel
        panelP = new JPanel();
        panelP.setBackground(new Color(223, 208, 184));
        panelP.setLayout(null); //Desactivar diseño
        this.getContentPane().add(panelP);
                
       //MENUS
       //Menu Opciones
       mb = new JMenuBar(); //crear la barra
       mb.setBackground(new Color(223, 208, 184));
       setJMenuBar(mb);
       
       //Menu CERRAR
       Archivo = new JMenu("Archivo");
       Archivo.setBackground(new Color(255, 0, 0));
       Archivo.setFont(new Font("Berlin Sans FB Demi", 1, 18));
       Archivo.setForeground(new Color(44, 22, 14));
       mb.add(Archivo);
        
       Cerrar = new JMenuItem("Cerrar");
       Cerrar.setFont(new Font("Berlin Sans FB Demi", 1, 18));
       Cerrar.setForeground(new Color(44, 22, 14));
       Archivo.add(Cerrar);
       Cerrar.addActionListener(this);
       
       //Opciones del menu opciones
       menuOpciones = new JMenu("Opciones"); //Crear ele menu de opciones
       menuOpciones.setBackground(new Color(44, 22, 14));
       menuOpciones.setFont(new Font("Berlin Sans FB Demi", 1,18));
       menuOpciones.setForeground(new Color(44, 22, 14));
       mb.add(menuOpciones); //Se coloca dentro de la barra
       
       
        //Menu Color de fondo
        menuColor = new JMenu("Color de fondo"); //Menu de colores
        menuColor.setFont(new Font("Berlin Sans FB Demi", 1, 18));
        menuColor.setForeground(new Color(44, 22, 14));
        menuOpciones.add(menuColor); //Dentro del menu de opciones dentro de la barra
        
        //Colores 
        //Cafe
        Cafe = new JMenuItem("Cafe"); //Crear el item Rojo
        Cafe.setFont(new Font("Berlin Sans FB Demi", 1, 18));
        Cafe.setForeground(new Color(44, 22, 14));
        menuColor.add(Cafe); //Colocar dentro del menu de colores
        Cafe.addActionListener(this);
        
        //Azul
        Azul = new JMenuItem("Azul");
        Azul.setFont(new Font("Berlin Sans FB Demi", 1, 18));
        Azul.setForeground(new Color(6, 68, 105));
        menuColor.add(Azul);
        Azul.addActionListener(this);

        //Verde
        Verde = new JMenuItem("Verde");
        Verde.setFont(new Font("Berlin Sans FB Demi", 1, 18));
        Verde.setForeground(new Color(134, 142, 118));
        menuColor.add(Verde);
        Verde.addActionListener(this);

        //Opcion Nuevo
        Nuevo = new JMenuItem("Nuevo");
        Nuevo.setFont(new Font("Berlin Sans FB Demi", 1, 18));
        Nuevo.setForeground(new Color(44, 22, 14));
        menuOpciones.add(Nuevo);
        Nuevo.addActionListener(this);
        
        //Opcion Salir
        Salir = new JMenuItem("Salir");
        Salir.setFont(new Font("Berlin Sans FB Demi", 1, 18));
        Salir.setForeground(new Color(44, 22, 14));
        menuOpciones.add(Salir);    
        Salir.addActionListener(this);

       

        
        //Menu Acerca de
        menuAcerca = new JMenu("Acerca de");
        menuAcerca.setBackground(new Color(255, 0, 0));
        menuAcerca.setFont(new Font("Berlin Sans FB Demi", 1, 18));
        menuAcerca.setForeground(new Color(44, 22, 14));
        mb.add(menuAcerca);
        
        //Opcion creador de Acerca de
        Creador = new JMenuItem("El creador");
        Creador.setFont(new Font("Berlin Sans FB Demi", 1, 18));
        Creador.setForeground(new Color(44, 22, 14));
        menuAcerca.add(Creador);
        Creador.addActionListener(this);
        
       //Etiquetas 
        ImageIcon imagen = new ImageIcon(getClass().getResource("/Imagenes/Logo.png"));
        lbLogo = new JLabel(imagen);  
        lbLogo.setBounds(5,5,130,130);
        lbLogo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
        panelP.add(lbLogo);
       
        //BIENVENIDA
        lbBienvenido = new JLabel("Bienvenido " + nombreAdmin, SwingConstants.CENTER );  
        lbBienvenido.setBounds(20,80,680,50);
        lbBienvenido.setFont(new Font("Berlin Sans FB Demi", 1, 30));
        lbBienvenido.setForeground(new Color(255, 255, 255));
        panelP.add(lbBienvenido);
        
        lbEmp = new JLabel("Aroma Guatemalteco ", SwingConstants.CENTER); //Crear etiqueta y centrar
        lbEmp.setOpaque(true);
        lbEmp.setBounds(150, 20, 450, 60);
        lbEmp.setBackground(new Color(44, 22, 14));
        lbEmp.setForeground(new Color(252, 238, 212)); //Cambiar color a la Letra
        lbEmp.setFont(new Font("Berlin Sans FB Demi", Font.BOLD,33)); //Agregar una fuente al texto
        panelP.add(lbEmp);
        
        //TITULO
        lbTitulo = new JLabel("Datos del trabajador para el cálculo de vacaciones", SwingConstants.CENTER);
        lbTitulo.setBounds(50,145,650,35);
        lbTitulo.setFont(new Font("Berlin Sans FB Demi", 0, 24));
        lbTitulo.setOpaque(true);
        lbTitulo.setBackground(new Color(237, 226, 201));
        lbTitulo.setForeground(new Color(0, 0, 0));
        panelP.add(lbTitulo);

        
        //Labels y Texts de ingreso
        //Nombre completo
        lbNombre = new JLabel("Nombre completo:");
        lbNombre.setBounds(35,188,200,25);
        lbNombre.setFont(new Font("Berlin Sans FB Demi", 1, 19));
        lbNombre.setForeground(new Color(44, 22, 14));
        panelP.add(lbNombre);
        
        txtNombreT = new JTextField();
        txtNombreT.setBounds(35, 218, 230, 35);
        txtNombreT.setBackground(new Color(197,164,129));
        txtNombreT.setBorder(BorderFactory.createLineBorder(new Color(152, 113, 54), 2));
        txtNombreT.setForeground(new Color(41,23,13));
        txtNombreT.setFont(new Font("Berlin Sans FB Demi",3,16));
        panelP.add(txtNombreT);
              
        
        //Apellido Paterno
        lbApellidoPa = new JLabel("Apellido Paterno:");
        lbApellidoPa.setBounds(35,273,200,25);
        lbApellidoPa.setFont(new Font("Berlin Sans FB Demi", 1, 19));
        lbApellidoPa.setForeground(new Color(44, 22, 14));
        panelP.add(lbApellidoPa);

        txtApelPa = new JTextField();
        txtApelPa.setBounds(35,303,230,35);
        txtApelPa.setBackground(new Color(197,164,129));
        txtApelPa.setBorder(BorderFactory.createLineBorder(new Color(152, 113, 54), 2));
        txtApelPa.setForeground(new Color(41,23,13));
        txtApelPa.setFont(new Font("Berlin Sans FB Demi",3,16));
        panelP.add(txtApelPa);

        //Apellido Materno
        lbApellidoMa = new JLabel("Apellido Materno:");
        lbApellidoMa.setBounds(35,358,200,25);
        lbApellidoMa.setFont(new Font("Berlin Sans FB Demi", 1, 19));
        lbApellidoMa.setForeground(new Color(44, 22, 14));
        panelP.add(lbApellidoMa);

        txtApelMa = new JTextField();
        txtApelMa.setBounds(35,389,230,35);
        txtApelMa.setBackground(new Color(197,164,129));
        txtApelMa.setBorder(BorderFactory.createLineBorder(new Color(152, 113, 54), 2));
        txtApelMa.setForeground(new Color(41,23,13));
        txtApelMa.setFont(new Font("Berlin Sans FB Demi",3,16));
        panelP.add(txtApelMa);
        
        //Departamento
        lbDepartamento = new JLabel("Selecciona el Departamento:");
        lbDepartamento.setBounds(330,188,250,25);
        lbDepartamento.setFont(new Font("Berlin Sans FB Demi", 1, 19));
        lbDepartamento.setForeground(new Color(44, 22, 14));
        panelP.add(lbDepartamento);

        cmbDepartamento = new JComboBox(); //Crear un comboBox
        cmbDepartamento.setBounds(330,218,260,35);
        cmbDepartamento.setBackground(new Color(197,164,129));
        cmbDepartamento.setBorder(BorderFactory.createLineBorder(new Color(152, 113, 54), 2));
        cmbDepartamento.setForeground(new Color(41,23,13));
        cmbDepartamento.setFont(new Font("Berlin Sans FB Demi",3,16));
        panelP.add(cmbDepartamento);
        cmbDepartamento.addItem(""); // crear los items del combo box
        cmbDepartamento.addItem("Atención al Cliente");
        cmbDepartamento.addItem("Departamento de Logística");
        cmbDepartamento.addItem("Departamento de Gerencia");
        
        //Antiguedad
        lbAntiguedad = new JLabel("Selecciona la Antigüedad:");
        lbAntiguedad.setBounds(330,273,250,25);
        lbAntiguedad.setFont(new Font("Berlin Sans FB Demi", 1, 19));
        lbAntiguedad.setForeground(new Color(44, 22, 14));
        panelP.add(lbAntiguedad);

        cmbAntiguedad = new JComboBox();
        cmbAntiguedad.setBounds(330,303,260,35);
        cmbAntiguedad.setBackground(new Color(197,164,129));
        cmbAntiguedad.setBorder(BorderFactory.createLineBorder(new Color(152, 113, 54), 2));
        cmbAntiguedad.setForeground(new Color(41,23,13));
        cmbAntiguedad.setFont(new Font("Berlin Sans FB Demi",3,16));
        panelP.add(cmbAntiguedad);
        cmbAntiguedad.addItem(""); //Agregar los items de antiguedad
        cmbAntiguedad.addItem("1 año de servicio");
        cmbAntiguedad.addItem("2 a 6 años de servicio");
        cmbAntiguedad.addItem("7 años o más de servicio");


        //Area de Resultados
        lbResultado = new JLabel("Resultado del Cálculo:");
        lbResultado.setBounds(330,357,250,25);
        lbResultado.setFont(new Font("Berlin Sans FB Demi", 1, 19));
        lbResultado.setForeground(new Color(44, 22, 14));
        panelP.add(lbResultado);

        Result = new JTextArea();
        Result.setEditable(false);
        Result.setBackground(new Color(197,164,129));
        Result.setBorder(BorderFactory.createLineBorder(new Color(152, 113, 54), 2));
        Result.setForeground(new Color(41,23,13));
        Result.setFont(new Font("Berlin Sans FB Demi",3,14));
        Result.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
        ScrResult = new JScrollPane(Result);
        ScrResult.setBounds(330,389,400,90);
        panelP.add(ScrResult);   

        //Informacion
        lbInfo = new JLabel("@Aroma Guatemalteco, Yojans Gabriel Marroquín Melendez, Programación II A", SwingConstants.CENTER); 
        lbInfo.setBounds(15, 570, 690, 20); //Linea2
        lbInfo.setForeground(new Color(44, 22, 14)); //Linea1
        lbInfo.setFont(new Font("Serif", Font.BOLD,15)); //Linea1
        panelP.add(lbInfo); //Linea1
        
        //Boton
        BtnCalculo = new JButton("CALCULAR"); //Crear Boton
        BtnCalculo.setBounds(280, 510, 140, 40);
        //BtnIngresar.setMnemonic('a');// con alt + a sustituye el click
        BtnCalculo.setForeground(new Color(216, 178, 152));
        BtnCalculo.setFont(new Font("Berlin Sans FB Demi", Font.BOLD,20)); //Fuente al texto del boton
        BtnCalculo.setBackground(new Color(118, 50, 26));//color al boton
        BtnCalculo.setBorder(BorderFactory.createLineBorder(new Color(189, 147, 105), 3)); // Borde al botón
        panelP.add(BtnCalculo);
        //.setEnabled(false); bloquea el boton
        BtnCalculo.addActionListener(this);
    }
    
    //Eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BtnCalculo){
            String nombreTrabajador = txtNombreT.getText();
	    String AP = txtApelPa.getText(); //Obtener texto de las cajas de texto
	    String AM = txtApelMa.getText();
	    String Departamento = cmbDepartamento.getSelectedItem().toString(); ///Obtener la sellecion de los Items
	    String Antiguedad = cmbAntiguedad.getSelectedItem().toString();
            
            if(nombreTrabajador.equals("")||AP.equals("")||AM.equals("")||Departamento.equals("")||Antiguedad.equals("")){
                JOptionPane.showMessageDialog(null,"Debes de llenar todos los campos.");
            }
            else{
                if(Departamento.equals("Atención al Cliente")){

                    if(Antiguedad.equals("1 año de servicio")){
                            Result.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                              "\n   quien labora en " + Departamento + 
                                              "\n   con " + Antiguedad + 
                                              "\n   recibe 6 días de vacaciones.");
                    }
                    if(Antiguedad.equals("2 a 6 años de servicio")){
                            Result.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                              "\n   quien labora en " + Departamento + 
                                              "\n   con " + Antiguedad + 
                                              "\n   recibe 14 días de vacaciones.");
                    }
                    if(Antiguedad.equals("7 años o más de servicio")){
                            Result.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                              "\n   quien labora en " + Departamento + 
                                              "\n   con " + Antiguedad +  
                                              "\n   recibe 20 días de vacaciones.");
                    }

                }
	        if(Departamento.equals("Departamento de Logística")){

                    if(Antiguedad.equals("1 año de servicio")){
                            Result.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                              "\n   quien labora en " + Departamento + 
                                              "\n   con " + Antiguedad +  
                                              "\n   recibe 7 días de vacaciones.");
                    }
                    if(Antiguedad.equals("2 a 6 años de servicio")){
                            Result.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                              "\n   quien labora en " + Departamento + 
                                              "\n   con " + Antiguedad +  
                                              "\n   recibe 15 días de vacaciones.");
                    }
                    if(Antiguedad.equals("7 años o más de servicio")){
                            Result.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                              "\n   quien labora en " + Departamento + 
                                              "\n   con " + Antiguedad + 
                                              "\n   recibe 22 días de vacaciones.");
                    }
	    	}
	    	if(Departamento.equals("Departamento de Gerencia")){

                    if(Antiguedad.equals("1 año de servicio")){
                            Result.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                              "\n   quien labora en " + Departamento + 
                                              "\n   con " + Antiguedad +  
                                              "\n   recibe 10 días de vacaciones.");
                    }
                    if(Antiguedad.equals("2 a 6 años de servicio")){
                            Result.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                              "\n   quien labora en " + Departamento + 
                                              "\n   con " + Antiguedad +  
                                              "\n   recibe 20 días de vacaciones.");
                    }
                    if(Antiguedad.equals("7 años o más de servicio")){
                            Result.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                              "\n   quien labora en " + Departamento + 
                                              "\n   con " + Antiguedad +  
                                              "\n   recibe 30 días de vacaciones.");
                    }
                }

            }
        }
        if(e.getSource() == Cerrar){
            // Preguntar si desea cerrar el programa
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea cerrar el programa?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            // Si la respuesta es "Sí", cerrar el programa
            if (respuesta == JOptionPane.YES_OPTION) {
                System.exit(0); // Cerrar el programa
            }
        }
        
        if (e.getSource() == Cafe){
            panelP.setBackground(new Color(223, 208, 184)); //PANEL
            mb.setBackground(new Color(223, 208, 184)); //BARRA
            Archivo.setBackground(new Color(255, 0, 0)); //MENU ARCHIVO
            Archivo.setForeground(new Color(44, 22, 14));
            Cerrar.setForeground(new Color(44, 22, 14)); //ITEM CERRAR
            menuOpciones.setBackground(new Color(44, 22, 14)); //MENU OPCIONES
            menuOpciones.setForeground(new Color(44, 22, 14));
            menuColor.setForeground(new Color(44, 22, 14)); //MENU COLOR
            Cafe.setForeground(new Color(44, 22, 14));  //ITEMS COLORES
            Azul.setForeground(new Color(6, 68, 105));
            Verde.setForeground(new Color(134, 142, 118));
            Nuevo.setForeground(new Color(44, 22, 14)); //ITEM NUEVO
            Salir.setForeground(new Color(44, 22, 14)); //ITEM SALIR
            menuAcerca.setBackground(new Color(255, 0, 0)); //MENU ACERCA
            menuAcerca.setForeground(new Color(44, 22, 14));
            Creador.setForeground(new Color(44, 22, 14));  //ITEM CREADOR
            lbBienvenido.setForeground(new Color(255, 255, 255));//LABEL BIENBENIDO
            lbEmp.setBackground(new Color(44, 22, 14)); //AROMA GUATEMALTECO
            lbEmp.setForeground(new Color(252, 238, 212)); 
            lbTitulo.setBackground(new Color(237, 226, 201)); //TITULO 
            lbTitulo.setForeground(new Color(0, 0, 0));
            lbNombre.setForeground(new Color(44, 22, 14));  //NOMBRE
            txtNombreT.setBackground(new Color(197,164,129));
            txtNombreT.setBorder(BorderFactory.createLineBorder(new Color(152, 113, 54), 2));
            txtNombreT.setForeground(new Color(41,23,13));
            lbApellidoPa.setForeground(new Color(44, 22, 14));  //APELLIDO PATERNO
            txtApelPa.setBackground(new Color(197,164,129));
            txtApelPa.setBorder(BorderFactory.createLineBorder(new Color(152, 113, 54), 2));
            txtApelPa.setForeground(new Color(41,23,13));
            lbApellidoMa.setForeground(new Color(44, 22, 14)); //APELLIDO MATERNO
            txtApelMa.setBackground(new Color(197,164,129));
            txtApelMa.setBorder(BorderFactory.createLineBorder(new Color(152, 113, 54), 2));
            txtApelMa.setForeground(new Color(41,23,13));
            lbDepartamento.setForeground(new Color(44, 22, 14)); //DEPARTAMENTO
            cmbDepartamento.setBackground(new Color(197,164,129));
            cmbDepartamento.setBorder(BorderFactory.createLineBorder(new Color(152, 113, 54), 2));
            cmbDepartamento.setForeground(new Color(41,23,13));
            lbAntiguedad.setForeground(new Color(44, 22, 14)); //ANTIGUEDAD
            cmbAntiguedad.setBackground(new Color(197,164,129));
            cmbAntiguedad.setBorder(BorderFactory.createLineBorder(new Color(152, 113, 54), 2));
            cmbAntiguedad.setForeground(new Color(41,23,13));
            lbResultado.setForeground(new Color(44, 22, 14));   //RESULTADO
            Result.setBackground(new Color(197,164,129));
            Result.setBorder(BorderFactory.createLineBorder(new Color(152, 113, 54), 2));
            Result.setForeground(new Color(41,23,13));
            lbInfo.setForeground(new Color(44, 22, 14)); //INFORMACION
            BtnCalculo.setForeground(new Color(216, 178, 152)); //BOTON
            BtnCalculo.setBackground(new Color(118, 50, 26));
            BtnCalculo.setBorder(BorderFactory.createLineBorder(new Color(189, 147, 105), 3));
        }
        if (e.getSource() == Azul){
            panelP.setBackground(new Color(6, 68, 105)); // PANEL
            mb.setBackground(new Color(6, 68, 105)); // BARRA
            Archivo.setBackground(new Color(87, 144, 171)); // MENU ARCHIVO
            Archivo.setForeground(new Color(87, 144, 171));
            Cerrar.setForeground(new Color(6, 44, 67)); // ITEM CERRAR
            menuOpciones.setBackground(new Color(87, 144, 171)); // MENU OPCIONES
            menuOpciones.setForeground(new Color(87, 144, 171));
            menuColor.setForeground(new Color(6, 44, 67)); // MENU COLOR
            Cafe.setForeground(new Color(44, 22, 14)); // ITEMS COLORES
            Azul.setForeground(new Color(6, 44, 67));
            Verde.setForeground(new Color(134, 142, 118));
            Nuevo.setForeground(new Color(6, 44, 67)); // ITEM NUEVO
            Salir.setForeground(new Color(6, 44, 67)); // ITEM SALIR
            menuAcerca.setBackground(new Color(87, 144, 171)); // MENU ACERCA
            menuAcerca.setForeground(new Color(87, 144, 171));
            Creador.setForeground(new Color(6, 44, 67)); // ITEM CREADOR
            lbBienvenido.setForeground(new Color(87, 144, 171)); // LABEL BIENVENIDO
            lbEmp.setBackground(new Color(6, 44, 67)); // AROMA GUATEMALTECO
            lbEmp.setForeground(new Color(87, 144, 171));
            lbTitulo.setBackground(new Color(6, 68, 105)); // TITULO
            lbTitulo.setForeground(new Color(0, 0, 0));
            lbNombre.setForeground(new Color(87, 144, 171)); // NOMBRE
            txtNombreT.setBackground(new Color(87, 144, 171));
            txtNombreT.setBorder(BorderFactory.createLineBorder(new Color(6, 44, 67), 2));
            txtNombreT.setForeground(new Color(6, 44, 67));
            lbApellidoPa.setForeground(new Color(87, 144, 171)); // APELLIDO PATERNO
            txtApelPa.setBackground(new Color(87, 144, 171));
            txtApelPa.setBorder(BorderFactory.createLineBorder(new Color(6, 44, 67), 2));
            txtApelPa.setForeground(new Color(6, 44, 67));
            lbApellidoMa.setForeground(new Color(87, 144, 171)); // APELLIDO MATERNO
            txtApelMa.setBackground(new Color(87, 144, 171));
            txtApelMa.setBorder(BorderFactory.createLineBorder(new Color(6, 44, 67), 2));
            txtApelMa.setForeground(new Color(6, 44, 67));
            lbDepartamento.setForeground(new Color(87, 144, 171)); // DEPARTAMENTO
            cmbDepartamento.setBackground(new Color(87, 144, 171));
            cmbDepartamento.setBorder(BorderFactory.createLineBorder(new Color(6, 44, 67), 2));
            cmbDepartamento.setForeground(new Color(6, 44, 67));
            lbAntiguedad.setForeground(new Color(87, 144, 171)); // ANTIGÜEDAD
            cmbAntiguedad.setBackground(new Color(87, 144, 171));
            cmbAntiguedad.setBorder(BorderFactory.createLineBorder(new Color(6, 44, 67), 2));
            cmbAntiguedad.setForeground(new Color(6, 44, 67));
            lbResultado.setForeground(new Color(87, 144, 171)); // RESULTADO
            Result.setBackground(new Color(87, 144, 171));
            Result.setBorder(BorderFactory.createLineBorder(new Color(6, 44, 67), 2));
            Result.setForeground(new Color(6, 44, 67));
            lbInfo.setForeground(new Color(87, 144, 171)); // INFORMACIÓN
            BtnCalculo.setForeground(new Color(87, 144, 171)); // BOTÓN
            BtnCalculo.setBackground(new Color(6, 44, 67));
            BtnCalculo.setBorder(BorderFactory.createLineBorder(new Color(87, 144, 171), 3));        
        }
        if (e.getSource() == Verde){
            panelP.setBackground(new Color(134, 142, 118)); // PANEL
            mb.setBackground(new Color(134, 142, 118)); // BARRA
            Archivo.setBackground(new Color(243, 247, 248)); // MENU ARCHIVO
            Archivo.setForeground(new Color(243, 247, 248));
            Cerrar.setForeground(new Color(134, 142, 118)); // ITEM CERRAR
            menuOpciones.setBackground(new Color(243, 247, 248)); // MENU OPCIONES
            menuOpciones.setForeground(new Color(243, 247, 248));
            menuColor.setForeground(new Color(134, 142, 118)); // MENU COLOR
            Cafe.setForeground(new Color(44, 22, 14)); // ITEMS COLORES
            Azul.setForeground(new Color(6, 68, 105));
            Verde.setForeground(new Color(134, 142, 118));
            Nuevo.setForeground(new Color(134, 142, 118)); // ITEM NUEVO
            Salir.setForeground(new Color(134, 142, 118)); // ITEM SALIR
            menuAcerca.setBackground(new Color(243, 247, 248)); // MENU ACERCA
            menuAcerca.setForeground(new Color(243, 247, 248));
            Creador.setForeground(new Color(134, 142, 118)); // ITEM CREADOR
            lbBienvenido.setForeground(new Color(243, 247, 248)); // LABEL BIENVENIDO
            lbEmp.setBackground(new Color(134, 142, 118)); // AROMA GUATEMALTECO
            lbEmp.setForeground(new Color(211, 214, 197));
            lbTitulo.setBackground(new Color(211, 214, 197)); // TITULO
            lbTitulo.setForeground(new Color(0, 0, 0));
            lbNombre.setForeground(new Color(243, 247, 248)); // NOMBRE
            txtNombreT.setBackground(new Color(211, 214, 197));
            txtNombreT.setBorder(BorderFactory.createLineBorder(new Color(134, 142, 118), 2));
            txtNombreT.setForeground(new Color(134, 142, 118));
            lbApellidoPa.setForeground(new Color(243, 247, 248)); // APELLIDO PATERNO
            txtApelPa.setBackground(new Color(211, 214, 197));
            txtApelPa.setBorder(BorderFactory.createLineBorder(new Color(134, 142, 118), 2));
            txtApelPa.setForeground(new Color(134, 142, 118));
            lbApellidoMa.setForeground(new Color(243, 247, 248)); // APELLIDO MATERNO
            txtApelMa.setBackground(new Color(211, 214, 197));
            txtApelMa.setBorder(BorderFactory.createLineBorder(new Color(134, 142, 118), 2));
            txtApelMa.setForeground(new Color(134, 142, 118));
            lbDepartamento.setForeground(new Color(243, 247, 248)); // DEPARTAMENTO
            cmbDepartamento.setBackground(new Color(211, 214, 197));
            cmbDepartamento.setBorder(BorderFactory.createLineBorder(new Color(134, 142, 118), 2));
            cmbDepartamento.setForeground(new Color(134, 142, 118));
            lbAntiguedad.setForeground(new Color(243, 247, 248)); // ANTIGUEDAD
            cmbAntiguedad.setBackground(new Color(211, 214, 197));
            cmbAntiguedad.setBorder(BorderFactory.createLineBorder(new Color(134, 142, 118), 2));
            cmbAntiguedad.setForeground(new Color(134, 142, 118));
            lbResultado.setForeground(new Color(243, 247, 248)); // RESULTADO
            Result.setBackground(new Color(211, 214, 197));
            Result.setBorder(BorderFactory.createLineBorder(new Color(134, 142, 118), 2));
            Result.setForeground(new Color(134, 142, 118));
            lbInfo.setForeground(new Color(243, 247, 248)); // INFORMACION
            BtnCalculo.setForeground(new Color(243, 247, 248)); // BOTON
            BtnCalculo.setBackground(new Color(134, 142, 118));
            BtnCalculo.setBorder(BorderFactory.createLineBorder(new Color(211, 214, 197), 3));
        }
        if (e.getSource() == Nuevo){
            txtNombreT.setText("");
            txtApelPa.setText("");
            txtApelMa.setText("");
            cmbDepartamento.setSelectedIndex(0);
            cmbAntiguedad.setSelectedIndex(0);
            Result.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
        }
        if (e.getSource() == Salir){
            Int_Bienvenida formulario = new Int_Bienvenida();
            formulario.ventana();
            formulario.iniciarComponentes();
            formulario.setVisible(true);
            this.setVisible(false);
        }
        if (e.getSource() == Creador){
            JOptionPane.showMessageDialog(null, "Desarrollado por: \n\n"
                +"Nombre: Yojans Gabriel Marroquín Melendez\n"
                +"Carnet: 1990-23-11886\n"
                +"Curso: Programación II\n"
                +"Sección: A\n\n"
                +"@AROMA GUATEMALTECO");
        }
    }
    
    //Metodo Main
    public static void main(String[] args) {
        Principal formulario2 = new Principal();
        formulario2.ventana3();
        formulario2.IComponentes();
        formulario2.setVisible(true);
    }    
}
