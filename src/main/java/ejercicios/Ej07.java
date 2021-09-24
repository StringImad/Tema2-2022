/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author imad
 */
public class Ej07 {

    public static void main(String[] args) {
        // Declaro e inicializo tres variables int en la misma instrucción
        int a = 1, b = 2, c = 3;
        //Declaro e inicializo tres variables double en la misma instrucción
        double d = 4.5, e = 5.7, f = 6.9;

        // Muestro las variables en dos líneas, 
        //la primera línea muestra las variables tipo entero
        //y la segunda línea muestra las variables tipo double
        System.out.println("valores int: " + a + " " + b + " " + c);
        System.out.println("valores double: " + d + " " + e + " " + f);

        //Realizo los siguiente intercambios de valores: 
        //en b guardo c
        b = c;
        //en c guardo a
        c = a;
        //en a guardo b
        a = b;
        //Muestro por pantalla el resultado.
        System.out.println("valores int con intercambios: " + a + " " + b + " " + c);

    }
}
