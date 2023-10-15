/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturascondicionais; // Importa o Pacote
import java.util.Scanner; // Importa a Classe Scanner

/**
 *
 * @author paulo
 */
public class Exercicio9 {
    // Método Main
    public static void main(String[] args){
        // Instancia a Classe Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEntrada:"); // Indica para colocar um valor de entrada
        int numero = sc.nextInt(); // Captura um número
        sc.close(); // Fecha o Scanner
        
        // Verifica se o número está nos intervalos [0,25]
        if(numero >= 0 && numero <=25){
            System.out.println("\nSaída:\nIntervalo[0,25]"); // Printa na Tela se o Intervalo está entre 0 a 25
        }else if(numero > 25 && numero <=50){
            System.out.println("\nSaída:\nIntervalo(25,50]"); // Printa na Tela se o Intervalo está entre 25 a 50
        }else if(numero > 50 && numero <=75){
            System.out.println("\nSaída:\nIntervalo(50,75]"); // Printa na Tela se o Intervalo está entre 50 a 75
        }else if(numero > 75 && numero <=100){
            System.out.println("\nSaída:\nIntervalo(75,100]"); // Printa na Tela se o Intervalo está entre 75 a 100
        }else{
            System.out.println("\nSaída:\nFora de Intervalo"); // Printa na Tela Numero Fora de Intervalo
        }
    }
}
