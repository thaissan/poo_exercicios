package lista1;

import java.util.Scanner;

//1) Escreva um programa que faça a soma entre 2 números. 

public class Exercicio1 {
    public static void resolucao() {
		
        int n1, n2;

		System.out.print("Digite o primeiro numero: ");
		Scanner scanner = new Scanner(System.in);
		n1 = scanner.nextInt(); 
		
		System.out.println("Digite o segundo numero: ");
		n2 = scanner.nextInt();

		System.out.println("A soma dos números é = "+(n1+n2));

		scanner.close();

    }

}
