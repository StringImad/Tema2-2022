/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author MSI
 */
public class Ej05 {

    public static void main(String[] args) {
        //Declaracion de variables primitivas  representan un único dato simple
        char variableCaracter;
        //Representan números enteros positivos y negativos con distintos rangos de valores
        byte variableEntero1;
        short variableEntero2;
        int variableEntero3;
        long variableEntero4;

        float variableDecimal1;
        double variableDecimal2;

        //para representar los valores lógicos verdadero y falso.
        boolean variableLogica;

        //declaracion de constantes, valores que una veZ declarados no vuelven a cambiar
        final int miAnyoNacimiento = 1999;
        final double dineroBAnco = 7323.32;

        //Declaracion objeto String
        String nombre;

        //Inicializamos las variables declaradas anteriormente
        variableEntero1 = 10;
        variableEntero2 = 400;
        variableEntero3 = -700;
        variableEntero4 = 23232323;

        variableDecimal1 = 9.8f;
        variableDecimal2 = 1232.5;
        variableCaracter = 0;
        nombre = "Imad";
        variableLogica = false;
        System.out.println(variableEntero1 + " Byte  8 bits");
        System.out.println(variableEntero2 + " short  16 bits");
        System.out.println(variableEntero3 + " int  32 bits");
        System.out.println(variableEntero4 + " long  64 bits");

        System.out.println(variableDecimal1 + " float  32 bits");
        System.out.println(variableDecimal2 + " double  64 bits");

        System.out.println(variableLogica + " boolean  1 bit");

        System.out.println(variableCaracter + " char  16 bits");

        System.out.println("'" + nombre + "' Es objeto tipo String");

    }
}
