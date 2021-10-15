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
public class B {
    public static void main(String[] args) {
        char caracter = 0;
        Scanner teclado = new Scanner(System.in);
        caracter =teclado.next().charAt(0);  
        if (caracter>=48&&caracter<=57){
            System.out.println("Es un digito");
        }else if(caracter>=65&&caracter<=90){
            System.out.println("Letra mayuscula");
        }else if(caracter>=97&&caracter<=122){
            System.out.println("letra minus");
        }
    }
}
