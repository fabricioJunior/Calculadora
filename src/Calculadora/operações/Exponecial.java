/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora.operações;

import Calculadora.Operações;

/**
 *Classe responsável por fazer potência de um número 
 * @author Fabricio Junior
 */
public class Exponecial extends Operações  {

    /**
     *Construto sendo utilizado para definir os valores padrão dessa operação 
     */
    public Exponecial() {
        binaria = true;
        nome = "** Exponencial";
    }
    /**
    * 
    * efetua a operação de exponecial num1 ^ num2 
    * 
    * @param num1
    * recebe de valor a base da operação
    * @param num2
    * recebe o valor da potência da operação 
     * @return  String com o resultado da operação 
    *
     */
    @Override
    public String operação(String num1, String num2) {
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        return String.valueOf(Math.pow(n1, n2));
    }
}
