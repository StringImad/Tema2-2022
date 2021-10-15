/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class A {
    public static void main(String[] args) {
        //Declaracion de variables
        int numero = 0;
        //Declaracion de objeto
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inroduce un numero");
        numero = teclado.nextInt();
        
        if(numero>0){
            
            System.out.println("Es positivo");
        }else if(numero==0){
            System.out.println("Este numero es 0");
        }else if(numero<0){
            System.out.println("Es negativo");
        }
        
    }
}
