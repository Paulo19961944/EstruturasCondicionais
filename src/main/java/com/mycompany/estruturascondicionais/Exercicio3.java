/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturascondicionais;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author paulo
 */
public class Exercicio3 {
    public static void main(String[] args){
        // Instancia a Classe Locale
        Locale.setDefault(Locale.US);
        
        // Instancia a Classe Scanner
        Scanner sc = new Scanner(System.in);
        
        // Fecha o Scanner
        sc.close();
        
        // Captura o Preço
        System.out.println("--------- DESCONTO ----------");
        System.out.println("Entrada:");
        float preco = sc.nextFloat();
        
        // Verifica o Desconto
        float desconto = (float) ((preco <= 100.0)? preco * 0.2 : preco * 0.1);
        
        // Printa na Tela
        System.out.printf("\nSaída:\nO Desconto é de: %.2f$", desconto);
    }
}
