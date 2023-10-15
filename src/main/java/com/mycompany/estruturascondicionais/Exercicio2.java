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
public class Exercicio2 {
    public static void main(String[] args){
        // Instancia a Classe Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrada:");
        int diasSemana = sc.nextInt();
        
        // Fecha o Scanner
        sc.close();
        
        // Escolhe o Dia da Semana
        switch(diasSemana){
            case 1 -> System.out.println("\nSaída:\nDomingo");
            case 2 -> System.out.println("\nSaída:\nSegunda-Feira");
            case 3 -> System.out.println("\nSaída:\nTerça-Feira");
            case 4 -> System.out.println("\nSaída:\nQuarta-Feira");
            case 5 -> System.out.println("\nSaída:\nQuinta-Feira");
            case 6 -> System.out.println("\nSaída:\nSexta-Feira");
            case 7 -> System.out.println("\nSaída:\nSábado");
            default -> System.out.println("\nSaída:\nOpção Inválida");
        }
    }
}
