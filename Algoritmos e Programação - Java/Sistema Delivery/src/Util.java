import java.util.Scanner;

public class Util {
    private static Scanner leitor = new Scanner(System.in);


    public static int lerInt(String mensagem) {
        System.out.print(mensagem);
        int valor = leitor.nextInt();
        leitor.nextLine();
        return valor;
    }

    public static double lerDouble(String mensagem) {
        System.out.print(mensagem);
        double valor = leitor.nextDouble();
        leitor.nextLine();
        return valor;
    }


    public static boolean lerBoolean(String mensagem) {
        System.out.print(mensagem);
        int entrada = leitor.nextInt();
        leitor.nextLine();
        return entrada == 1;
    }

    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return leitor.nextLine();
    }

    public static void main(String[] args) {

    }
}