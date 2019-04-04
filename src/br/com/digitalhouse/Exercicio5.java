package br.com.digitalhouse;

public class Exercicio5 {

    public static void main(String[] args) {
        int lista[] = {1,2,3,4,5,6};
        int soma = 0;

        for (int contador = 0; contador < lista.length; contador ++){
            if (lista[contador] % 2 == 0){

                soma = soma + lista[contador];
            }
        }

        System.out.println(soma);

    }


}
