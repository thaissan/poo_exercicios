package lista2;

import java.util.Scanner;

// 5) Crie um algoritmo que receba login e senha e verifique as credenciais. Caso
// algum deles estiver errado o programa deve retornar ao usuário quais das opções
// está errada, se é o login ou a senha.


public class Exercicio5 {
    public static void resolucao(){

       Scanner scanner = new Scanner(System.in);

       String loginCerto = "thais";
       String senhaCerta = "thais123";
       String login;
       String senha;

       System.out.println("Digite o login: ");
       login = scanner.nextLine();

       System.out.println("Digite a senha: ");
       senha = scanner.nextLine();

       if(!login.equals(loginCerto) && !senha.equals(senhaCerta)){
        System.out.println("Login e senha incorretos.Acesso negado!");
       } else if (!login.equals(loginCerto)){
           System.out.println("Login incorreto. Acesso negado!");
       } else if (!senha.equals(senhaCerta)) {
           System.out.println("Senha incorreta.Acesso negado!");
       } else {
           System.out.println("Login e senha corretos. Acesso autorizado!");
       }

       scanner.close();
   }

}
