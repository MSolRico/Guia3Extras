/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

public class Ejercicio1 {
    public static void main(String[] args){
    int dias, horas, num;
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        
        dias = num/1440;
        horas = num/60 - dias*24;
        System.out.println("Su equivalente es igual a "+dias+ " dias, " +horas+ " horas.");
    }
}
