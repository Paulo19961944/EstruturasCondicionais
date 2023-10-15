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
public class Exercicio5 {
    public static void main(String[] args){
        // Instancia a Classe Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEntrada:");
        int numero = sc.nextInt();
        sc.close();
        
        // Verifica se o Número é Par ou Impar
        if(numero %2 == 0){
            System.out.println("\nSaída:\nPAR");
        } else{
            System.out.println("\nSaída:\nIMPAR");
        }
    }
}
