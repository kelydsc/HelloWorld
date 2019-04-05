package br.com.digitalhouse;
/*
5. Escrever um programa que receba um Array e retorne a soma de todos os  elementos pares do Array.
 */
public class Exercicio05 {
    public static void main(String[] args) {

        //declaração do Array
        int[] numerosArray = {1,2,3,4,5};

        //declaração da variavel
        int somarNumerosParesArray = 0;

        for (int i =0;i < numerosArray.length; i++){
            if(numerosArray[i] % 2 == 0){
                somarNumerosParesArray = somarNumerosParesArray + numerosArray[i];
            }
        }
        System.out.println("Resultado soma de numeros pares= " + somarNumerosParesArray);
    }
}
