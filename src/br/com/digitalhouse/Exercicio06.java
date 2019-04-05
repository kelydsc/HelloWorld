package br.com.digitalhouse;
/*
6. Escreva um programa que receba um Array de números e retorne um Array com todos os elementos pares dele.
 */

public class Exercicio06 {

    public static void main(String[] args) {

        Integer[] numerosParesArray = new Integer[7];

        Integer posicao = 0;

        numerosParesArray = retornarArrayNumerosPares();

        for (int i = 0;i < numerosParesArray.length;i++){
            if (i % 2 == 0 && i > 0) {
                numerosParesArray[posicao] = i;
                System.out.println(numerosParesArray[posicao]);
                //adiciona 1 na variavel posicao
                posicao++;
            }
        }
    }

    private static Integer[] retornarArrayNumerosPares(){

        Integer[] numerosParesArray = new Integer[7];

        Integer posicao = 0;

        for (int i = 0;i < numerosParesArray.length;i++) {
            if (i % 2 == 0 && i > 0) {
                numerosParesArray[posicao] = i;

                //adiciona 1 na variavel posicao
                posicao++;
            }
        }
        return numerosParesArray;
    }
}