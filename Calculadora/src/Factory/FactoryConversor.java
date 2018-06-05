/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Conversor.*;
import Operaciones.Operaciones;
import calcu.OperationType;

/**
 *
 * @author UCA
 */
public class FactoryConversor implements AbstractFactory{

    @Override
    public Operaciones getOperacion(OperationType type) {
        return null;
    }

    @Override
    public Conversor getConversor(OperationType type) {
        switch (type) {
            case BINARIO:
                return new Binario();
        }
        return null;
    }


}
