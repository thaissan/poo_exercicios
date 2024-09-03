package lista2;

import java.util.Scanner;

// 8) Crie um joguinho de perguntas e respostas múltipla escolha. O programa
// deverá fazer 5 perguntas (Uma por vez). Se ele errar 3 vezes ele perde o jogo. Se
// o usuário chegar até o final o programa deve exibir o número de acertos

public class Exercicio8 {
    public static void resolucao(){

        Scanner scanner = new Scanner(System.in);

        int acertos = 0;
        int erros = 0;
        int resposta;

        System.out.println("\n\n*********************************************************************");
		System.out.println("Seja bem vindo ao Quiz de Lógica da Programação!");
        System.out.println("*********************************************************************");
        System.out.println("REGRAS:");
        System.out.println("1 - Digite o número da resposta e veja quantas você consegue acertar");
        System.out.println("2 - Se erras 3 vezes você perde o jogo.");
		System.out.println("*********************************************************************\n\n");

        // 1
        System.out.println("1. O que o operador '%' faz em programação?");
        System.out.println("1) Divisão");
        System.out.println("2) Multiplicação");
        System.out.println("3) Resto da divisão");
        System.out.println("4) Soma");
        resposta = scanner.nextInt();
        if (resposta == 3) {
            System.out.println("Acertou!");
            acertos++;
        } else {
            System.out.println("Erroou!");
            erros++;
        }
        if (erros >= 3) {
            System.out.println("Você perdeu o jogo :/");
            scanner.close();
            return;
        }

        // 2
        System.out.println("\n2. Qual é a estrutura de controle usada para repetir um bloco de código várias vezes?");
        System.out.println("1) If");
        System.out.println("2) Switch");
        System.out.println("3) Loop (for, while, do-while)");
        System.out.println("4) Case");
        resposta = scanner.nextInt();
        if (resposta == 3) {
            System.out.println("Acertou!");
            acertos++;
        } else {
            System.out.println("Erroou!");
            erros++;
        }
        if (erros >= 3) {
            System.out.println("Você perdeu o jogo :/");
            scanner.close();
            return;
        }

        // 3
        System.out.println("\n3. O que é um 'array' em programação?");
        System.out.println("1) Um tipo de dado");
        System.out.println("2) Uma estrutura de controle");
        System.out.println("3) Uma função");
        System.out.println("4) Uma coleção de elementos do mesmo tipo");
        resposta = scanner.nextInt();
        if (resposta == 4) {
            System.out.println("Acertou!");
            acertos++;
        } else {
            System.out.println("Erroou!");
            erros++;
        }
        if (erros >= 3) {
            System.out.println("Você perdeu o jogo :/");
            scanner.close();
            return;
        }

        // 4
        System.out.println("\n4. Como você declara uma variável inteira em Java?");
        System.out.println("1) int x;");
        System.out.println("2) integer x;");
        System.out.println("3) double x;");
        System.out.println("4) float x;");
        resposta = scanner.nextInt();
        if (resposta == 1) {
            System.out.println("Acertou!");
            acertos++;
        } else {
            System.out.println("Erroou!");
            erros++;
        }
        if (erros >= 3) {
            System.out.println("Você perdeu o jogo :/");
            scanner.close();
            return;
        }

        // 5
        System.out.println("\n5. O que faz a estrutura 'if' em programação?");
        System.out.println("1) Executa um bloco de código repetidamente");
        System.out.println("2) Executa um bloco de código se uma condição for verdadeira");
        System.out.println("3) Declara uma função");
        System.out.println("4) Cria uma variável");
        resposta = scanner.nextInt();
        if (resposta == 2) {
            System.out.println("Acertou!");
            acertos++;
        } else {
            System.out.println("Erroou!");
            erros++;
        }

        if (erros < 3) {
            System.out.println("Parabéns! Você acertou " + acertos + " de 5 perguntas.");
        } else {
            System.out.println("Você perdeu o jogo :/");
        }

        scanner.close();
    }
}
