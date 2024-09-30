
package Calculadora;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*; //esto importa todo, remplaza e resto de importaciones

public class Calculadora extends JFrame implements ActionListener{ //extends es para extender una clase (heredar metodos y atributos)
    //Atributos
    private JLabel ETitulo,EResultado, Resultado;
    private JLabel ECantidad1,ECantidad2;
    private JTextField TxtCantidad1,TxtCantidad2;
    private JButton BtnSumar, BtnRestar,BtnMultiplicar,BtnDividir,BtnSalir;
    
    public void ingresar(){
        Font fuente = new Font("Arial", Font.BOLD,24);
        ETitulo = new JLabel("C a l c u l a d o r a");
        ETitulo.setBounds(150,15,500,20); //TamaÃ±o de etiqueta: CFAA
        add(ETitulo);//Agrega la etiqueta al formulario
        
        //Inicializar etiqueta ECantidad1
        ECantidad1 = new JLabel("Ingrese primera cantidad: ");
        ECantidad1.setBounds(50,50,150,20);
        add(ECantidad1);
        
        //Inicializar etiqueta ECantidad2
        ECantidad2 = new JLabel("Ingrese segunda cantidad: ");
        ECantidad2.setBounds(50,100,200,20);
        add(ECantidad2);
        
        Resultado = new JLabel("Resultado:");
        Resultado.setBounds(50,300,200,20);
        add(Resultado);
        
         
        //Caja de texto TxtCantidad1
        TxtCantidad1 = new  JTextField();
        TxtCantidad1.setBounds(200,50,150,20);
        add(TxtCantidad1);
             
        TxtCantidad2 = new  JTextField();
        TxtCantidad2.setBounds(200,100,150,20);
        add(TxtCantidad2);
        
        //Boton
        BtnSumar  = new  JButton("Sumar");
        BtnSumar.setBounds(50,150,100,20);
        add(BtnSumar);
        
        BtnRestar  = new  JButton("Restar");
        BtnRestar.setBounds(250,150,100,20);
        add(BtnRestar);
        
        BtnMultiplicar  = new  JButton("Multiplicar");
        BtnMultiplicar.setBounds(50,250,100,20);
        add(BtnMultiplicar);
        
        BtnDividir  = new  JButton("Dividir");
        BtnDividir.setBounds(250,250,100,20);
        add(BtnDividir);
        
        BtnSalir  = new  JButton("Salir");
        BtnSalir.setBounds(150,350,100,20);
        add(BtnSalir);
        
        BtnSumar.addActionListener(this);
        BtnRestar.addActionListener(this);
        BtnMultiplicar.addActionListener(this);
        BtnDividir.addActionListener(this);
        BtnSalir.addActionListener(this);
        
        //cierra el formulario
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==BtnSumar) {           
            int x1=Integer.parseInt(TxtCantidad1.getText());
            int x2=Integer.parseInt(TxtCantidad2.getText());
            int suma=x1+x2;
            String total=String.valueOf(suma);
            setTitle(total);
                           
           //resultado(total);
            
            EResultado = new JLabel(total);
            EResultado.setBounds(200,300,150,20);
            add(EResultado);
        }
        
        if (e.getSource()==BtnRestar) {           
            int x1=Integer.parseInt(TxtCantidad1.getText());
            int x2=Integer.parseInt(TxtCantidad2.getText());
            int resta=x1-x2;
            String total=String.valueOf(resta);
            setTitle(total);
                           
           //resultado(total);
            
            EResultado = new JLabel(total);
            EResultado.setBounds(200,300,150,20);
            add(EResultado);
        }
        
        if (e.getSource()==BtnMultiplicar) {           
            int x1=Integer.parseInt(TxtCantidad1.getText());
            int x2=Integer.parseInt(TxtCantidad2.getText());
            int multiplicar=x1*x2;
            String total=String.valueOf(multiplicar);
            setTitle(total);
                           
           //resultado(total);
            
            EResultado = new JLabel(total);
            EResultado.setBounds(200,300,150,20);
            add(EResultado);
        }
        
        if (e.getSource()==BtnDividir) {           
            int x1=Integer.parseInt(TxtCantidad1.getText());
            int x2=Integer.parseInt(TxtCantidad2.getText());
            int dividir=x1/x2;
            String total=String.valueOf(dividir);
            setTitle(total);
                           
           //resultado(total);
            
            EResultado = new JLabel(total);
            EResultado.setBounds(200,300,150,20);
            add(EResultado);
        }else if(e.getSource()== BtnSalir){
            System.exit(0);
        }
        
    }
    
    public static void main(String[] args) {
        
        
        Calculadora formulario = new Calculadora();
        int columna = 750;
        int fila = 300;
        int ancho = 430;
        int altura = 500;
        
        formulario.setBounds(columna, fila, ancho, altura);
        formulario.setLayout(null);
        formulario.ingresar();
        formulario.setVisible(true);
        
       
    } //fin metodo main
}// fin clase calculadora
