package lista2;

import java.util.Scanner;

//1) Escreva um programa que recebe um número digitado pelo usuário e responda
// se o número inserido é par ou ímpar ou 0.


public class Exercicio1{

    public static void resolucao(){

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        if(numero == 0){
            System.out.println("O número é igual a 0.");
        }
        else if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        scanner.close();
    }
}
