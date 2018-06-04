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
public class Negativo extends Operações implements IOperações  {

    public Negativo() {
        binaria = false;
        nome = "- Negativo";
    }
    @Override
    public String operação(String num1) {
        return String.valueOf(Float.parseFloat(num1) * -1);
    }
}
