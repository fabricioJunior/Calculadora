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
public class exponecial extends Operações {
     public exponecial(){
       binaria = false;
    }
    @Override 
    public long operação(int num1){
       long retorno = 1;
       for(int x = 1; x < num1; x++){
           retorno = retorno * x;
       }
       return retorno;
    }
    @Override
    public String toString(){
      return "! Fatorial";
    }
}
