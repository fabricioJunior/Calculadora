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
public class subtração extends Operações {

    public subtração() {
        binaria = true;
    }

    @Override
    public String operação(Object num1, Object num2) {
        float n1 = (float) num1;
        float n2 = (float) num2;
        return String.valueOf(n1 - n2);
    }

    @Override
    public String toString() {
        return "- Subtração";
    }
}
