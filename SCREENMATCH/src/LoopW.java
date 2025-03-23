import java.util.Scanner;

public class LoopW {
    public static void main(String[] args) {
       Scanner dados = new Scanner(System.in);
        double mediaAvalicao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("\nDigite a nota de avaliação para o filme, ou -1 para encerrar");
            nota = dados.nextDouble();

            if (nota != -1) {
                mediaAvalicao = mediaAvalicao + nota;
                totalNotas++;
            }
        }
        System.out.println("\nMédia de avaliações: " + (mediaAvalicao/totalNotas));
    }
}
