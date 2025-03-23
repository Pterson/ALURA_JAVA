import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        double mediaAvalicao = 0;
        double nota = 0;

        for (int i = 1; i < 4; i++) {
            System.out.println("\nDigite a " + i + "° nota: ");
            nota = dados.nextDouble();
            mediaAvalicao = mediaAvalicao + nota;
        }

        System.out.println("\nMédia de avaliações: " + (mediaAvalicao/3));
    }
}
