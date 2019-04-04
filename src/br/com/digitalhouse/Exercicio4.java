package br.com.digitalhouse;

public class Exercicio4 {
    public static void main(String[] args) {
        int lista[] = {1,2,3,4,5,6};
        int soma = 0;

        for (int contador = 0; contador < 5; contador ++){
            soma = soma + lista[contador];
        }

        System.out.println(soma);

}
}
