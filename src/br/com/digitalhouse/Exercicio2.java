package br.com.digitalhouse;

import sun.reflect.generics.tree.ReturnType;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        System.out.println(verificaMenor(1,5));

    }


public static boolean verificaMenor(Integer numeroA, Integer numeroB) {
    return numeroA < numeroB;
}
}