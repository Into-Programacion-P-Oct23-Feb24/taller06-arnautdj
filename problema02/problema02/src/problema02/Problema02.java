/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese su nombre:");
        String name = entrada.nextLine();
        
        System.out.println("Ingrese el número:\n1, si su vehículo es liviano"
        + " particular\n2, si su vehículo es grande particular\n3, si su "
        + "vehículo es un taxi\n4, si su vehículo es un bus urbano");
        int type = entrada.nextInt();
        
        if (type >= 1 && type <= 4) {
        
            System.out.println("Ingrese el valor de su vehículo:");
            double valorCarro = entrada.nextDouble();
            
            double total=0;
            String typeText="Sin Tipo";
            
            switch(type){
                case 1:
                    total = valorCarro * 0.0001 + 2;
                    typeText = "Vehículo liviano particular";
                    break;
                case 2:
                    total = valorCarro * 0.0002 + 2.5;
                    typeText = "Vehículo grande particular";
                    break;
                case 3:
                    total = valorCarro * 0.0004 + 1.5;
                    typeText = "Taxi";
                    break;
                case 4:
                    total = valorCarro * 0.0005 + 2.2;
                    typeText = "Bus Urbano";
                    break;
            }
            
            System.out.printf("Peaje ''Buena vía''\nPropietario: %s\n"
            + "Tipo: %s\nValor: $%.2f\nPeaje: $%.2f",
                    name,
                    typeText,
                    valorCarro,
                    total);
            
        
        } else {
            System.out.println("Error:\nTipo de vehículo inválido");    
            } 

    }
    
}
