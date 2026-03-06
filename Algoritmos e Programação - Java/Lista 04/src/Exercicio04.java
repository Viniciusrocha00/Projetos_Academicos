import java.util.Scanner;
import java.util.Locale;

public class Exercicio04 {

    // Função: Calcular apenas o Salário Base
    // Recebe horas normais e o valor da hora
    public static double calcularSalarioBase(int horasTrabalhadas, double valorHora) {
        return horasTrabalhadas * valorHora;
    }

    // 2. Função: Calcular o Salário Final (com a lógica da hora extra)
    // Recebe horas normais, valor da hora e a quantidade de extras
    public static double calcularSalarioFinal(int horas, double valor, int extras) {
        // Passo A: Chamamos a função anterior para pegar o valor base
        double base = calcularSalarioBase(horas, valor);

        // Passo B: Calculamos a hora extra com adicional de 50% (valor * 1.5)
        double valorHoraExtra = valor * 1.5;
        double totalDasExtras = extras * valorHoraExtra;

        // Passo C: Retornamos a soma de tudo
        return base + totalDasExtras;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US); // Para aceitarmos o ponto (.) nos decimais

        System.out.println("=== SISTEMA DE FOLHA DE PAGAMENTO ===");

        // Pedindo os dados conforme o enunciado
        System.out.print("Horas trabalhadas no mês: ");
        int horasNormais = leitor.nextInt();

        System.out.print("Valor da hora: ");
        double valorHora = leitor.nextDouble();

        System.out.print("Quantidade de horas extras: ");
        int horasExtras = leitor.nextInt();

        // Chamamos a função principal
        double salarioTotal = calcularSalarioFinal(horasNormais, valorHora, horasExtras);

        // Exibimos o resultado
        System.out.println("Salário final: R$ " + salarioTotal);

        leitor.close();
    }
}