package lista2;

import java.util.Scanner;

// //3) Um banco contratou você para que escreva um programa que será utilizado
// pelo usuário em um tablet. O programa irá fazer 3 perguntas e encaminhar o
// cliente para 2 filas. A fila comum e a fila preferencial. Se o cliente atender a uma
// das condições a seguir ele deve ser encaminhado para a fila preferencial. As
// condições são: Ter mais de 65 anos, se deficiente ou gestante.

public class Exercicio3{

    public static void resolucao(){

       Scanner scanner = new Scanner(System.in);

       int idade;
       String deficiente, gestante;

       System.out.print("Qual a sua idade? ");
       idade = scanner.nextInt();

       System.out.print("Possui alguma condição especial? (s/n): ");
       deficiente = scanner.next().toLowerCase();

       System.out.print("Você está grávida? (s/n): ");
       gestante = scanner.next().toLowerCase();


       if (idade > 65 || deficiente.equals("s") || gestante.equals("s")) {
           System.out.println("Sua fila é a preferencial (por idade , gravidez ou condição especial).");
       } else {
           System.out.println("Sua fila é normal.");
       }

       scanner.close();
   }

}
