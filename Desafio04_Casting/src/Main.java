public class Main {
/*
Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
*/
    public static void main(String[] args) {
        double n1 = 5.78;
        int n2 = (int) n1; // Fazendo casting explícito de double para int

        String mensagem = String.format("A primeira variável é: %.2f%nA segunda variável (convertida) é: %d", n1, n2);
        System.out.println(mensagem);

    }
}