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
public class Exercicio11 {
    // Método Main
    public static void main(String[] args){
        // Instancia a Classe Locale
        Locale.setDefault(Locale.US); // Captura o Teclado Americano
        
        // Instancia a Classe Scanner
        Scanner sc = new Scanner(System.in); // Instancia a Classe Scanner
        System.out.println("\n---------- CALCULADORA IR ----------\n"); // Titulo
        System.out.println("\nEntrada:"); // Printa na Tela para colocar o numero de entrada
        float salario = sc.nextFloat(); // Captura o Salario
        sc.close(); // Fecha o Scanner
        
        // Faz o Calculo
        if(salario > 2112 && salario < 2826.66){ // Se o Salario for maior que 2112 e menor que 2826,66 R$
            salario = (float) (salario * 0.075 - 158.40); // Calcula o Imposto
            System.out.printf("\n\nSaída:\nR$%.2f", salario); // Printa na Tela
        }else if(salario >= 2826.66 && salario < 3751.06){ // Se o Salario for maior ou igual que 2826,66 e menor que 3751,06 R$
            salario = (float) (salario * 0.15 - 370.40); // Calcula o Imposto
            System.out.printf("\n\nSaída:\nR$%.2f", salario); // Printa na Tela
        }else if (salario >= 3751.06 && salario < 4664.68){ // Se o Salario for maior ou igual que 3751,06 e menor que 4664,68 R$
            salario = (float) (salario * 0.225 - 651.73); // Calcula o Imposto
            System.out.printf("\n\nSaída:\nR$%.2f", salario); // Printa na Tela
        } else if(salario >=4664.68){ // Se o Salario for maior que 4664,68 R$
            salario = (float) (salario * 0.275 - 884.86); // Calcula o Imposto
            System.out.printf("\n\nSaída:\nR$%.2f", salario); // Printa na Tela
        }else{ // Se o Salario for menor ou igual a 2112
            System.out.println("\nSaída:\nIsento"); //Printa na Tela
        }
    }
}
