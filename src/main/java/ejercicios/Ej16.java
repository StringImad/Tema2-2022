/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author imad
 */
public class Ej16 {

    public static void main(String[] args) {
        boolean resultadoA;
        boolean resultadoB;

        boolean resultadoC;
        int a = 5, b = 3;
        boolean resultadoD;

        boolean resultadoE;
        resultadoA = 67 > 20 && 13 > 12;
        resultadoB = 10 <= 2 * 5 && 3 < 4 || !(8 > 7) && 3 * 2 <= 4 * 2 - 1;
        resultadoC = !(a > b && 2 * a <= b);
        resultadoD = a++ / 2 < b && (a++ / 2 > b || (a * 2 < b * 4));
        resultadoE = b++ > 3 || a + b <= 8 && !(a > b);

        System.out.println("resultadoA = "+resultadoA +" resultadoB = "+resultadoB+
                " resultadoC = "+resultadoC
               +" resultadoD = "+ resultadoD
               + " resultadoE = "+resultadoE);
    }
}
