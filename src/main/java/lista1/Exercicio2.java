package lista1;

import java.util.Scanner;

//2) Escreva um programa que pergunte o nome e osobrenome do usuário e escreva na tela: "Olá, -usuário-".


public class Exercicio2 {

    public static void resolucao() {
        String nome, sobrenome;

        System.out.println("Digite seu nome: ");
        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.println("Olá, "+ nome +" "+sobrenome + " !");

        scanner.close();


    }

}
