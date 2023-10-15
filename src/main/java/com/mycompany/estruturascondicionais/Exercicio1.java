/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturascondicionais;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author paulo
 */
public class Exercicio1 {

    public static void main(String[] args) {
        // Instancia a Classe Locale
        Locale.setDefault(Locale.US);
        
        // Instancia a Classe Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Captura os Dados
        System.out.println("\n---------- MINUTOS TELEFONIA ----------\n");
        System.out.println("Entrada:");
        int minutos = scanner.nextInt();
        
        // Fecha o Scanner
        scanner.close();
        
        // Captura as Variáveis
        float valorAPagar = 50.0f;
        int diferencaMinutos;
        float valorDiferencaMinutos = 2;
        float resultado;
        
        // Faz o Calculo
        if(minutos <=100){
            System.out.printf("\nSaída:\nValor a Pagar: %.2f", valorAPagar);
        } else{
            diferencaMinutos = minutos - 100;
            resultado = diferencaMinutos * valorDiferencaMinutos + valorAPagar;
            System.out.printf("\nSaída:\nValor a Pagar: %.2f", resultado);
        }
        System.out.println("\n\n---------- FIM ----------\n");
    }
}
