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
public class fatorial extends Operações implements IOperações {

    public fatorial() {
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

    @Override
    public String operação(String num1, String num2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
