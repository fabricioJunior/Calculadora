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
public abstract class Operações {

    public boolean binaria;
    public String nome;
    
    public String operação(String num1){
      return null;
    }
    public String operação(String num1, String num2){
      return null;
    }
    
    @Override 
    public String toString(){
        return nome;
    }
    public boolean binaria(){
         return binaria;
    }
}
