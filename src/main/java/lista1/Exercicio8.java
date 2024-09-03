package lista1;

import java.util.Scanner;

// 8) Suponha que voce trabalhe em um laboratório e seu
// colega mediu a temperatura de um objeto em Fahrenheit.
// Escreva um programa capaz de converter em Celsius.

public class Exercicio8 {
    public static void resolucao() {
        Scanner scanner = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em Fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        celsius = (fahrenheit - 32) / 1.8;

        System.out.printf("A temperatura em Celsius é: %.1f °C", celsius);

        scanner.close();
        
    }


}
