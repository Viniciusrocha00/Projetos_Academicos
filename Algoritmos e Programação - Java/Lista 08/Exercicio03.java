public class Exercicio03 {
    public static void main(String[] args) {
        String comentario = Util.lerString("Digite seu comentário sobre o projeto: ");
        String comentarioMinusculo = comentario.toLowerCase();

        if (comentarioMinusculo.contains("ruim") || comentarioMinusculo.contains("horrível") || comentarioMinusculo.contains("horrivel")){
            System.out.println("Seu comentário foi marcado para revisão.!");

            // Censura as palavras (usando regex para ignorar case no replace)
            String censurado = comentario.replaceAll("(?i)ruim", "***")
                    .replaceAll("(?i)horrível", "***").replaceAll("(?i)horrivel", "***");

            System.out.println("Versão censurada: " + censurado);
        } else {
            System.out.println("Comentário publicado com sucesso!");
        }
    }
}