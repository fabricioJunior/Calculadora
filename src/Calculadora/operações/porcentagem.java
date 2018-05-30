package Calculadora.operações;

import Calculadora.IOperações;
import Calculadora.Operações;

/**
 *
 * @author Fabricio Junior
 */
public class porcentagem extends Operações implements IOperações{

    public porcentagem() {
        nome  = "% Porcentagem";
    }
    @Override
    public String operação(String num1) {
        return String.valueOf(Float.parseFloat(num1) / 100);
    }

    @Override
    public String operação(String num1, String num2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     @Override
    public boolean binaria() {
            return false;
    }
}
