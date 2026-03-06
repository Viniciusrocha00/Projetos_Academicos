import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0-100): ");
        int nota = leitor.nextInt();


        if (nota < 0 || nota > 100) {
            leitor.close();
            throw new IllegalArgumentException("Nota inválida! A nota deve estar entre 0 e 100.");
        }

        //  Lógica
        char conceito;
        if (nota >= 90) {
            conceito = 'A';
        } else if (nota >= 80) {
            conceito = 'B';
        } else if (nota >= 70) {
            conceito = 'C';
        } else if (nota >= 60) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }


        switch (conceito) {
            case 'A', 'B', 'C', 'D', 'E' ->
                    System.out.println("Conceito final: " + conceito);
            default ->
                    System.out.println("Erro ao processar conceito.");
        }

        leitor.close();
    }
}