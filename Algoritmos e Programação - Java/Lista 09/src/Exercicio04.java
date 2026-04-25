public class Exercicio04 {
    public static void main(String[] args) {
        // 1. Criar um vetor de 3 posições para acumular os votos
        // Índice 0 = Candidato 1, Índice 1 = Candidato 2, Índice 2 = Candidato 3
        int[] votos = new int[3];

        // 2. Pedir o número total de votos que serão registrados
        int totalVotos = Util.lerInt("Total de votos: ");

        // 3. Para cada voto, ler o número do candidato (1, 2 ou 3)
        for (int i = 0; i < totalVotos; i++) {
            int escolha = Util.lerInt("Voto: ");

            // 4. Incrementar a posição correspondente no vetor
            // Subtraímos 1 da escolha pois o vetor começa no índice 0
            if (escolha >= 1 && escolha <= 3) {
                votos[escolha - 1]++;
            } else {
                System.out.println("Voto inválido! Escolha entre 1, 2 ou 3.");
                i--; // Desconta a rodada para o usuário votar novamente
            }
        }

        // 5. Exibir a quantidade de votos de cada candidato
        System.out.println("\nResultado:");
        for (int i = 0; i < votos.length; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + votos[i] + " votos");
        }

        // 6. Determinar o vencedor
        int vencedor = 0;
        if (votos[1] > votos[vencedor]) vencedor = 1;
        if (votos[2] > votos[vencedor]) vencedor = 2;

        System.out.println("Vencedor: Candidato " + (vencedor + 1));
    }
}