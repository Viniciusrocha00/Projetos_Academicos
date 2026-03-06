import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Exibindo o menu conforme o enunciado
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Listar usuários");
        System.out.println("3 - Atualizar usuário");
        System.out.println("4 - Remover usuário");
        System.out.println("0 - Sair");
        System.out.print("\nDigite uma opção: ");

        int opcao = leitor.nextInt();

        // O switch moderno permite usar vírgula para agrupar casos
        switch (opcao) {
            case 1, 3 -> {
                // Opções 1 e 3: Abrir módulo de edição
                System.out.println("Abrindo módulo de edição de usuário...");
            }
            case 2 -> {
                // Opção 2: Remover usuário
                System.out.println("Removendo usuário...");
            }
            case 4 -> {
                // Opção 4: Encerrar sistema
                System.out.println("Encerrando sistema...");
            }
            case 0 -> {
                // Opção 0: Sair
                System.out.println("Saindo...");
            }
            default -> {
                // Qualquer outro valor
                System.out.println("Opção inválida.");
            }
        }

        leitor.close();
    }
}