package lista3;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao(){
        //3) Escreva um código que receba dois números inteiros e escreva todos os números pares entre eles.
       
        System.out.println("Digite o primeiro número: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); 

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.println("\nOs números pares entre " + menor + " e " + maior + " são: ");

        //constrói a lista para manipular
        StringBuilder resultado = new StringBuilder();


        for (int i = menor; i <= maior; i++) {
            if (i % 2 == 0) {
                if (resultado.length() > 0) { //length retorna o comprimento 
                    resultado.append(", "); //append add texto ao final 
                }
                resultado.append(i);
            }
        }
        System.out.println(resultado.toString());


    }

}