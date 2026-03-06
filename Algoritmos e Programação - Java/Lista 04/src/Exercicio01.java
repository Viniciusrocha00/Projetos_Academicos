import java.util.Scanner;

public class Exercicio01 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Entrada (Missões): ");
        int missoes = leitor.nextInt();

        System.out.print("Entrada (XP por missão): ");
        int xpPorMissao = leitor.nextInt();

        // CHAMADA DA FUNÇÃO: O main envia os dados e espera o resultado
        int xpTotal = calcularXP(missoes, xpPorMissao);

        // Saída de dados
        System.out.println("XP Total ganho: " + xpTotal);

        leitor.close();
    }

    public static int calcularXP(int quantidadeMissoes, int xpPorMissao) {
        int resultado = quantidadeMissoes * xpPorMissao;
        return resultado;
    }
}