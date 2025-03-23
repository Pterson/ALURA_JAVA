/*
Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
Atribua valores a essas variáveis e concatene-as em uma mensagem.
*/
public class Main {

    public static void main(String[] args) {
        int quantidade = 10;
        double precoProduto = 49.50;
        double resultado = 0;

        String mensagem = "O valor total da compra é R$" + (quantidade * precoProduto);

        System.out.println(mensagem);
    }
}