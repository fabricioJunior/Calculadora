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
 * 
 * Classe que herda da classe Operações 
 */
public class Divisão extends Operações {

    public Divisão() {
        binaria = true;
        nome  = "/ Divisão";
    }
    @Override
    public String operação(String num1, String num2) {
        float n1 = Float.parseFloat(num1);
        float n2 = Float.parseFloat(num2);        
        return String.valueOf(n1 / n2);
    }   
}
