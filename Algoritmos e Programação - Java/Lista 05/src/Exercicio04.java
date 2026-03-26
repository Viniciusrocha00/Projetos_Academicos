public class Exercicio04 {
    public static void main(String[] args) {
        double somaNotas = 0;
        int totalAvaliacoes = 0;

        while (true) {
            int nota = Util.lerInt("Nota (1-5 ou 0 para sair): ");

            if (nota == 0) break;

            if (nota >= 1 && nota <= 5) {
                somaNotas += nota;
                totalAvaliacoes++;
            }
        }

        if (totalAvaliacoes > 0) {
            double media = somaNotas / totalAvaliacoes;
            System.out.println("Média das avaliações: " + media);
        } else {
            System.out.println("Nenhuma avaliação registrada");
        }
    }
}