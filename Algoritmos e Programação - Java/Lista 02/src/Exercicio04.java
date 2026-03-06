import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- O Sabadou do Aluno ---");

        // Dia de semana
        System.out.print("Qual o dia? (1-Sábado, 2-Domingo, 3-Dia de Semana): ");
        int dia = leitor.nextInt();

        // 1 - Sim, 0 - Não
        System.out.print("Terminou os trabalhos? (1-SIM / 0-NÃO): ");
        int trabalhosProntos = leitor.nextInt();

        // Lógica
        if (dia == 1 || dia == 2 || trabalhosProntos == 1) {
            System.out.println("Hora de relaxar! 🍿");
        } else {
            System.out.println("Ainda há trabalho a fazer. Foco nos estudos! 📚✍️");
        }

        leitor.close();
    }
}