/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturascondicionais;
import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Exercicio4 {
    public static void main(String[] args){
        // Instancia a Classe Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("\n---------- NUMEROS NEGATIVOS E NÃO NEGATIVOS ----------\n");
        System.out.println("\nEntrada:");
        int numero = sc.nextInt();
        
        // Fecha o Scanner
        sc.close();
        
        // Verifica se não é negativo
        if(numero >= 0){
            System.out.println("\nSaída:\nNAO NEGATIVO");
        }else{
            System.out.println("\nSaída:\nNEGATIVO");
        }
    }
}
