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
public class Exercicio6 {
    public static void main(String[] args){
        // Instancia a Classe Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEntrada:");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        sc.close();
        
        // Verifica se o Número é Par ou Impar
        if(numero1 % numero2 == 0 || numero2 % numero1 == 0){
            System.out.println("\nSaída:\nSão Multiplos");
        }else{
            System.out.println("\nSaída:\nNão sao Multiplos");
        }
    }
}
