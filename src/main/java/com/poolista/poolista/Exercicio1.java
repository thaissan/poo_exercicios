package com.poolista.poolista;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao() {
		
        int n1, n2;

		System.out.print("Digite o primeiro numero: ");
		Scanner scanner1 = new Scanner(System.in);
		n1 = scanner1.nextInt(); 
		
		System.out.println("Digite o segundo numero: ");
		n2 = scanner1.nextInt();

		System.out.println("A soma dos números é = "+(n1+n2));

    }

}
