import java.util.Scanner;
import java.util.Locale;

public class Exercicio05 {

    // 1. Função para calcular o estoque de segurança (mínimo)
    public static int calcularEstoqueMinimo(int mediaVendasDiarias, int tempoReposicaoDias) {
        // Fórmula: vendas por dia * dias para o fornecedor entregar
        return mediaVendasDiarias * tempoReposicaoDias;
    }

    // 2. Função para decidir se precisamos comprar mais
    public static String verificarNecessidadeCompra(int estoqueAtual, int estoqueMinimo) {
        if (estoqueAtual < estoqueMinimo) {
            return "Necessário realizar novo pedido ao fornecedor";
        } else {
            return "Estoque dentro do nível seguro";
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.println("=== SISTEMA DE GESTÃO DE ESTOQUE ===");

        // Passo 1: Pedir dados ao usuário
        System.out.print("Média de vendas diárias: ");
        int media = leitor.nextInt();

        System.out.print("Tempo de reposição (em dias): ");
        int tempo = leitor.nextInt();

        System.out.print("Estoque atual: ");
        int atual = leitor.nextInt();

        // Passo 2: Calcular o mínimo necessário
        int minNecessario = calcularEstoqueMinimo(media, tempo);

        // Passo 3: Passar o resultado do cálculo para a função de verificação
        String situacao = verificarNecessidadeCompra(atual, minNecessario);

        // Passo 4: Exibir os resultados [cite: 115]
        System.out.println("\nEstoque mínimo necessário: " + minNecessario);
        System.out.println("Situação: " + situacao);

        leitor.close();
    }
}