package lista4;

// 2) Agora que voce sabe o fechamento do dia, monte um código que
// identifique a compra de menor valor e a compra de maior valor


public class Exercicio1 {
    public static void resolucao() {

        double [] vendasDiarias = {20.50, 3.50, 40.99, 73.60, 10.50};
        double total = 0;
        double menorValor = vendasDiarias[0];
        double maiorValor = vendasDiarias[0];

        for (double vendas : vendasDiarias){
            total += vendas;
        }
        System.out.printf("\nO fechamento total do dia foi de: R$%.2f.\n", total);

        for (double vendas: vendasDiarias) {
            if (vendas < menorValor) {
                menorValor = vendas;
            }
            if (vendas > maiorValor) {
                maiorValor = vendas;
            }
        }

        System.out.println("A compra de menor valor foi: R$ " + menorValor);
        System.out.println("A compra de maior valor foi: R$ " + maiorValor);
    }

}





