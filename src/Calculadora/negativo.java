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
public class negativo extends Operações {
    
    public negativo(){
       binaria = false; 
    }
    @Override
    public float operação(float num1){
       return num1 * -1 ;
    }
     
}
