package Calculadora;

/**
 * Classe genérica para definir operações matématicas que indiretamente
 * assinarão a interface IOperações
 *
 * @author Fabricio Junior
 */
public abstract class Operações implements IOperações {

    /**
     * Variável responsável por armazena se a operação é binária ou não
     */
    private final boolean binaria;
    /**
     * Variável responsável por armazena o nome da operação
     */
    private final String nome;

    /**
     * Construto que definira o nome da operação e se ela é binaria ou não
     *
     * @param nome String com o nome da operação
     * @param binaria booleano para definir se a operação é binaria ou não (true
     * ou false)
     */
    public Operações(String nome, boolean binaria) {
        this.binaria = binaria;
        this.nome = nome;
    }

    /**
     * Método destinado a ser sobrescrito para definir operação matématica não
     * binária
     *
     * @param num1 String que possui apenas caracteres númericos
     * @return resultado da operação em formato de String
     */
    @Override
    public String operação(String num1) {
        return null;
    }

    /**
     * Método destinado a ser sobrescrito para definir operação matématica
     * binária
     *
     * @param num1 String que possui apenas caracteres númericos
     * @param num2 String que possui apenas caracteres númericos
     * @return resultado da operação em formato de String
     */
    @Override
    public String operação(String num1, String num2) {
        return null;
    }

    /**
     * Método sobrescrito com a finalidade de retorna o nome para ser utilizado
     * em comboBox
     *
     * @return o nome da operação
     */
    @Override
    public String toString() {
        return nome;
    }

    /**
     * Método sobrescrito da interface com a finalidade de retorna se a operação
     * definida é binária ou não
     *
     * @return true caso a operação seja binária ou false caso a operação não
     * saja binária
     */
    @Override
    public boolean binaria() {
        return binaria;
    }

}
