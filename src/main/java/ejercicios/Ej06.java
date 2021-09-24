/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author imad
 */
public class Ej06 {

    public static void main(String[] args) {

        //declaracion de variables 
        int variable1TipoInt = 19;
        float variable2TipoFloat = 223;
        float variableAuxiliar;
        //Imprimimos por pantalla los valores actuales
        System.out.println("Valor actual de la variable1: " + variable1TipoInt + "\n"
                + "valor actual de la variable2:" + variable2TipoFloat);
        //Hacemos el intercambio de las variables
        variableAuxiliar = variable1TipoInt;

        variable1TipoInt = (int) variable2TipoFloat;

        variable2TipoFloat = variableAuxiliar;
        
        //Imprimimos los valores despues de los intercambios
        System.out.println("Valor actual de la variable 1: " + variable1TipoInt + "\n"
                + "valor actual de la variable 2:" + variable2TipoFloat);

    }
}
