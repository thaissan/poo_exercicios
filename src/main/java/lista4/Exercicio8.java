package lista4;

import java.util.Scanner;
import java.util.ArrayList;

// 8) Aproveite os códigos anteriores e implemente a função de impressão
// por ordem de preço (crescente)

public class Exercicio8 {
    public static void resolucao() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();
        ArrayList<Double> listaDePrecos = new ArrayList<>();
        ArrayList<Integer> indices = new ArrayList<>();
        int opcao;

        do {
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

                    System.out.println("Digite o valor do item: ");
                    double valor = scanner.nextDouble();
                    listaDePrecos.add(valor);
                    indices.add(indices.size());  // Adiciona o índice do novo item

                    System.out.println("Item adicionado com sucesso.");
                    break;
                case 2:
                    System.out.println("\nSua Lista de Compras:");
                    System.out.println("  Item  " + "    Preco");

                    // Ordenação usando Bubble Sort (por preços)
                    for (int i = 0; i < indices.size() - 1; i++) {
                        for (int j = 0; j < indices.size() - i - 1; j++) {
                            if (listaDePrecos.get(indices.get(j)) > listaDePrecos.get(indices.get(j + 1))) {
                                // Troca os índices
                                int temp = indices.get(j);
                                indices.set(j, indices.get(j + 1));
                                indices.set(j + 1, temp);
                            }
                        }
                    }

                    for (int i = 0; i < indices.size(); i++) {
                        int index = indices.get(i);
                        System.out.println((i + 1) + "- " + listaDeCompras.get(index) + "    R$ " + listaDePrecos.get(index));
                    }
                    break;
                case 3:
                    System.out.println("\nDigite o número do item que deseja remover da lista: ");
                    int removerItem = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (removerItem > 0 && removerItem <= indices.size()) {
                        int indexToRemove = indices.get(removerItem - 1);
                        listaDeCompras.remove(indexToRemove);
                        listaDePrecos.remove(indexToRemove);
                        indices.remove(removerItem - 1);
                        
                        // Atualizar a lista de índices
                        for (int i = 0; i < indices.size(); i++) {
                            if (indices.get(i) > indexToRemove) {
                                indices.set(i, indices.get(i) - 1);
                            }
                        }

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
        
        scanner.close();
    }
}

