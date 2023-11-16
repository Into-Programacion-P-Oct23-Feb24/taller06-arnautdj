/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese su nombre:");
        String name = entrada.nextLine();
        
        System.out.println("Ingrese el número correspondiente al tipo de "
        + "empleado que es usted:");
        int type = entrada.nextInt();
        
        if (type >= 1) {
        
            System.out.println("Ingrese el valor de su sueldo:");
            double sueldo = entrada.nextDouble();

            double porcentaje = 0;
            double sueldoFinal = 0;

            switch (type) {
                case 1:
                    porcentaje = sueldo * 0.05;
                    sueldoFinal = sueldo + porcentaje;
                    break;
                case 2:
                    porcentaje = sueldo * 0.07;
                    sueldoFinal = sueldo + porcentaje;
                    break;
                case 3:
                    porcentaje = sueldo * 0.09;
                    sueldoFinal = sueldo + porcentaje;
                    break;
                case 4:
                    porcentaje = sueldo * 0.12;
                    sueldoFinal = sueldo + porcentaje;
                    break;      
                default:
                    porcentaje = sueldo * 0.15;
                    sueldoFinal = sueldo + porcentaje;;
                    break;
        
            }
            
            System.out.printf("Nombre: %s\nIncremento del sueldo: $%.2f\n"
                    + "Sueldo final: $%.2f", 
                    name, 
                    porcentaje, 
                    sueldoFinal);
            
        } else {
            
            System.out.println("Error:\nTipo de empleado inválido");
                
            }    
            
    }
    
}
