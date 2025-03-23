import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("\nDigite seu filme favorito: ");
        String filme = dados.nextLine();

        System.out.println("Qual ano de Lançamento: ");
        int anoDeLancamento = dados.nextInt();

        System.out.println("Digite sua Avalição para o filme: ");
        double avaliacao = dados.nextDouble();

        System.out.println("\nO filme escolhido: " + filme);
        System.out.println("O ano de Lançamento: " + anoDeLancamento);
        System.out.println("A avaliação do filme: " + avaliacao);
        dados.close();
    }
}
