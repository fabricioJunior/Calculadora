package Calculadora;

/**
 * Interface responsável por fazer o relacionamento das operações entre as
 * diversas classes destinada a operações
 *
 * @author Fabricio Junior
 */
public interface IOperações {

    /**
     * Método destinado a retorna o resultao em forma de String de uma operação
     * matématica não binária
     *
     * @param num1 String que possui apenas caracteres númericos
     * @return resultado da operação que sera sobrescrita pelas classes que
     * assinarão essa interface
     */
    abstract String operação(String num1);

    /**
     * Sobrecarga do método operação para operações matématicas binárias
     *
     * @param num1 String que possui apenas caracteres númericos
     * @param num2 String que possui apenas caracteres númericos
     * @return resultado da operação que sera sobrescrita pelas classes que
     * assinarão essa interface
     */
    abstract String operação(String num1, String num2);

    /**
     * Método responsável por dizer se uma operação matématica qualquer é
     * binaria ou não"(true ou false)"
     *
     * @return "(true ou false)"
     */
    abstract boolean binaria();
}
