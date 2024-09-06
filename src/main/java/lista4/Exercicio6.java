package lista4;

import java.util.Scanner;
import java.util.ArrayList;

// 6) Aproveite a questão anterior e adiciona a opção do usuário remover
// um item.

public class Exercicio6 {
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
            System.out.println("3 - Remover item da lista");
            System.out.println("4 - Sair");
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
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println((i +1 ) + "- " + listaDeCompras.get(i));
                    }
                    break;
                case 3:
                    System.out.println("\nDigite o número do item que deseja remover da lista: ");
                    int removerItem = scanner.nextInt();
                    scanner.nextLine();

                    if (removerItem > 0 && removerItem <= listaDeCompras.size()) {
                        listaDeCompras.remove(removerItem - 1);
                        System.out.println("Item removido com sucesso!");
                    } else {
                        System.out.println("ERRO: O item não existe.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

       }
}

