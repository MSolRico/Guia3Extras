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
/* Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
    int num1,num2,resto,cociente;
        System.out.println("Ingrese dos numeros mayores de 1");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        resto = num1;
        cociente = 0;
        while (resto>=num2){
            resto = resto - num2;
            cociente++;
        }
        System.out.println("el residuo es " +resto+ " y el cociente es "+cociente+".");
    }
    
}
