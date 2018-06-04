/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora.operações;

import Calculadora.IOperações;
import Calculadora.Operações;
import java.text.DecimalFormat;

/**
 *
 * @author Fabricio Junior
 */
public class Fatorial extends Operações implements IOperações {

    public Fatorial() {
        binaria = false;
        nome = "! Fatorial";
    }

    @Override
    public String operação(String num1) {
        long retorno = 1;
        int n1 = (int) Float.parseFloat(num1);
        for (int x = 1; x <= n1; x++) {
            retorno = retorno * x;
        }
        return String.valueOf(retorno);
    }


}
