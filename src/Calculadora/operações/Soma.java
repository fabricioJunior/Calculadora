package Calculadora.operações;

import Calculadora.Operações;

/**
 * Classe responsável pela operação binária de soma
 *
 * @author Fabricio Junior
 */
public class Soma extends Operações {

    /**
     * Construto padrão de onde é definida a operação como binária e o nome(+
     * Soma)
     */
    public Soma() {
        super("+ Soma", true);
    }

    /**
     * Procedimento que efetua a soma de 2 números(num1 + num2)
     *
     * @param num1 String com apenas um caracteres númericos
     * @param num2 String com apenas um caracteres númericos
     * @return a soma de num1 com num2(num1 + num2)
     */
    @Override
    public String operação(String num1, String num2) {
        float n1 = Float.parseFloat(num1);
        float n2 = Float.parseFloat(num2);
        return String.valueOf(n1 + n2);
    }
}
