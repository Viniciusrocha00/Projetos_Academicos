import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a pontuação final do jogador: ");
        int pontos = leitor.nextInt();

        //  Verificação de erro (Número negativo)
        if (pontos < 0) {
            System.out.println("Erro: O nível informado não pode ser negativo.");
        } else {

            int categoria;

            if (pontos <= 999) {
                categoria = 0; // Representa Bronze
            } else if (pontos <= 1999) {
                categoria = 1; // Representa Prata
            } else if (pontos <= 2999) {
                categoria = 2; // Representa Ouro
            } else {
                categoria = 3; // Representa Diamante
            }

            // resultado baseado na categoria
            System.out.print("Nível alcançado: ");
            switch (categoria) {
                case 0:
                    System.out.println("Bronze");
                    break;
                case 1:
                    System.out.println("Prata");
                    break;
                case 2:
                    System.out.println("Ouro");
                    break;
                case 3:
                    System.out.println("Diamante");
                    break;
            }
        }

        leitor.close();
    }
}