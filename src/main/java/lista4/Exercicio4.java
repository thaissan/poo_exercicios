package lista4;

import java.util.Scanner;

// 4) Escreva um código que irá percorrer uma lista de números inteiros
// lista[ ] = { 3, 5, 6, 7, 8, 10, 22, 55, 110 } e irá contar a quantidade de
// números pares presente nela.

public class Exercicio4 {
    public static void resolucao() {
         Scanner scanner = new Scanner(System.in);

         int lista[ ] = { 3, 5, 6, 7, 8, 10, 22, 55, 110 };

         int numerosPares = 0;

         for(int numero : lista){
            if (numero % 2 == 0) {
                numerosPares++;
            }
        }
        System.out.println("Quantidade de números pares na lista: " + numerosPares);
    }
}
