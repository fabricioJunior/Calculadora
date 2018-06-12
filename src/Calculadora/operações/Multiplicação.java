/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora.operações;

import Calculadora.Operações;

/**
 * Classe responspavel pela operação binária de multiplicação
 *
 * @author Fabricio Junior
 */
public class Multiplicação extends Operações {

    /**
     * Construro padrão onde são definidos a operação como binaria e o nome (*
     * Multiplicação)
     */
    public Multiplicação() {
        super("* Multiplicação", true);
    }

    /**
     * Efetua uma operação de multiplicação num1 * num2
     *
     * @param num1 String com valor númerico
     * @param num2 String com valor númerico
     * @return resultado da multiplicação(num1 * num2)
     */
    @Override
    public String operação(String num1, String num2) {
        float n1 = Float.parseFloat(num1);
        float n2 = Float.parseFloat(num2);
        return String.valueOf(n1 * n2);
    }

}
