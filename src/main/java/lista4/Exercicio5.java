package lista4;

import java.util.Scanner;
import java.util.ArrayList;

// 5) Escreva um programa que sirva como uma lista de compras de
// mercado. Você irá criar um menu que pergunte se o usuário quer inserir
// um item ou ver a lista.

public class Exercicio5 {
    public static void resolucao() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();
        int opcao;

        do{
            System.out.println("\nLista de compras");
            System.out.println("O que você deseja ?");
            System.out.println("**************************");
            System.out.println("1 - Inserir item na lista");
            System.out.println("2 - Ver lista de compras");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite um item para adicionar: ");
                    String item = scanner.nextLine();
                    listaDeCompras.add(item);
                    System.out.println("Item adicionado com sucesso.");
                    break;
                case 2:
                    System.out.println("\nSua Lista de Compras:");
                    for (int i = 1; i < listaDeCompras.size(); i++) {
                        System.out.println((i) + "- " + listaDeCompras.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 3);

       }
}

