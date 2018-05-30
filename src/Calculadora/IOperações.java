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
public interface IOperações  {
    abstract String operação(String num1);
    abstract String operação(String num1, String num2);
    abstract boolean binaria();
}
