package Calculadora.operações;

import Calculadora.IOperações;
import Calculadora.Operações;

/**
 *
 * @author Fabricio Junior
 */
public class Porcentagem extends Operações implements IOperações{

    public Porcentagem() {
        nome  = "% Porcentagem";
    }
    @Override
    public String operação(String num1) {
        return String.valueOf(Float.parseFloat(num1) / 100);
    }
}
