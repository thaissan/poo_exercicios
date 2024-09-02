package com.poolista.poolista;

import java.util.Scanner;

// 6) Construa um algoritmo que leia 1- a distância percorrida
// por um veículo em km 2- o total gasto em combustível em
// litros. No final deverá ser respondido o consumo médio deste
// veículo em km/l.

public class Exercicio6 {
    public static void resolucao() {
        Scanner scanner = new Scanner(System.in);

        double distancia, totalGasto, consumoMedio;

        System.out.println("Digite a distância percorrida pelo veículo em quilômetros (Km): ");
        distancia = scanner.nextDouble();

        System.out.println("Digite o total gasto de combustivel (L): ");
        totalGasto = scanner.nextDouble();

        consumoMedio = distancia / totalGasto;

       // System.out.printf("\nO consumo médio do veículo é %.2f km/l", consumoMedio);
       System.out.printf("O consumo médio do veículo é de %.2f km/l", consumoMedio);








        System.out.println();

        
    }

}
