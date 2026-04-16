public record Time(
        String nome,
        int pontos,
        int vitorias,
        int empates,
        int derrotas,
        int golsPro,
        int golsContra
) {

    public Time adicionarPartida(int meusGols, int golsAdversario) {
        int novosPontos = 0;
        int novaVit = 0, novaEmp = 0, novaDer = 0;

        if (meusGols > golsAdversario) {
            novosPontos = 3;
            novaVit = 1;
        } else if (meusGols == golsAdversario) {
            novosPontos = 1;
            novaEmp = 1;
        } else {
            novaDer = 1;
        }

        return new Time(
                this.nome,
                this.pontos + novosPontos,
                this.vitorias + novaVit,
                this.empates + novaEmp,
                this.derrotas + novaDer,
                this.golsPro + meusGols,
                this.golsContra + golsAdversario
        );
    }

    public int getSaldoGols() {
        return golsPro - golsContra;
    }
}