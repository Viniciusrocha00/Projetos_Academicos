public class Exercicio03 {
    public static void main(String[] args) {
        // 1. Pedir o número de participantes [cite: 43]
        int qtdParticipantes = Util.lerInt("Quantidade de participantes: ");

        // 2. Criar e ler o vetor de placares [cite: 14, 44]
        // Usamos o método da sua classe Util para carregar os dados
        int[] placares = Util.lerVetorInt(qtdParticipantes, "Placar ");

        // 3. Inicializar as variáveis de maior e menor com o primeiro elemento do vetor
        int maior = placares[0];
        int menor = placares[0];

        // 4. Percorrer o vetor para encontrar o maior e o menor placar [cite: 45]
        for (int i = 0; i < placares.length; i++) {
            if (placares[i] > maior) {
                maior = placares[i]; // Atualiza se encontrar um valor maior
            }
            if (placares[i] < menor) {
                menor = placares[i]; // Atualiza se encontrar um valor menor
            }
        }

        // 5. Exibir os dois valores ao final [cite: 46]
        System.out.println("Maior placar: " + maior);
        System.out.println("Menor placar: " + menor);
    }
}