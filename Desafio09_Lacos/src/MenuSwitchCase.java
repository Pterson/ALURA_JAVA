/*
Crie um menu que oferece duas opções ao usuário:
"1. Calcular área do quadrado" e
"2. Calcular área do círculo".
Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
*/

import java.util.Scanner;
public class MenuSwitchCase {
    public static void main(String[] args) {
        double numeroDoCalculo =0;
        Scanner dados = new Scanner(System.in);
        String resumo = """
                \nEscolha as opções abaixo para o calculo desejado:
                "1. Calcular área do quadrado"
                "2. Calcular área do círculo".
                """;
        System.out.print(resumo);
        int menu = dados.nextInt();

        double area = 0;

                switch (menu){
            case 1:
                System.out.print("\nDigite o valor do lado do quadrado: ");
                numeroDoCalculo = dados.nextDouble();
                area = numeroDoCalculo * numeroDoCalculo;
                System.out.printf("A área do quadrado com lado %.2f é: %.2f%n", numeroDoCalculo, area);
                break;
            case 2:
                System.out.print("\nDigite o valor do raio do círculo: ");
                numeroDoCalculo = dados.nextDouble();
                area = Math.PI * Math.pow(numeroDoCalculo, 2);
                System.out.printf("A área do círculo com raio %.2f é: %.2f%n", numeroDoCalculo, area);
                break;
            default:
                System.out.println("Número inválido! Digite um número entre 1 e 2.");
        }
        dados.close();
    }
}