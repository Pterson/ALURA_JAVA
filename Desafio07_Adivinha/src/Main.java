import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        int numeroDigitado = 0;
        int tentativas = 0;

        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Gera entre 1 e 100

        System.out.println("Número aleatório: " + numeroAleatorio);

        System.out.println("\nVocê tem 5 tentativas para acertar o número da sorte\n");
        while (numeroDigitado != numeroAleatorio) {
            System.out.print("\nDigite seu número:");
            numeroDigitado = dados.nextInt();
            tentativas++;

            if (numeroDigitado == numeroAleatorio) {
            System.out.println("\nParabéns, você acertou o número em " + tentativas + " tentativas!");
            break;
            } else if (numeroDigitado < numeroAleatorio){
                System.out.println("O número escolhido é menor do que o número gerado!");
            } else {
                System.out.println("O número escolhido é maior do que o número gerado!");
            }

            if (tentativas == 5 && numeroDigitado != numeroAleatorio) {
                System.out.println("\nAtingiu a quantidade de tentativas, tente outra vez! O número era: " + numeroAleatorio);
                break; // o break deve estar dentro do while, para funcionar corretamente
            }
        }
        dados.close(); // Fechamento do scanner para evitar vazamento de recursos
    }
}