import java.util.Scanner;

public class Util {
    // Scanner estático para ser usado por todos os métodos da classe
    private static Scanner leitor = new Scanner(System.in);

    // Método para ler textos
    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return leitor.nextLine();
    }

    // Método para ler números inteiros
    public static int lerInt(String mensagem) {
        System.out.print(mensagem);
        int valor = leitor.nextInt();
        leitor.nextLine(); // Limpa o buffer do teclado
        return valor;
    }

    // Método para ler números decimais
    public static double lerDouble(String mensagem) {
        System.out.print(mensagem);
        double valor = leitor.nextDouble();
        leitor.nextLine(); // Limpa o buffer do teclado
        return valor;
    }

    // Método para ler valores booleanos
    public static boolean lerBoolean(String mensagem) {
        System.out.print(mensagem);
        int entrada = leitor.nextInt();
        leitor.nextLine(); // Limpa o buffer
        return entrada == 1;
    }
}