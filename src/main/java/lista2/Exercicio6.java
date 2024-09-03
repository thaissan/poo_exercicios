package lista2;

import java.util.Scanner;

// 6) Crie um programa que receba as notas de um aluno e informe se ele foi
// aprovado ou reprovado. Se o aluno ficar com média acima de 6 nas 2 primeiras
// provas ele passou. Senão o programa deverá perguntar a nota de recuperação
// que irá substituir a menor nota. A pergunta de recuperação deverá aparecer
// somente para os alunos que precisarem.


public class Exercicio6 {
    public static void resolucao(){
        Scanner scanner = new Scanner(System.in);

        String nome;
        double n1, n2, media;
        double menorNota, maiorNota, recuperacao, mediaRecuperacao;

        System.out.println("Nome do aluno: ");
        nome = scanner.nextLine();

        System.out.println("Digite a nota 1: ");
        n1 = scanner.nextDouble();

        System.out.println("Digite a nota 2: ");
        n2 = scanner.nextDouble();

        media = (n1+n2)/2;

        if(media >= 6){
           System.out.println("Aprovado! Sua média foi: " + media);
        }
        else{
           System.out.println("Recuperação! Sua média foi: " + media);
           if (n1 < n2) {
            menorNota = n1;
            maiorNota = n2;
            } else {
            menorNota = n2;
            maiorNota = n1;
            }

           System.out.println("Insira a nota da recuperação: ");
           recuperacao = scanner.nextDouble();
           
           mediaRecuperacao = ((recuperacao + maiorNota)/2);

           if(mediaRecuperacao >= 6){
               System.out.println("Aprovado! Sua média final foi: " + mediaRecuperacao);
           }
           else{
               System.out.println("Reprovado! Sua média final foi: " + mediaRecuperacao);
           }
        }

        scanner.close();
   }     

}
