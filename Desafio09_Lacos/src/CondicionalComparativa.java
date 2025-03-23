import java.util.Scanner;

/*
Peça ao usuário para inserir dois números inteiros.
Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
*/
public class CondicionalComparativa {
    public static void main(String[] args) {

        int[] numeroDigitado = new int[2]; // Cria um array para armazenar dois números, com posições fixas
        Scanner dados = new Scanner(System.in);

            System.out.print("\nDigite primeiro números: ");
            numeroDigitado[0] = dados.nextInt();

            System.out.print("Digite segundo números: ");
            numeroDigitado[1] = dados.nextInt();

            if(numeroDigitado[0] == numeroDigitado[1]){
                System.out.println("Números digitados são iguais");
            } else if (numeroDigitado[0] > numeroDigitado[1]) {
                System.out.println("O primeiro é maior que segundo número");
            } else {
                System.out.println("\nO segundo número é maior que primeiro número");
            }
            System.out.println("Os números inseridos: " + numeroDigitado[0] + " e " + numeroDigitado[1]);

        dados.close();
    }
}
