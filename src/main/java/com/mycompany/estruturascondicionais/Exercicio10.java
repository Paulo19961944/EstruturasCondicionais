/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturascondicionais; // Importa o Pacote
import java.util.Scanner; // Importa a Classe Scanner
import java.util.Locale; // Importa a Classe Locale

/**
 *
 * @author paulo
 */
public class Exercicio10 {
    // Método Main
    public static void main(String[] args){
        // Instancia a Classe Locale
        Locale.setDefault(Locale.US); // Simula o Teclado Americano
        
        // Instancia a Classe Scanner
        System.out.println("\n---------- PLANO CARTESIANO ----------\n"); // Titulo
        Scanner sc = new Scanner(System.in); // Define a Classe Scanner
        System.out.println("\nEntrada:"); // Captura os Dados de Entrada
        float x = sc.nextFloat(); // Captura o X do Plano Cartesiano
        float y = sc.nextFloat(); // Captura o Y do Plano Cartesiano
        sc.close(); // Fecha o Scanner
        
        // Verifica onde está no Plano Cartesiano
        if(x > 0 && y > 0){
            System.out.println("\nSaída:\nQ1"); // Caso o X e Y sejam positivos, define o quadro Q1
            
        }else if(x < 0 && y > 0 ){
            System.out.println("\nSaída:\nQ2"); /* Caso o X seja negativo e Y seja positivo, 
                                                     define o quadro Q2*/
        }else if(x < 0 && y < 0 ){
            System.out.println("\nSaída:\nQ3"); // Caso o X e Y sejam negativos, define o quadro Q3
            
        }else if(x > 0 && y < 0){
            System.out.println("\nSaída:\nQ4"); /* Caso o X seja positivo e Y seja negativo, 
                                                     define o quadro Q4*/
        }else{
            System.out.println("\nSaída:\nOrigem"); // Caso X e Y sejam 0, define como origem
        }
    }
}
