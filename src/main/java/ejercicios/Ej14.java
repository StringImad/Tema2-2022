/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Ej14 {

    public static void main(String[] args) {
        //Declaracion de variables
        int tiempoEnSegundos = 0;
        int horas, minutos, segundos;
        //Declaracion de objeto
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero de segundos");
        tiempoEnSegundos = teclado.nextInt();
        //3600 segundos hay en una hoora
        horas = tiempoEnSegundos/3600;
        //60 minutos hay en una hora
        minutos=(tiempoEnSegundos-(3600*horas))/60;
        segundos =tiempoEnSegundos-((horas*3600)+ (minutos*60));
        
        System.out.println("Horas: "+horas+" Minutos: "+minutos+" Segundos: "+segundos);
        
    }
}
