/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturascondicionais; // Importa o Pacote com.mycompany.estruturascondicionais
import java.util.Scanner; // Importa a Classe Scanner
/**
 *
 * @author paulo
 */
public class Exercicio8 {
    // Método Main
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Instancia a Classe Scanner
        System.out.println("\nEntrada"); // Seleciona os Dados de Entrada
        int codigo = sc.nextInt(); // Captura o Código do Produto
        int qtdeProduto = sc.nextInt(); // Captura a Quantidade do Produto
        sc.close(); // Fecha o Scanner
        
        // Seleciona o Preço dos Produtos
        final float precoHotDog = 4.00f; // Preço do Cachorro Quente
        final float precoXSalada = 4.50f; // Preço do X Salada
        final float precoXBacon = 5.00f; // Preço do X Bacon
        final float precoTorradaSimples = 2.00f; // Preço da Torrada Simples
        final float precoRefrigerante = 1.50f; // Preço do Refrigerante
        final float precoFinal; // Preço de Todos os Produtos
        
        // Seleciona o Produto
        switch(codigo){
            case 1: // Seleciona o Cachorro Quente
                precoFinal = precoHotDog * qtdeProduto; // Calcula o Preço do Cachorro Quente
                System.out.printf("\n\nSaída:\nTotal: %.2fR$", precoFinal); // Printa na Tela
                break; // Finaliza o Código
            
            case 2: // Seleciona o X Salada
                precoFinal = precoXSalada * qtdeProduto; // Calcula o Preço do X Salada
                System.out.printf("\n\nSaída:\nTotal: %.2fR$", precoFinal); // Printa na Tela
                break; // Finaliza o Código
            
            case 3: // Seleciona o X Bacon
                precoFinal = precoXBacon * qtdeProduto; // Calcula o Preço do X Bacon
                System.out.printf("\n\nSaída:\nTotal: %.2fR$", precoFinal); // Printa na Tela
                break; // Finaliza o Código
            
            case 4: // Seleciona a Torrada Simples
                precoFinal = precoTorradaSimples * qtdeProduto; // Calcula o Preço da Torrada Simples
                System.out.printf("\n\nSaída:\nTotal: %.2fR$", precoFinal); // Printa na Tela
                break; // Finaliza o Código
            
            case 5: // Seleciona o Refrigerante
                precoFinal = precoRefrigerante * qtdeProduto; // Calcula o Preço do Refrigerante
                System.out.printf("\n\nSaída:\nTotal: %.2fR$", precoFinal); // Printa na Tela
                break; // Finaliza o Código
                
            default: // Caso nenhum desses for selecionado
                System.out.println("\nDigite um Código Válido."); // Printa na Tela
                break; // Finaliza o Código
        }
    }
}
