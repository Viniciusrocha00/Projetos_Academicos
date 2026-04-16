public class Tarefa01 {

    public static void main(String[] args) {
        // Dados de entrada fixos conforme o projeto
                String[] partidas = {
                "Flamengo:3:1: Palmeiras",
                "Corinthians:0:0:São Paulo",
                "Atletico-MG:2:2:Fluminense",
                "Palmeiras: 1:0: Corinthians",
                "São Paulo:3:2: Flamengo",
                "Fluminense:0:1: Atletico-MG",
                "Flamengo:2:0: Corinthians",
                "Palmeiras:4:1: Fluminense",
                "São Paulo:0:0: Atletico-MG",
                "Corinthians:1:3: Fluminense",
                "Atletico-MG:0:2:Flamengo",
                "Fluminense:1:1:São Paulo"
        };

        System.out.println("=== PROCESSAMENTO DE PARTIDAS (TAREFA 1) ===");

        // Percorrendo todas as partidas com laço for
        for (int i = 0; i < partidas.length; i++) {
            String[] dados = parsearPartida(partidas[i]);

            // Se o retorno não for nulo, imprime os dados limpos
            if (dados != null) {
                System.out.printf("Partida %02d: %s %s x %s %s\n",
                        (i + 1), dados[0], dados[1], dados[2], dados[3]);
            }
        }
    }

    public static String[] parsearPartida(String linha) {
        // Requisito: usar split(":")
                String[] partes = linha.split(":");

        // Validação de erro
        if (partes.length < 4) {
            System.out.println("[ERRO] Linha inválida: " + linha);
            return null;
        }

        // Requisitos: trim() para espaços e toUpperCase() para normalizar
                String timeCasa = partes[0].trim().toUpperCase();
        String golsCasa = partes[1].trim();
        String golsFora = partes[2].trim();
        String timeFora = partes[3].trim().toUpperCase();

        return new String[]{timeCasa, golsCasa, golsFora, timeFora};
    }
}