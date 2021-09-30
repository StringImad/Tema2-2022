/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author imad
 */
public class Ej09 {

    public static void main(String[] args) {
        //Declaro e inicializo dos variables 
        int a = 10, b = 20;
        //Declaro cuatro variables booleanas.
        boolean variableBooleana1;
        boolean variableBooleana2;
        boolean variableBooleana3;
        boolean variableBooleana4;
        //Guardo, en las variables booleanas, el resultado de realizar las siguientes operaciones relacionales: a<b, a>b, a==b, a!=b.
        variableBooleana1 = a < b;
        variableBooleana2 = a > b;
        variableBooleana3 = a == b;
        variableBooleana4 = a != b;
        //Muestro en pantalla el resultado de las operaciones, usando las variables booleanas.
        System.out.println("a < b es " + variableBooleana1
                + "a > bes " + variableBooleana2
                + "a == b es " + variableBooleana3
                + "a != b es " + variableBooleana4);
    }
}
