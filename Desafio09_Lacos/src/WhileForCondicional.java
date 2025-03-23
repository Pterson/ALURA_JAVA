import java.util.Scanner;
/*
Crie um programa que solicite ao usuário digitar um número.
Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
*/
public class WhileForCondicional {
    public static void main(String[] args) {

        int numeroDigitado = 0;
        Scanner dados = new Scanner(System.in);

        System.out.print("\nDigite um número: ");
        numeroDigitado = dados.nextInt();

        if(numeroDigitado < 0){
            System.out.print("\nO número digitado é Negativo -> " + numeroDigitado);
        } else {
            System.out.print("\nO número digitado é Positivo -> " + numeroDigitado);
        }
    }
}
