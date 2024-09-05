package lista3;

import java.util.Scanner;

 //2) Desenvolva um programa que receba um número do usuário e escreva a tabuada dele.

public class Exercicio2 {
    public static void resolucao(){
    
        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        System.out.println("-------------------------");
        System.out.println("      TABUADA DE " + num);
        System.out.println("-------------------------");

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
    }
}