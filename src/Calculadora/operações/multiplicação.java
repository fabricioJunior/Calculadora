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
public class multiplicação extends Operações implements IOperações {

    public multiplicação() {
        binaria = true;
        nome = "* Multiplicação";
    }
    @Override
    public String operação(String num1, String num2) {
        float n1 =  Float.parseFloat(num1) ;
        float n2 = Float.parseFloat(num2);
        return String.valueOf(n1 * n2);
    }

}
