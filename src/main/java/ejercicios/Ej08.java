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
public class Ej08 {

    public static void main(String[] args) {
        //Declaracion variables
        int a = 10, b = 5, i = 10;
        double c = 71.3, d = 4.8;

        int sumaEnteros = a + b;
        int restaEnteros = a - b;
        int multEnteros = a * b;
        int diviEnteros = a / b;

        double sumaDecimales = c + d;
        double restaDecimales = c - d;
        double multiDecimales = c * d;
        double diviDecimales = c / d;

        System.out.println("sumaEnteros " + sumaEnteros
                + " restaEnteros " + restaEnteros
                + " multEnteros " + multEnteros
                + " diviEnteros " + diviEnteros
                + " sumaDecimales " + sumaDecimales
                + " restaDecimales " + restaDecimales
                + " multiDecimales " + multiDecimales
                + " diviDecimales " + diviDecimales);

        System.out.println("a*=3 da " + (a *= 3) + " b-=1 da  " + (b -= 1) + " a/=b  da " + (a /= b) + "  c+=d da " + (c += d));
        System.out.println("valor de i " + i + " valor de i++ " + (i++) + " valor de ++i " + (++i));
    }

}
