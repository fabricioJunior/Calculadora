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
}
