import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Tarefa04 {

    public static void main(String[] args) {
        // 1. Obtendo os dados brutos (Array fixo do projeto)
                String[] partidas = {
                "Flamengo:3:1: Palmeiras", "Corinthians:0:0:São Paulo",
                "Atletico-MG:2:2:Fluminense", "Palmeiras: 1:0: Corinthians",
                "São Paulo:3:2: Flamengo", "Fluminense:0:1: Atletico-MG",
                "Flamengo:2:0: Corinthians", "Palmeiras:4:1: Fluminense",
                "São Paulo:0:0: Atletico-MG", "Corinthians:1:3: Fluminense",
                "Atletico-MG:0:2:Flamengo", "Fluminense:1:1:São Paulo"
        };

        // 2. Processando os dados para criar a lista de objetos
        List<Time> listaDeTimes = processarCampeonato(partidas);

        // 3. Executando as análises solicitadas (Requisitos da Tarefa 4)
                executarAnalises(listaDeTimes);
    }

    public static void executarAnalises(List<Time> times) {
        System.out.println("\n=== ANÁLISE COM STREAMS (TAREFA 4) ===");

        // Maior número de gols marcados (max + comparator)
                times.stream()
                        .max(Comparator.comparingInt(Time::golsPro))
                        .ifPresent(t -> System.out.println("Time com mais gols: " + t.nome() + " (" + t.golsPro() + ")"));

        // Média de gols por partida (mapToInt + average)
        double media = times.stream()
                .mapToInt(Time::golsPro)
                .average()
                .orElse(0.0);
        System.out.printf("Média de gols por time: %.2f\n", media);

        // Zona de rebaixamento - menos de 4 pontos (filter + collect)
                List<Time> rebaixados = times.stream()
                .filter(t -> t.pontos() < 4)
                .collect(Collectors.toList());
        System.out.println("No rebaixamento: " + rebaixados.stream().map(Time::nome).collect(Collectors.joining(", ")));

        // Ordem decrescente de pontos (sorted + forEach)
                System.out.println("\n--- CLASSIFICAÇÃO FINAL ---");
        times.stream()
                .sorted(Comparator.comparingInt(Time::pontos).reversed())
                .forEach(t -> System.out.println(t.nome() + ": " + t.pontos() + " pts"));
    }

    // Método auxiliar para transformar o array de Strings na lista de Records Time
    private static List<Time> processarCampeonato(String[] partidas) {
        List<Time> times = new ArrayList<>();
        for (String linha : partidas) {
            String[] dados = linha.split(":"); // Simplificado para a execução da tarefa 4
            if (dados.length == 4) {
                String nomeCasa = dados[0].trim().toUpperCase();
                String nomeFora = dados[3].trim().toUpperCase();
                int gCasa = Integer.parseInt(dados[1].trim());
                int gFora = Integer.parseInt(dados[2].trim());

                // Lógica de atualização do Record (Imutável)
                times = atualizarLista(times, nomeCasa, gCasa, gFora);
                times = atualizarLista(times, nomeFora, gFora, gCasa);
            }
        }
        return times;
    }

    private static List<Time> atualizarLista(List<Time> lista, String nome, int golsMarcados, int golsSofridos) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).nome().equals(nome)) {
                lista.set(i, lista.get(i).adicionarPartida(golsMarcados, golsSofridos));
                return lista;
            }
        }
        Time novo = new Time(nome, 0, 0, 0, 0, 0, 0).adicionarPartida(golsMarcados, golsSofridos);
        lista.add(novo);
        return lista;
    }
}