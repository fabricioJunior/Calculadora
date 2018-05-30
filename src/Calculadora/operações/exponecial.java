/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora.operações;

import Calculadora.IOperações;
import Calculadora.Operações;

/**
 *
 * @author Fabricio Junior
 */
public class exponecial extends Operações implements IOperações  {

    public exponecial() {
        binaria = true;
        nome = "** Exponencial";
    }

    @Override
    public String operação(String num1, String num2) {
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        return String.valueOf(Math.pow(n1, n2));
    }

    @Override
    public String operação(String num1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
