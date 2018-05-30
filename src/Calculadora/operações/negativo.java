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
public class negativo extends Operações {

    public negativo() {
        binaria = false;
    }

    @Override
    public String operação(Object num1) {
        return String.valueOf(((float) num1) * -1);
    }

    @Override
    public String toString() {
        return "- Negativo";
    }
}
