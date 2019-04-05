package br.com.digitalhouse;

import java.util.Scanner;

public class Exercicio01 {

    //precisa declarar para reconhecer os comandos
    public static void main(String[] args){
        System.out.println("Hello World!");

        /*
        1. ​Escrever um programa que faça o seguinte:
        - Declarar uma variável “umNumeroA” do tipo Integer:
        -​ Declarar uma variável “umNumeroB” do tipo Double; 
        - ​Declarar uma variável “umaCadeiaDeTexto” do tipo String; 
        - ​Atribuir um valor a cada variável e, em seguida, imprimir na tela: O valor de cada variável; 
        - ​A soma de “numeroA” + “numeroB”; 
        -​ A diferença entre “numeroA” - “numeroB”.
        */

        //Declarar uma variável “umNumeroA” do tipo Integer:
        Integer umNumeroA;

        //Declarar uma variável “umNumeroB” do tipo Double; 
        Double umNumeroB;

        //Declarar uma variável “umaCadeiaDeTexto” do tipo String; 
        String umaCadeiaDeTexto;

        //​Atribuir um valor a cada variável e, em seguida, imprimir na tela: O valor de cada variável;
        //imprimir na tela o texto: Digite o valor:
        System.out.println("Digite o valor01: ");

        //criar o scanner para receber o valor de entrada digitado no console
        Scanner scanner = new Scanner(System.in);

        //o valor digitado no console irá popular a variavel criada
        umNumeroA = scanner.nextInt();

        //imprimir na tela o texto e o valor recebido do scanner
        System.out.println("Recebi o valor01: " + umNumeroA);

        //imprimir na tela o texto: Digite o valor:
        System.out.println("Digite o valor02: ");

        //o valor digitado no console irá popular a variavel criada
        umNumeroB = scanner.nextDouble();

        //imprimir na tela o texto e o valor recebido do scanner
        System.out.println("Recebi o valor02: " + umNumeroB);

        //​A soma de “numeroA” + “numeroB”; 
        System.out.println("A soma de A + B = " + (umNumeroA + umNumeroB));

        //A diferença entre “numeroA” - “numeroB”.
        System.out.println("A subtração de A - B = " + (umNumeroA - umNumeroB));

        System.out.println("Digite o texto: ");
        //recebe a proxima palavra digitada
        umaCadeiaDeTexto = scanner.next();
        System.out.println("Recebi texto: " + umaCadeiaDeTexto);

        /*
        RESULTADO:
        Hello World!
        Digite o valor01:
        10
        Recebi o valor01: 10
        Digite o valor02:
        5
        Recebi o valor02: 5.0
        A soma de A + B = 15.0
        A subtração de A - B = 5.0
        Digite o texto:
        teste_01
        Recebi texto: teste_01
         */
    }
}
