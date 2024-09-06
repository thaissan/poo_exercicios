package lista4;

// 1) Voce é gerente de um supermercado e sabe que os valores das
// vendas do dia são gravados em um vetor. Digite um código que faça o
// fechamento (soma) de vendas do dia de maneira automatizada.

public class Exercicio1 {
    public static void resolucao() {

        double [] vendasDiarias = {20.50, 3.50, 40.99, 73.60, 10.50};
        double total = 0;

        for (double vendas : vendasDiarias){
            total += vendas;
        }
        System.out.printf("\nO fechamento total do dia foi de: R$%.2f.\n", total);

    }

}





