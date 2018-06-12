package Calculadora.operações;

import Calculadora.Operações;

/**
 * Classe responsável pela operação binária de divisão
 *
 * @author Fabricio Junior
 */
public class Divisão extends Operações {

    /**
     * Construto padrão para definir atributo operação como binaria com true e o
     * nome da operação(/ Divisão)
     */
    public Divisão() {
        super("/ Divisão", true);
    }

    /**
     * Função que retorna a divisão entre 2 números
     *
     * @param num1 recebe um número que sera o dividendo
     * @param num2 recebe um número que sera o divisor
     * @return String com o resultado da divisão num1/num2
     */
    @Override
    public String operação(String num1, String num2) {
        float n1 = Float.parseFloat(num1);
        float n2 = Float.parseFloat(num2);
        return String.valueOf(n1 / n2);
    }
}
