/*
Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
*/

import java.util.Scanner;

public class CalcFatorial {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int fatorando = dados.nextInt();

        if (fatorando < 0) {
            System.out.println("O fatorial não é definido para números negativos.");
        } else {
            long fatorial = 1; // 'long' para suportar números grandes

            for (int i = 1; i <= fatorando; i++) {
                fatorial = fatorial * i; // Multiplicamos progressivamente
            }

            System.out.println("O fatorial de " + fatorando + " é: " + fatorial);
        }
    dados.close();
    }
}
