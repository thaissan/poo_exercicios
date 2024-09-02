package com.poolista.poolista;

import java.util.Scanner;

//  //4) Construa um algoritmo que leia um número inteiro na tela e
// responda o número antecessor e o sucessor.

public class Exercicio4 {
    public static void resolucao() {
        Scanner scanner = new Scanner(System.in);

        int n1;

        System.out.print("Digite um número: \n");
        n1 = scanner.nextInt();

        System.out.print("O antecessor é: "+(n1-1)+ "\nE o sucessor é: "+(n1+1));

    }

}
