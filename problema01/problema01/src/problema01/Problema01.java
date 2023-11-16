/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese la operación que desea realizar\n" + 
                "Sumar: +\nRestar: -\nMultiplicar: *\nDividir: /");
        String operacion = entrada.nextLine();
        
        System.out.println("Ingrese el primer número (este debe ser mayor"
        + " al segundo)");
        double num1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo número (este debe ser menor"
        + " al primero)");
        double num2 = entrada.nextInt();
        
        double respuesta=0;
        
        if (num1 > num2) {
        
            switch(operacion){
                case "+":
                    respuesta = num1 + num2;
                    break;
                case "-":
                    respuesta = num1 - num2;
                    break;
                case "*":
                    respuesta = num1 * num2;
                    break;
                case "/":
                    respuesta = num1 / num2;
                    break;   

                default:
                System.out.println("No se puede realizar la operación\n"
                        + "La operación ingresada no es válida");
                    break;

            }
        
        
        } else {
            System.out.println("No se puede realizar la operación\n"
                    + "El primer número debe ser mayor al segundo");
        }
        System.out.println("Respuesta: " + respuesta);
    }
}
