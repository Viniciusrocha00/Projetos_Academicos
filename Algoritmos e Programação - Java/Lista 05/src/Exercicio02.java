public class Exercicio02 {
    public static void main(String[] args) {
        double totalGorjetas = 0;
        double valor = -1; // Inicializa com valor diferente de 0 para entrar no loop

        while (valor != 0) {
            valor = Util.lerDouble("Gorjeta: ");
            totalGorjetas += valor;
        }

        System.out.println("Total de gorjetas: " + totalGorjetas);
    }
}