/*
Declare uma variável do tipo double precoOriginal.
Atribua um valor em reais a essa variável, representando o preço original de um produto.
Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
*/

public class Main {
    public static void main(String[] args) {
        double precoOriginal = 10.50;
        double percentualDesconto = 10;
        double valorDesconto = (precoOriginal * percentualDesconto) / 100;
        double precoComDesconto =  (precoOriginal - valorDesconto);

        String mensagem = String.format("O produto custava %.2f -> O novo valor com desconto de %.0f%% é R$ %.2f", precoOriginal, percentualDesconto, precoComDesconto);
        System.out.println(mensagem);

    }
}