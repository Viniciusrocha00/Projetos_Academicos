import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.print("Número 1: ");
        double num1 = leitor.nextDouble();

        System.out.print("Número 2: ");
        double num2 = leitor.nextDouble();

        // Entrada da operação
        System.out.print("Operação (+, -, *, /): ");
        String operacao = leitor.next();

        // Criamos a variável resultado antes para usá-la dentro do switch
        double resultado = 0;

        //
        switch (operacao) {
            case "+" -> resultado = num1 + num2;
            case "-" -> resultado = num1 - num2;
            case "*" -> resultado = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero!");
                    leitor.close();
                    return; // Encerra o programa para não mostrar resultado errado
                }
                resultado = num1 / num2;
            }
            // Lançando a exceção conforme o enunciado
            default -> throw new IllegalArgumentException("Operação inválida: " + operacao);
        }

        //  Exibição do resultado
        System.out.println("Resultado: " + resultado);

        leitor.close();
    }
}