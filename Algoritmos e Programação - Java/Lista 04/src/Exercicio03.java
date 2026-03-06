import java.util.Scanner;

public class Exercicio03 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Passo 1: Pedir o valor da compra
        System.out.print("Entrada (Valor): ");
        double valorOriginal = leitor.nextDouble();

        // Passo 2: Pedir se possui cupom (1 para SIM, 0 para NÃO)
        System.out.print("Entrada (Cupom - 1 p/ Sim, 0 p/ Não): ");
        int entradaCupom = leitor.nextInt();

        // Passo 3: Converter a entrada para boolean
        // Se o usuário digitou 1, temCupom será true. Caso contrário, false.
        boolean temCupom = (entradaCupom == 1);

        // Passo 4: Chamar a função e guardar o valor final
        double valorFinal = calcularValorFinal(valorOriginal, temCupom);

        // Passo 5: Exibir o resultado
        System.out.println("Valor final da compra: R$ " + valorFinal);

        leitor.close();
    }

    // O OPERÁRIO (Função calcularValorFinal)
    // Recebe o valor (double) e a existência do cupom (boolean) 
    public static double calcularValorFinal(double valorCompra, boolean cupomDesconto) {
        if (cupomDesconto) {
            // Se tiver cupom (true), aplica 10% de desconto [cite: 46]
            // Multiplicar por 0.90 é o mesmo que tirar 10%
            return valorCompra * 0.90;
        } else {
            // Caso contrário, mantém o valor original [cite: 47]
            return valorCompra;
        }
    }
}