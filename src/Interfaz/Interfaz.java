/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Factory.*;
import calcu.OperationType;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author UCA
 */
public class Interfaz extends JFrame{
    private JTextField num1, num2, num3;
    private JLabel label1, label2, label3;
    private JButton sumar, restar, dividir, multiplicar, convertir;
    private AbstractFactory operacion;
    
    
    public Interfaz(){
        super("Calculadora");
        initComponet();
    }
    
    public void initComponet(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        this.label1 = new JLabel("Numero 1");
        this.label1.setBounds(25,25,75,30);
        
        this.num1 = new JTextField("0");
        this.num1.setBounds(25,60,100,30);
        
        this.label2 = new JLabel("Numero 2");
        this.label2.setBounds(150,25,75,30);
        
        this.num2 = new JTextField("0");
        this.num2.setBounds(150,60,100,30);
            
        this.sumar = new JButton("Sumar");
        this.sumar.setBounds(25, 100, 100, 30);
        
        this.restar = new JButton("Restar");
        this.restar.setBounds(150, 100, 100, 30);
        
        this.multiplicar = new JButton("Multiplicar");
        this.multiplicar.setBounds(25, 140, 100, 30);
        
        this.dividir = new JButton("Dividir");
        this.dividir.setBounds(150, 140, 100, 30);
        
        this.num3 = new JTextField("0");
        this.num3.setBounds(25,200,100,30);
        
        this.convertir = new JButton("Convertir");
        this.convertir.setBounds(150, 200, 100, 30);
      
        Container contenedor = getContentPane();
        
        contenedor.add(this.num1);
        contenedor.add(this.num2);
        contenedor.add(this.num3);
        contenedor.add(this.label1);
        contenedor.add(this.label2);
        contenedor.add(this.sumar);
        contenedor.add(this.restar);
        contenedor.add(this.multiplicar);
        contenedor.add(this.convertir);
        contenedor.add(this.dividir);
     
        this.sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                operacion = FactoryProducer.getFactory(OperationType.OPERACION);
                try{
                    JOptionPane.showMessageDialog(null, "Resultado "+ operacion.getOperacion(OperationType.SUMA).getOperation(Float.parseFloat(num1.getText()), Float.parseFloat(num2.getText())));
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Datos invalidos");
                }            } 
        });
        
        this.restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                operacion = FactoryProducer.getFactory(OperationType.OPERACION);
                try{
                    JOptionPane.showMessageDialog(null, "Resultado "+ operacion.getOperacion(OperationType.RESTA).getOperation(Float.parseFloat(num1.getText()), Float.parseFloat(num2.getText())));
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Datos invalidos");
                }
            } 
        });

        this.multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                operacion = FactoryProducer.getFactory(OperationType.OPERACION);
                try{
                    JOptionPane.showMessageDialog(null, "Resultado "+ operacion.getOperacion(OperationType.MULTIPLICACION).getOperation(Float.parseFloat(num1.getText()), Float.parseFloat(num2.getText())));
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Datos invalidos");
                }            } 
        });
        
        this.dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                operacion = FactoryProducer.getFactory(OperationType.OPERACION);
                try{
                    JOptionPane.showMessageDialog(null, "Resultado "+ operacion.getOperacion(OperationType.DIVISION).getOperation(Float.parseFloat(num1.getText()), Float.parseFloat(num2.getText())));
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Datos invalidos");
                }            } 
        }); 
        
        this.convertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                operacion = FactoryProducer.getFactory(OperationType.CONVERSOR);
                try{
                    JOptionPane.showMessageDialog(null, "Resultado "+ operacion.getConversor(OperationType.BINARIO).getConversor(Float.parseFloat(num3.getText())));
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Datos invalidos");
                }            } 
        }); 
        

        setSize(300,300);
    }
    
        public static void main(String[] arg){
        //Para que la ventana este activa
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    Interfaz ventana = new Interfaz();
                    ventana.setVisible(true);

                }
            });
    }
}
