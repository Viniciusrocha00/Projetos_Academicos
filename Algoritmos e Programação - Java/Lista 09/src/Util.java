import java.util.Scanner;

public class Util {

    static Scanner sc = new Scanner(System.in);

    public static double lerDouble(String mensagem) {
        System.out.print(mensagem);
        return sc.nextDouble();
    }

    public static int lerInt(String mensagem) {
        System.out.print(mensagem);
        return sc.nextInt();
    }

    public static double[] lerVetorDouble(int tamanho, String rotulo) {
        double[] vetor = new double[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = lerDouble(rotulo + (i + 1) + ": ");
        }
        return vetor;
    }

    public static int[] lerVetorInt(int tamanho, String rotulo) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = lerInt(rotulo + (i + 1) + ": ");
        }
        return vetor;
    }

    public static double calcularMedia(double[] vetor) {
        if (vetor == null || vetor.length == 0) {
            return 0;
        }

        double soma = 0;
        for (double v : vetor) {
            soma += v;
        }
        return soma / vetor.length;
    }
}