package lista2;

import java.util.Scanner;

// 4) Um cliente que promove eventos e solicitou um programa que seja capaz de
// identificar se uma pessoa é maior de idade. Pessoas com menos de 16 anos não
// podem entrar nos eventos. Entre 16 e 18 anos somente acompanhado pelos
// responsáveis. Maiores de 18 podem entrar normalmente.

public class Exercicio4 {
    public static void resolucao(){

       Scanner scanner = new Scanner(System.in);

       int idade;

       System.out.println("Digite a sua idade: ");
       idade = scanner.nextInt();

       if (idade < 16){
           System.out.println("Proibido entrar no evento.");
       } else if (idade >= 16 && idade < 18){
           System.out.println("Entrada no evento só será autorizada com o acompanhamento dos responsáveis.");
       } else{
           System.out.println("Autorizado a entrar no evento.");
       }

       scanner.close();
   }



}
