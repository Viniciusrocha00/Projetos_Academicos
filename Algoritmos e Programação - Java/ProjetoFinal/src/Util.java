public class Util {

    // FUNCAO AUXILIAR - BUSCA LINEAR
    public static int buscarIndiceJogador(
            String[] nomes,
            int quantidadeJogadores,
            String nome
    ) {

        for (int i = 0; i < quantidadeJogadores; i++) {

            if (nomes[i].equalsIgnoreCase(nome)) {
                return i;
            }
        }

        return -1;
    }
}