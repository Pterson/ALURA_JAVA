//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
/*
1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.
*/

    public static void main(String[] args) {

        double nota1 = 6;
        int nota2 = 8;
        double media = (nota1+nota2) / 2;

        //System.out.printf("media: " + media);
        String mensagem = String.format("A %.2f%n da notas é:", media);
        System.out.println(mensagem);
    }
}