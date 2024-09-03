package lista1;

import java.util.Scanner;

// 7) Escreva um programa que receba quatro notas de um
// aluno e calcule a média aritmética dessas notas.

public class Exercicio7 {
    public static void resolucao() {
        Scanner scanner = new Scanner(System.in);

        String nome;
        float n1, n2, n3, n4, media;

        System.out.println("Digite o nome do aluno: ");
        nome = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        n1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota: ");
        n2 = scanner.nextFloat();

        System.out.println("Digite a terceira nota: ");
        n3 = scanner.nextFloat();

        System.out.println("Digite a quarta nota: ");
        n4 = scanner.nextFloat();

        media = (n1+n2+n3+n4)/4;

        System.out.printf("A media do aluno foi : %.2f ", media);     
        
        scanner.close();
    }

}
