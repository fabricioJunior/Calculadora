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
public class Operações {

    public boolean binaria;
    public String nome;
    
    @Override 
    public boolean equals(Object x){
         if(x instanceof Operações){
        Operações r = (Operações)x;
          if(nome == r.nome){
             return true;
          }
         } 
          return false;
    }
    @Override 
    public String toString(){
        return nome;
    }
    public boolean binaria(){
         return binaria;
    }
}
