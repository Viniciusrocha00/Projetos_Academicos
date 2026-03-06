import java.util.Scanner;

public class Exercicio02 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Passo 1: Pedir o nome
        System.out.print("Entrada (Nome): ");
        String nomeUsuario = leitor.nextLine();

        // Passo 2: Pedir o número favorito
        System.out.print("Entrada (Número): ");
        int numero = leitor.nextInt();

        // Passo 3: Chamar a função e guardar o Nickname gerado
        String nicknameFinal = gerarNickname(nomeUsuario, numero);

        // Passo 4: Exibir o resultado
        System.out.println("Seu nickname gerado é: " + nicknameFinal);

        leitor.close();
    }

    public static String gerarNickname(String nome, int numeroFavorito) {

        return nome + "_" + numeroFavorito; // Formato: nome_numero
    }
}