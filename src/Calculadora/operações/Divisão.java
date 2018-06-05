
package Calculadora.operações;

import Calculadora.Operações;

/**
 *  
 * @author Fabricio Junior
 * 
 * Classe responsável pelo método de divisão entre 2 números
 * e retorna um String no método toString para exibir em um comboBox a String "/ Divisão"
 */
public class Divisão extends Operações  {

    /**
     * Utilizado construto padrão para definir atributo herdado binaria com true e o nome da operação
     */
    public Divisão() {
        binaria = true;
        nome  = "/ Divisão";
    }
    /**
     * Função que retorna a divisão entre 2 números 
     * @param  num1 recebe um número que sera o dividendo 
     * @param  num2 recebe um número que sera  o divisor 
     * @return String com o resultado da divisão num1/num2
     */
    @Override
    public String operação(String num1, String num2) {
        float n1 = Float.parseFloat(num1);
        float n2 = Float.parseFloat(num2);        
        return String.valueOf(n1 / n2);
    }   
}
