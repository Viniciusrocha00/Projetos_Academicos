import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- 🖥️ Analisador de Crédito: Banco Geek ---");

        // Entrada de dados
        System.out.print("Digite seu rendimento mensal: R$ ");
        double rendimento = leitor.nextDouble();

        System.out.print("Digite o valor da parcela do PC: R$ ");
        double valorParcela = leitor.nextDouble();

        System.out.print("Digite seu Score de crédito (0-1000): ");
        int score = leitor.nextInt();

        // Cálculo da regra: 30% do rendimento
        double limiteParcela = rendimento * 0.30;

        // Regra de Decisão
        if (valorParcela <= limiteParcela && score >= 600) {
            System.out.println("Empréstimo APROVADO! Aproveite seu PC Gamer! 🖥️🎮");
        } else {
            System.out.println("Empréstimo NEGADO. Tente novamente em 6 meses. ❌");
        }

        leitor.close();
    }
}