import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        String nomeCliente = "Peterson";
        String tipoConta = "Corrente";
        double saldoAtual = 5000;
        //double receberValor = 2500;
        //double transferirValor = 1000;

        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        System.out.println("                       Dados Iniciais Do Cliente                      ");

        System.out.println("\nNome: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldoAtual);

        System.out.println("\n----------------------------------------------------------------------");

        while (true) {
            System.out.println("\n                           Menu De Operações                            ");
            System.out.println("""
                    \nEscolha uma opção:
                    1. Consultar saldo
                    2. Receber valor
                    3. Transferir valor
                    4. Sair
                    """);

            System.out.println("\nDigite sua opção: ");

            if (!dados.hasNextInt()) { // Valida entrada não numérica
                System.out.println("\nEntrada inválida! As opções disponiveis estão entre 1 e 4.");
                dados.next(); // Limpa entrada inválida
                continue;
            }

            int menu = dados.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n******************************** OPERAÇÃO EFETUADA ********************************");
                    System.out.printf("\nSaldo atual é: R$ %.2f%n",  saldoAtual);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("\nDigite o valor do deposito: ");
                    double receberValor = dados.nextDouble();
                    saldoAtual = saldoAtual + receberValor;
                    System.out.println("\n******************************** OPERAÇÃO EFETUADA ********************************");
                    System.out.printf("\nO depósito de %.2f foi concluído", receberValor);
                    System.out.printf("\nSaldo atualizado é: R$ %.2f%n", saldoAtual);
                    System.out.println();
                    break;

                case 3:
                        System.out.printf("\nSaldo atual é: R$ %.2f%n",  saldoAtual);
                        System.out.print("Digite o valor que deseja transferir: ");
                        double transferirValor = dados.nextDouble();

                        if (saldoAtual < transferirValor) {
                        System.out.print("\n**************************** OPERAÇÃO NÃO EFETUADA ********************************");
                        System.out.println("\n                     Saldo insuficiente para essa operação!!!                ");
                        break;
                        }

                        saldoAtual = saldoAtual - transferirValor;
                        System.out.print("\n******************************** OPERAÇÃO EFETUADA ********************************");
                        System.out.printf("\nA transferência de %.2f foi concluído", transferirValor);
                        System.out.printf("\nSaldo atualizado é: R$ %.2f%n: ", saldoAtual);
                        System.out.println();
                        break;

                case 4:
                    System.out.println("\nSaindo do programa... Obrigado por utilizar os serviços do Pet Bank!");
                    dados.close(); // Fechamento do scanner
                    return;

                default:
                    System.out.println("\nOpção inválido. Escolha um número entre 1 e 4.");
            }
        }
    }
}