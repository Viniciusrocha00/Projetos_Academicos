public class Exercicio05 {
    public static void main(String[] args) {
        int qtdAlunos = Util.lerInt("Quantidade de alunos: ");
                double somaNotas = 0;
                int notasValidas = 0;

                for (int i = 0; i < qtdAlunos; i++) {
                double nota = Util.lerDouble("Nota: ");

                if (nota == -1) {
            break;
        }

            if (nota < 0 || nota > 10) {
                continue; // Ignora e vai para o próximo aluno
            }

            somaNotas += nota;
        }

        if (notasValidas > 0) {
                System.out.println("Soma das notas: " + somaNotas);
                System.out.println("Quantidade de notas válidas: " + notasValidas);
        } else {
            System.out.println("Nenhuma nota válida registrada");
        }
    }
}