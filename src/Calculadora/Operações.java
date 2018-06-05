/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 * 
 * @author Fabricio Junior
 */
public  class Operações implements IOperações {

    public boolean binaria;
    public String nome;
   
    /**
     *
     * @param num1
     * @return
     */
    @Override
    public String operação(String num1){
      return null;
    }
    
    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public String operação(String num1, String num2){
      return null;
    }
    
    @Override 
    public String toString(){
        return nome;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean binaria(){
         return binaria;
    }
}
