/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1ifstatement;
import java.util.Scanner;
/**
 *
 * @author erick_ss
 */
public class Practica1Ifstatement {

    public static void main(String[] args) {
        //TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        int numero;
        System.out.println(" Ingrese un numero ");
        numero = lectura.nextInt();
        
        if (numero % 2 == 0)
        {
            System.out.println(" El numero ingresado es par ");
        }    
        else
        {
            System.out.println(" El numero ingresado es impar ");
        }
        lectura.close();
    }
}
