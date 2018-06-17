/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import calcu.OperationType;

/**
 *
 * @author UCA
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(OperationType type){
        switch (type){
            case OPERACION:
                return  new FactoryOperacion();
            case CONVERSOR:
                return new FactoryConversor();
        }
        return null;
}
}
