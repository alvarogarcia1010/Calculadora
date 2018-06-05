/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author UCA
 */
public class Interfaz extends JFrame{
    private JTextField num1, num2, num3;
    private JButton sumar, restar, dividir, multiplicar, convertir;
    
    
    public Interfaz(){
        super("Titulo de la ventana");
        //initComponet();
    }
    
//        public void initComponet(){
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(null);
//        
//        caja1 = new JTextField("");
//        caja1.setBounds(10, 10, 30, 30);
//        
//        caja2 = new JTextField("");
//        caja2.setBounds(50, 10, 30, 30);
//        
//        caja3 = new JTextField("");
//        caja3.setBounds(100, 10, 30, 30);
//        
//        suma = new JButton("Suma");
//        suma.setBounds(10, 60, 120, 30);
//        
//        resta = new JButton("Resta");
//        resta.setBounds(10, 100, 120, 30);
//        
//        multiplicacion = new JButton("Multiplicación");
//        multiplicacion.setBounds(10, 140, 120, 30);
//        
//        division = new JButton("División");
//        division.setBounds(10, 180, 120, 30);
//        
//        binario = new JButton("Binario");
//        binario.setBounds(10, 220, 120, 30);
//        
//        Container contenedor = getContentPane();
//        
//        contenedor.add(caja1);
//        contenedor.add(caja3);
//        contenedor.add(suma);
//        contenedor.add(resta);
//        contenedor.add(multiplicacion);
//        contenedor.add(binario);
//        contenedor.add(division);
//        contenedor.add(caja2);
//        
//        suma.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                calc = FactoryProducer.getOperacion("OPERACION");
//                JOptionPane.showMessageDialog(null, "La suma es "+calc.getArtimetica("SUMA").operar(Double.parseDouble(caja1.getText()), Double.parseDouble(caja2.getText())));
//            } 
//        });
}
