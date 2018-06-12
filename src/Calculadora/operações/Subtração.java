package Calculadora.operações;

import Calculadora.Operações;

/**
 * Classa responsável pela operação binária de subtração
 *
 * @author Fabricio Junior
 */
public class Subtração extends Operações {

    /**
     * Construto padrão onde a operação é definida como binária e o nome(-
     * Subtração)
     */
    public Subtração() {
        super("- Subtração", true);
    }

    /**
     * Procedimento que efetua a operação de sutração de num2 sobre num1
     *
     * @param num1 String com apenas caracteres númericos
     * @param num2 String com apenas caracteres númericos
     * @return a subtração de num2 sobre num1(num1 - num2)
     */
    @Override
    public String operação(String num1, String num2) {
        float n1 = Float.parseFloat(num1);
        float n2 = Float.parseFloat(num2);
        return String.valueOf(n1 - n2);
    }
}
