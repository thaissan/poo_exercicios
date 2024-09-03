package lista2;

import java.util.Scanner;

// 7) Escreva um programa Identificador de Divisibilidade, isto é, que identifique se
// um determinado número informado pelo usuário é divisível por X (Que também
// deve ser informado pelo usuário)

public class Exercicio7 {

    public static void resolucao(){
       Scanner scanner = new Scanner(System.in);

       int n1, n2;

       System.out.print("Digite o número que deseja dividir: ");
       n1 = scanner.nextInt();

       System.out.print("Digite o numero divisor: ");
       n2 = scanner.nextInt();

       if (n2 != 0 && n1 % n2 == 0) {
           System.out.println("O número " + n1 + " é divisível por " + n2);
       }else {
           System.out.println("O número " + n1 + " não é divisível por " + n2);
       }

       scanner.close();
   }

}
