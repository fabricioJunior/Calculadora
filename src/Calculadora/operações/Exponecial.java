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
public class Exponecial extends Operações implements IOperações  {

    public Exponecial() {
        binaria = true;
        nome = "** Exponencial";
    }

    @Override
    public String operação(String num1, String num2) {
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        return String.valueOf(Math.pow(n1, n2));
    }
}
