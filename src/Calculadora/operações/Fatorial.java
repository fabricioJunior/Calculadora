/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora.operações;

import Calculadora.Operações;

/**
 * Classe responsável pela operação não binária de fatorial 
 * @author Fabricio Junior
 */
public class Fatorial extends Operações {

    /**
     * Construto padrão para definir atributo operação como não binaria e o nome da operação(/ Divisão)
     */
    public Fatorial() {
        super("! Fatorial",false);
    }
    /**
     * Definindo operação não binaria que recebe um número qualquer e efetua a operação de fatorial
     * @param num1
     * @return fatorial de num1 
     */
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
