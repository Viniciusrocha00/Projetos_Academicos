import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //
        System.out.println("Tipos de conta: corrente, poupanca, salario, premium");
        System.out.print("Digite o tipo da sua conta: ");

        //
        String tipoConta = leitor.next().toLowerCase();

        // verificar os benefícios
        switch (tipoConta) {
            case "corrente" -> {
                System.out.println("Benefício: Cartão de débito e Cheque Especial");
            }
            case "poupanca" -> {
                System.out.println("Benefício: Rendimento de 0.5%");
            }
            case "salario" -> {
                System.out.println("Benefício: Isenta de Taxas");
            }
            case "premium" -> {
                System.out.println("Benefício: Cartão Black e Investimentos Exclusivos");
            }
            default -> {
                // algo que não está na lista
                System.out.println("Erro: Tipo de conta inválido.");
            }
        }

        leitor.close();
    }
}