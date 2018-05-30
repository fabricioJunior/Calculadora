package Calculadora.operações;

import Calculadora.Operações;

/**
 *
 * @author Fabricio Junior
 */
public class porcentagem extends Operações {

    public porcentagem() {
        binaria = false;
    }

    @Override
    public String operação(Object num1) {
        return String.valueOf(((float) num1) / 100);
    }

    @Override
    public String toString() {
        return "% Porcentagem";
    }
}
