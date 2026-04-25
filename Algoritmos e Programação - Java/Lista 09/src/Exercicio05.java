public class Exercicio05 {
    public static void main(String[] args) {
        // 1. Pedir o número de leituras planejado
        int totalPrevisto = Util.lerInt("Numero de leituras: ");

        // 2. Criar o vetor para armazenar apenas as leituras válidas
        double[] leituras = new double[totalPrevisto];
        int validas = 0;
        double soma = 0;

        // 3. Laço de repetição com regras de interrupção
        for (int i = 0; i < totalPrevisto; i++) {
            double temp = Util.lerDouble("Temperatura: ");

            // Se digitar 999, encerra a leitura imediatamente [cite: 75]
            if (temp == 999) {
                break;
            }

            // Se fora do intervalo -50 a 50, ignora e pula para a próxima volta
            if (temp < -50 || temp > 50) {
                continue;
            }

            // Se chegou aqui, a leitura é válida: armazena e acumula [cite: 71, 76]
            leituras[validas] = temp;
            soma += temp;
            validas++;
        }

        // 4. Verificação de dados registrados
        if (validas == 0) {
            System.out.println("Nenhuma leitura valida registrada");
        } else {
            // Calcular a média das leituras válidas [cite: 76]
            double media = soma / validas;

            // Contar quantas leituras ficaram acima da média [cite: 77]
            int acimaMedia = 0;
            for (int i = 0; i < validas; i++) {
                if (leituras[i] > media) {
                    acimaMedia++;
                }
            }

            // Exibir resultados finais [cite: 77, 83]
            System.out.println("Media das leituras validas: " + media);
            System.out.println("Leituras acima da media: " + acimaMedia);
        }
    }
}