package lista4;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PoolistaApplication4 {

	    public static void main(String[] args) {
		SpringApplication.run(PoolistaApplication4.class, args);
         Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Selecione a lista de exercícios que você deseja executar:");
            System.out.println("1 - Exercício 1");
            System.out.println("2 - Exercício 2");
            System.out.println("3 - Exercício 3");
            System.out.println("4 - Exercício 4");
            System.out.println("5 - Exercício 5");
            System.out.println("6 - Exercício 6");
            System.out.println("7 - Exercício 7");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Exercicio1.resolucao();
                    break;
                case 2:
                //     Exercicio2.resolucao();
                //     break;
                // case 3:
                //     Exercicio3.resolucao();
                //     break;
                case 4:
                    Exercicio4.resolucao();
                    break;
                // case 5:
                //     Exercicio5.resolucao();
                //     break;
                // case 6:
                //     Exercicio6.resolucao();
                //     break;
                // case 7:
                //     Exercicio7.resolucao();
                //     break;    
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
