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
        return Float.toString(entero);
    }
    
}
