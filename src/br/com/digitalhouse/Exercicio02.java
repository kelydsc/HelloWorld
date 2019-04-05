package br.com.digitalhouse;

import java.util.Scanner;

public class Exercicio02 {
    /*
    2. Escrever um programa, que deve analisar dois números inteiros e, se o  primeiro número
    for menor que o segundo número, retornar true, caso contrário, retorna false.
    */

    /* solução 01: sem metodo adicional
    public static void main(String[] args) {
        int numero01;
        int numero02;
        boolean retorno;

        System.out.println("digite numero 01: ");
        Scanner scanner = new Scanner(System.in);
        numero01 = scanner.nextInt();

        System.out.println("digite numero 02: ");
        numero02 = scanner.nextInt();

        if(numero01 < numero02){
            retorno = true;
        }else{
            retorno = false;
        }
        System.out.println(retorno);
    }
     */

    public boolean numeroMenor(int numero01, int numero02){
        return numero01 < numero02;
    }

    public static void main(String[] args) {

        //instancia da classe Exercicio02
        Exercicio02 exercicio02 = new Exercicio02();

        //imprime na tela o retorno do metodo numeroMenor
        System.out.println(exercicio02.numeroMenor(4,5));
    }
}