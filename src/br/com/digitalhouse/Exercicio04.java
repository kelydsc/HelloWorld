package br.com.digitalhouse;

import java.sql.SQLOutput;
import java.util.List;

/*
4. Escrever um programa, que pegue um Array de números e retorne a soma  de todos os elementos dele.
 */
public class Exercicio04 {
    public static void main(String[] args) {

        //declaração do array
        int[] numerosArray = {1,2,3,4,5};

        //declaração da variavel para somar os valores do array
        int somarValoresArray = 0;

        for (int i = 0; i < numerosArray.length;i++){
            somarValoresArray = somarValoresArray + numerosArray[i];
        }
        System.out.println("A soma dos vaores Array = " + somarValoresArray);
    }
}
