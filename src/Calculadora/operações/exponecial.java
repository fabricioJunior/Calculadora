/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora.operações;

import Calculadora.Operações;

/**
 *
 * @author Fabricio Junior
 */
public class exponecial extends Operações {

    public exponecial() {
        binaria = true;
    }

    @Override
    public String operação(Object num1, Object num2) {
        double n1 = (double) num1;
        double n2 = (double) num2;
        return String.valueOf(Math.pow(n1, n2));
    }

    @Override
    public String toString() {
        return "** Exponencial";
    }
}
