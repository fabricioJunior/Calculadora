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
public class fatorial extends Operações {

    public fatorial() {
        binaria = false;
    }

    @Override
    public String operação(Object num1) {
        long retorno = 1;
        int n1 = (int) num1;
        for (int x = 1; x < n1; x++) {
            retorno = retorno * x;
        }
        return String.valueOf(retorno);
    }

    @Override
    public String toString() {
        return "! Fatorial";
    }
}
