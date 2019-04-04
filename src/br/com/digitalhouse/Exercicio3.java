package br.com.digitalhouse;

public class Exercicio3 {

    public static void main(String[] args) {

        System.out.println(verificaImparMaiorDez(13));

    }

    public static boolean verificaImparMaiorDez(Integer numeroA) {
        return (numeroA > 10 && (numeroA % 2 != 0));
    }

}
