public class ProjetoFinal {

    // Vetores paralelos
    static String[] nomes = new String[8];
    static int[] pontuacoes = new int[8];

    // Controle de jogadores cadastrados
    static int quantidadeJogadores = 0;

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {

            System.out.println("\n===== TORNEIO DE GAMES =====");
            System.out.println("1 - Cadastrar Jogador");
            System.out.println("2 - Registrar Pontuacao");
            System.out.println("3 - Exibir Ranking");
            System.out.println("4 - Buscar Jogador");
            System.out.println("5 - Encerrar Torneio");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    cadastrarJogador(scanner);
                    break;

                case 2:
                    registrarPontuacao(scanner);
                    break;

                case 3:
                    exibirRanking();
                    break;

                case 4:
                    buscarJogador(scanner);
                    break;

                case 5:
                    encerrarTorneio();
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }

        scanner.close();
    }

    // OPCAO 1 - CADASTRAR JOGADOR
    public static void cadastrarJogador(java.util.Scanner scanner) {

        if (quantidadeJogadores >= 8) {
            System.out.println("Torneio cheio! Nao e possivel cadastrar mais jogadores.");
            return;
        }

        System.out.print("Nome do jogador: ");
        String nome = scanner.nextLine();

        int posicao = Util.buscarIndiceJogador(
                nomes,
                quantidadeJogadores,
                nome
        );

        // Verifica se jogador ja existe
        if (posicao != -1) {
            System.out.println("Jogador ja cadastrado.");
            return;
        }

        nomes[quantidadeJogadores] = nome;
        pontuacoes[quantidadeJogadores] = 0;

        quantidadeJogadores++;

        System.out.println("Jogador \"" + nome + "\" cadastrado com sucesso! ("
                + quantidadeJogadores + "/8)");
    }

    // OPCAO 2 - REGISTRAR PONTUACAO
    public static void registrarPontuacao(java.util.Scanner scanner) {

        System.out.print("Nome do jogador: ");
        String nome = scanner.nextLine();

        int posicao = Util.buscarIndiceJogador(
                nomes,
                quantidadeJogadores,
                nome
        );

        if (posicao == -1) {
            System.out.println("Jogador nao encontrado no torneio.");
            return;
        }

        System.out.print("Pontuacao: ");
        int pontos = scanner.nextInt();
        scanner.nextLine();

        if (pontos < 0) {
            System.out.println("Pontuacoes negativas nao sao permitidas.");
            return;
        }

        pontuacoes[posicao] = pontos;

        System.out.println("Pontuacao de " + nomes[posicao]
                + " registrada: " + pontos + " pontos.");
    }

    // OPCAO 3 - EXIBIR RANKING
    public static void exibirRanking() {

        if (quantidadeJogadores == 0) {
            System.out.println("Nenhum jogador cadastrado.");
            return;
        }

        // Copias para nao alterar os vetores originais
        String[] nomesRanking = new String[quantidadeJogadores];
        int[] pontosRanking = new int[quantidadeJogadores];

        for (int i = 0; i < quantidadeJogadores; i++) {
            nomesRanking[i] = nomes[i];
            pontosRanking[i] = pontuacoes[i];
        }

        // Bubble Sort
        for (int i = 0; i < quantidadeJogadores - 1; i++) {

            for (int j = 0; j < quantidadeJogadores - 1 - i; j++) {

                if (pontosRanking[j] < pontosRanking[j + 1]) {

                    // Troca pontuacoes
                    int tempPontos = pontosRanking[j];
                    pontosRanking[j] = pontosRanking[j + 1];
                    pontosRanking[j + 1] = tempPontos;

                    // Troca nomes
                    String tempNome = nomesRanking[j];
                    nomesRanking[j] = nomesRanking[j + 1];
                    nomesRanking[j + 1] = tempNome;
                }
            }
        }

        System.out.println("\n=== RANKING DO TORNEIO ===");

        for (int i = 0; i < quantidadeJogadores; i++) {

            if (pontosRanking[i] == 0) {

                System.out.println((i + 1) + ". "
                        + nomesRanking[i]
                        + " - sem pontuacao");

            } else {

                System.out.println((i + 1) + ". "
                        + nomesRanking[i]
                        + " - "
                        + pontosRanking[i]
                        + " pts");
            }
        }
    }

    // OPCAO 4 - BUSCAR JOGADOR
    public static void buscarJogador(java.util.Scanner scanner) {

        System.out.print("Nome do jogador: ");
        String nome = scanner.nextLine();

        int posicao = Util.buscarIndiceJogador(
                nomes,
                quantidadeJogadores,
                nome
        );

        if (posicao == -1) {

            System.out.println("Jogador nao encontrado no torneio.");

        } else {

            System.out.println("Jogador: "
                    + nomes[posicao]
                    + " | Pontuacao atual: "
                    + pontuacoes[posicao]
                    + " pts");
        }
    }

    // OPCAO 5 - ENCERRAR TORNEIO
    public static void encerrarTorneio() {

        System.out.println("\n=== TORNEIO ENCERRADO ===");

        if (quantidadeJogadores == 0) {
            System.out.println("Nenhum jogador cadastrado. Encerrando...");
            return;
        }

        int maiorPontuacao = pontuacoes[0];
        String campeao = nomes[0];

        for (int i = 1; i < quantidadeJogadores; i++) {

            if (pontuacoes[i] > maiorPontuacao) {

                maiorPontuacao = pontuacoes[i];
                campeao = nomes[i];
            }
        }

        System.out.println("Campeao: "
                + campeao
                + " com "
                + maiorPontuacao
                + " pontos!");

        System.out.println("Parabens ao vencedor! GG WP!");
    }
}