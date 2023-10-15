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
public class Exercicio7 {
    public static void main(String[] args){
        // Inicio 
        System.out.println("\n---------- CALCULO DE HORAS EM JOGO ----------\n");
        
        // Instancia a Classe Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as Horas: ");
        int horas = sc.nextInt();
        System.out.println("\nDigite os Minutos: ");
        int minutos = sc.nextInt();
        sc.close(); // Fecha o Scanner
        
        // Declaração Horas Totais
        int horasTotais = 24;
        // Faz o Calculo
        if(minutos < horas){
            horasTotais = horasTotais - horas + minutos;
            System.out.println("\nO JOGO DUROU " + horasTotais + " HORA(S)");
        }else if(minutos == horas){
            System.out.println("\nO JOGO DUROU 24 HORA(S)");
        }else{
            horasTotais = minutos - horas;
            System.out.println("\nO JOGO DUROU " + horasTotais + " HORA(S)");
        }
    }
}
