package br.com.digitalhouse;

import java.sql.SQLOutput;

public class Exercicio03 {
    /*
    3. Escrever um programa que deve analisar um número inteiro e, caso ele seja  ímpar e maior que dez,
    retornar true, caso contrário, retornar false.
     */
    public boolean numeroImparMaiorDez(int numero){
        /*
        if(!(numero % 2 == 0){
            if(numero > 10){
                return true;
            }else{
                return false;
            }
        }
         */
        //retorna verdadeiro quando o numero for impar(resto <> 0) e o numero maior que 10
        return !(numero % 2 == 0) && (numero > 10);
    }

    public static void main(String[] args) {
        Exercicio03 exercicio03 = new Exercicio03();
        System.out.println(exercicio03.numeroImparMaiorDez(12));
    }
}

