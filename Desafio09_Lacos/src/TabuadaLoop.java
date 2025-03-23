/*
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
*/

import java.util.Scanner;

public class TabuadaLoop {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        while (true){
            System.out.println("""
                \nEscolha uma tabuada do 1 ao 10 ou 0 para Sair
                """);
            
            System.out.print("\nDigite sua opção: ");

            if (!dados.hasNextInt()) { // Valida entrada não numérica
                System.out.println("\nEntrada inválida! Digite um número entre 1 e 10 ou 0 para sair.");
                dados.next(); // Limpa entrada inválida
                continue;
            }

            int tabuada = dados.nextInt();

            if (tabuada == 0) {
                System.out.println("Saindo do programa. Até mais!");
                break;
            }

            if (tabuada < 1 || tabuada > 10) {
                System.out.println("\nNúmero inválido! Escolha uma tabuada entre 1 e 10.");
                continue;
            }

            for (int i = 1; i <= 10; i++) {
                System.out.println( tabuada + "x" + i + " = " + (i*tabuada));
            }

        }
    dados.close();
    }
}
