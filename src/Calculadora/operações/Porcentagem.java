package Calculadora.operações;

import Calculadora.Operações;

/**
 * Classe responsável pela operação de porcentagem
 *
 * @author Fabricio Junior
 */
public class Porcentagem extends Operações {

    /**
     * Construto padrão onde é definida a operação como não binaria e o nome(%
     * Porcentagem)
     */
    public Porcentagem() {
        super("% Porcentagem", false);
    }

    /**
     * Procedimento que efetua o cálculo da porcetagem de um número(num1)
     *
     * @param num1 String com apenas um número qualquer
     * @return (num1 / 100)
     */
    @Override
    public String operação(String num1) {
        return String.valueOf(Float.parseFloat(num1) / 100);
    }
}
