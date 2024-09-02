package com.poolista.poolista;

import java.util.Scanner;

// 5) Construa um algoritmo que calcule o valor de um terreno
// baseado na sua área e valor por m2.

public class Exercicio5 {
    public static void resolucao(){
        
        Scanner scanner = new Scanner(System.in);

        double area, valorPorMetroQuadrado, total;

        System.out.println("Digite a área do terreno em metros quadrados (m²): ");
        area = scanner.nextDouble();

        System.out.println("Digite o valor por metro quadrado R$: ");
        valorPorMetroQuadrado = scanner.nextDouble();

        total = area * valorPorMetroQuadrado;

        System.out.printf("O valor total do terreno é de R$ %.2f.", total);
    }

}
