import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //  Pedir o número ao usuário
        System.out.print("Digite o dia da semana (1-7): ");
        int dia = leitor.nextInt();

        // Switch Case
        switch (dia) {
            case 1:
                System.out.println("Segunda: Treino de Peito");
                break; //
            case 2:
                System.out.println("Terça: Treino de Costas");
                break;
            case 3:
                System.out.println("Quarta: Treino de Pernas");
                break;
            case 4:
                System.out.println("Quinta: Treino de Braço");
                break;
            case 5:
                System.out.println("Sexta: Treino de Ombro");
                break;
            case 6:
                System.out.println("Sábado: Cardio");
                break;
            case 7:
                System.out.println("Domingo: Descanso");
                break;
            default:
                // Se não for nenhum dos números de 1 a 7
                System.out.println("Dia inválido");
                break;
        }

        leitor.close();
    }
}