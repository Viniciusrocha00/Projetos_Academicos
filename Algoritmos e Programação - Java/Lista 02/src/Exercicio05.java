import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Sistema de Bônus TechCorp ---");

        // Entrada 1: Projetos
        System.out.print("Digite a quantidade de projetos entregues este ano: ");
        int projetos = leitor.nextInt();

        // Entrada 2: Tempo de casa
        System.out.print("Digite seus anos de experiência na empresa: ");
        int anosExperiencia = leitor.nextInt();

        // Lógica de Decisão com || (OU)
        if (projetos > 10 || anosExperiencia >= 5) {
            System.out.println("Parabéns! Você tem direito ao bônus de 20%! 💰");
        } else {
            System.out.println("Continue se esforçando! Bônus não disponível este ano. 📈");
        }

        leitor.close();
    }
}