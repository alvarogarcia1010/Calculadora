/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Conversor.Conversor;
import Operaciones.*;
import calcu.OperationType;

/**
 *
 * @author UCA
 */
public class FactoryOperacion implements AbstractFactory {

    @Override
    public Operaciones getOperacion(OperationType type) {
        switch (type) {
            case SUMA:
                return new Suma();
            case RESTA:
                return new Resta();
            case MULTIPLICACION:
                return new Multiplicacion();
            case DIVISION:
                return new Division();
        }
        return null;    
    }

    @Override
    public Conversor getConversor(OperationType type) {
        return null;
    }


    
}
