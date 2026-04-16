public class Tarefa03 {

    // Método para definir a categoria do time com base nos pontos
    public static String definirCategoria(int pontos) {

        if (pontos >= 20) {
            return "LÍDER";
        } else if (pontos >= 14) {
            return "G4 - ZONA DE CLASSIFICAÇÃO";
        } else if (pontos >= 8) {
            return "MEIO DE TABELA";
        } else if (pontos >= 4) {
            return "ALERTA";
        } else {
            return "REBAIXAMENTO";
        }
    }

    public static void main(String[] args) {

        // Criando um time de exemplo
        Time time = new Time("Flamengo", 0, 0, 0, 0, 0, 0);

        // Simulando algumas partidas
        time = time.adicionarPartida(3, 1); // vitória
        time = time.adicionarPartida(2, 2); // empate
        time = time.adicionarPartida(0, 1); // derrota
        time = time.adicionarPartida(4, 0); // vitória

        // Exibindo resultados
        System.out.println("=== DADOS DO TIME ===");
        System.out.println("Nome: " + time.nome());
        System.out.println("Pontos: " + time.pontos());
        System.out.println("Vitórias: " + time.vitorias());
        System.out.println("Empates: " + time.empates());
        System.out.println("Derrotas: " + time.derrotas());
        System.out.println("Saldo de gols: " + time.getSaldoGols());

        // Categoria
        String categoria = definirCategoria(time.pontos());
        System.out.println("Categoria: " + categoria);
    }
}