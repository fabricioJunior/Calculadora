/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 * Interface responsável por fazer o relacionamento das operações entre as diversas classes destinada a operações 
 * @author Fabricio Junior
 */
public interface IOperações  {
    /**
     * Método destinado a retorna o resultao em forma de String de  uma operação matématica não binária 
     * @param num1
     * @return 
     */
    abstract String operação(String num1);
    /**
     * Sobrecarga do método operação para operações matématicas binárias 
     * @param num1
     * @param num2
     * @return 
     */
    abstract String operação(String num1, String num2);
    /**
     * Método responsável por dizer se uma operação matématica qualquer é binaria ou não"(true ou false)"
     * @return "(true ou false)"
     */
    abstract boolean binaria();
}
