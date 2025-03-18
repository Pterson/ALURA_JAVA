/*
 Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
 Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.
 Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.
 Depois de finalizar, testar e conferir que seu programa foi executado com sucesso, crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais.
 Lembre-se que provavelmente você precisará fazer um casting de valores.
*/
public class Main {

    public static void main(String[] args) {

        double tempCelsius = 21;
        double tempFahren = (tempCelsius * 1.8) + 32;
        int temperaturaEmFahrenInteira = (int) tempFahren;


        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", tempCelsius, tempFahren);

        System.out.println(mensagem);

        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenInteira);


    }
}