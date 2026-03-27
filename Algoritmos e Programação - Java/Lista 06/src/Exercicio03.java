public class Exercicio03 {
    public static void main(String[] args) {
        int qtdAvaliacoes = Util.lerInt("Quantidade de avaliações: ");
        int positivas = 0;
        int negativas = 0;


        for (int i = 0; i < qtdAvaliacoes; i++) {
                int nota = Util.lerInt("Nota: ");

                if (nota >= 4) {
                    positivas++;
                } else {
                    negativas++;
        }
        }

        System.out.println("Avaliações positivas: " + positivas);
                System.out.println("Avaliações negativas: " + negativas);
    }
}