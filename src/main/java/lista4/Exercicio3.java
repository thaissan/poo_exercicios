package lista4;

// 3) Ainda utilizando o exercício do mercado, calcule o ticket médio de
// vendas do dia

public class Exercicio3 {
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
        //Menor e maior valor das compras
        System.out.println("A compra de menor valor foi: R$ " + menorValor);
        System.out.println("A compra de maior valor foi: R$ " + maiorValor);

        //Media
        double ticketMedio = total / vendasDiarias.length;
        System.out.printf("\nO ticket médio das vendas do dia foi de: R$%.2f.\n", ticketMedio);
    }

}

