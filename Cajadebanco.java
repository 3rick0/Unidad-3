/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cajadebanco;
import java.util.Scanner;

/**
 *
 * @author erick_ss
 */
public class Cajadebanco {

    public static void main(String[] args) {
        System.out.println("Cajadebanco");
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000; //Saldo inicial
        
        while (true){
            System.out.println("Cajero automatico");
            System.out.println("Consultar saldo");
            System.out.println("Depositar dinero");
            System.out.println("Salir");
            System.out.println("Elegir opcion");
            
            int option = scanner.nextInt();
            
            switch (option){
                case 1:
                    System.out.println("Saldo actual: $"+ saldo);
                    break;
                    
                case 2:
                    System.out.println("Ingresar cantidad a depositar: $");
                    double cantidadDeposito = scanner.nextDouble();
                    if (cantidadDeposito > 0){
                        saldo += cantidadDeposito;
                        System.out.println("Deposito hecho. Saldo actual: $");
                    }else{
                        System.out.println("Ingresar cantidad para retirar: $");
                        double cantidadRetiro = scanner.nextDouble();
                        if (cantidadRetiro > 0){
                        saldo *= cantidadRetiro;
                        }
                    }
                    break;
                case 3:
                    System.out.println(" Gracias por usar el cajero automatico.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println(" Ingrese una opcion valida");
                    break;
                    
            }  
        }
    }
}
