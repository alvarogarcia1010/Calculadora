/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversor;

/**
 *
 * @author UCA
 */
public class Binario implements Conversor {

    @Override
    public String getConversor(float entero) {
        String b = " ";
        try{
            if (entero >0){
                while ( entero > 0){
                    if (entero % 2 == 0){
                        b = "0" + b;
                    }else{
                        b = "1" + b;
                    }
                    entero = (int) entero/2;
                }
            }
            else if (entero == 0){
                b = "0";
            }
            else {
                b = "No se pudo convertir";
            }
        }catch(Exception e){
            b = "No se pudo convertir";
        }
        return b;
    } 
    
}
