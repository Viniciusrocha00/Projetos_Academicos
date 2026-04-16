import java.util.ArrayList;
import java.util.List;

public class Tarefa02 {

    public static void main(String[] args) {
        String[] partidas = {
                "Flamengo:3:1:Palmeiras", "Corinthians:0:0:São Paulo",
                "Atletico-MG:2:2:Fluminense", "Palmeiras:1:0:Corinthians",
                "São Paulo:3:2:Flamengo", "Fluminense:0:1:Atletico-MG",
                "Flamengo:2:0:Corinthians", "Palmeiras:4:1:Fluminense",
                "São Paulo:0:0:Atletico-MG", "Corinthians:1:3:Fluminense",
                "Atletico-MG:0:2:Flamengo", "Fluminense:1:1:São Paulo"
        };

        List<Time> times = new ArrayList<>();

        for (String linha : partidas) {

            String[] dados = linha.split(":");

            if (dados.length == 4) {
                String nomeCasa = dados[0].trim();
                int golsCasa = Integer.parseInt(dados[1].trim());
                int golsFora = Integer.parseInt(dados[2].trim());
                String nomeFora = dados[3].trim();

                int idxCasa = buscarIndiceTime(nomeCasa, times);
                int idxFora = buscarIndiceTime(nomeFora, times);

                Time casa = (idxCasa >= 0)
                        ? times.get(idxCasa)
                        : new Time(nomeCasa, 0, 0, 0, 0, 0, 0);

                Time fora = (idxFora >= 0)
                        ? times.get(idxFora)
                        : new Time(nomeFora, 0, 0, 0, 0, 0, 0);

                // Atualiza (gera NOVOS objetos)
                casa = casa.adicionarPartida(golsCasa, golsFora);
                fora = fora.adicionarPartida(golsFora, golsCasa);

                // Substitui ou adiciona
                if (idxCasa >= 0) {
                    times.set(idxCasa, casa);
                } else {
                    times.add(casa);
                }

                if (idxFora >= 0) {
                    times.set(idxFora, fora);
                } else {
                    times.add(fora);
                }
            }
        }

        // Exibição com while (como pedido)
        System.out.println("=== RESUMO DA PONTUAÇÃO ===");
        int i = 0;
        while (i < times.size()) {
            Time t = times.get(i);
            System.out.println(
                    t.nome() + " | " +
                            t.pontos() + " pts | " +
                            t.vitorias() + "V " +
                            t.empates() + "E " +
                            t.derrotas() + "D | " +
                            "Saldo: " + t.getSaldoGols()
            );
            i++;
        }
    }

    private static int buscarIndiceTime(String nome, List<Time> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).nome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }
}