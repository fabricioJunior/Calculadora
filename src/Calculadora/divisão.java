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
public class divisão extends Operações {
     public divisão(){
       binaria  = true;
    }
    @Override
    public float operação(float num1, float num2){
            return num1 / num2;
    }
    @Override 
    public String toString(){
        return "/ Divisão";
    }
}
