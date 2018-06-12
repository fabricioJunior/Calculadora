/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 * Classe genérica para definir operações matématicas
 *
 * @author Fabricio Junior
 */
public class Operações implements IOperações {

    /**
     * Variável responsável por armazena se a operação é binária ou não
     */
    public boolean binaria;
    /**
     * Variável responsável por armazena o nome da operação
     */
    public String nome;

    /**
     * Método destinado a ser sobrescrito para definir operação matématica não
     * binária
     *
     * @param num1
     * @return
     */
    @Override
    public String operação(String num1) {
        return null;
    }

    /**
     * Método destinado a ser sobrescrito para definir operação matématica
     * binária
     *
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public String operação(String num1, String num2) {
        return null;
    }

    /**
     * Método sobrescrito com a finalidade de retorna o nome para ser utilizado
     * em comboBox
     *
     * @return
     */
    @Override
    public String toString() {
        return nome;
    }

    /**
     * Método sobrescrito da interface com a finalidade de retorna se a operação
     * definida é binária ou não
     *
     * @return
     */
    @Override
    public boolean binaria() {
        return binaria;
    }
}
