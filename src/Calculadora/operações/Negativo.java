package Calculadora.operações;

import Calculadora.Operações;

/**
 * Classe responsável pela operação de subtração
 *
 * @author Fabricio Junior
 */
public class Negativo extends Operações {

    /**
     * Construto padrão onde é definida a operação não binaria e o nome(-
     * Negativo)
     */
    public Negativo() {
        super("- Negativo", false);
    }

    /**
     * Procedimento que determina o negativo de um número(num1)
     *
     * @param num1 String com um número qualquer
     * @return String com o negativo de num1(num1 * - 1)
     */
    @Override
    public String operação(String num1) {
        return String.valueOf(Float.parseFloat(num1) * -1);
    }
}
