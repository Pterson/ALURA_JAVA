/*Crie um programa que solicite ao usuário a entrada de um número inteiro.
Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
*/

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número inteiro para verificação se é PAR ou ÍMPAR: ");

            if (dados.hasNext("S") || dados.hasNext("s")) { // Permite saída com "S"
                System.out.println("Encerrando o programa. Até mais!");
                break;
            }

            if (!dados.hasNextInt()) { // Valida entrada não numérica
                System.out.println("\nEntrada inválida! Apenas números inteiros.");
                dados.next(); // Limpa entrada inválida
                continue;
            }

            int numeroInteiro = dados.nextInt();

            if (numeroInteiro % 2 != 0) {
                System.out.println("O número é ímpar");
            } else {
                System.out.println("O número é par");
            }

            if (numeroInteiro < 1) {
                System.out.println("\nNúmero inválido! Apenas números inteiros.");
                continue;
            }

        }
        dados.close();
    }
}
