package com.poolista.poolista;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao() {
        Scanner scanner = new Scanner(System.in);

        double n1, valor;

        System.out.println("Digite o valor em reais(R$): ");
        n1 = scanner.nextDouble();

        valor = n1 / 5.25;
        String resultado = String.format("%.2f", valor);

        System.out.println("O valor convertido para dólares é de: US$" + resultado);
    }



}
