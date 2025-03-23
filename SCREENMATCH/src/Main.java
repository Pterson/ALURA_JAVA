public class Main {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        int classificacao = (int) (media /2);
        String sinopse = "Filme de aventura com galã dos anos 80";
        String resumo = """
                O filme Top Gun Maverick é um filme de aventura com o Tom Cruise como protagonista,
                tem uma nota do público 8.0 e uma nota dos jurados de 8.1! 
                """;

        System.out.println("----------------------------------------------------------------------");
        System.out.println();

        System.out.println("Bem Vindo ao Screen Match!");
        System.out.println();
        System.out.println("Filme: Top Gun: Maverick");
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Nota do Filme: " + notaDoFilme);
        System.out.println("Média das Notas do Público: " + media);
        System.out.println("Estrelas: " + classificacao);
        System.out.println("Descrição Filme: " + sinopse);
        System.out.println("Resumo do Filme: " + resumo);

        System.out.println();
        System.out.println("***********************************************************************");

    }
}