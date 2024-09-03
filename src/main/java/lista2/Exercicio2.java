package lista2;

import java.util.Scanner;

// //2) Desenvolva um algoritmo que seja capaz de receber dois números digitados
// pelo usuário e diga qual deles é maior.

public class Exercicio2 {
    public static void resolucao(){

       Scanner scanner = new Scanner (System.in);

       double n1, n2;

       System.out.println("Digite o primeiro número: ");
       n1 = scanner.nextDouble();

       System.out.println("Digite o segundo número: ");
       n2 = scanner.nextDouble();

       if (n1 > n2){
           System.out.println("O numero "+ n1 + " é maior que " + n2);

       }else if (n2 > n1){
           System.out.println("O numero "+ n2 + " é maior que " + n1);

       }else{
           System.out.println("Os números são iguais.");    
       }

        scanner.close();

   }


}
