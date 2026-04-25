public class Exercicio01 {
    public static void main(String[] args) {
        // Pedir ao usuário o número de alunos [cite: 13]
        int qtdAlunos = Util.lerInt("Quantidade de alunos: ");

        // Criar um vetor do tamanho informado utilizando a classe Util [cite: 14]
        // O método lerVetorDouble já utiliza um laço for internamente [cite: 15]
        double[] notas = Util.lerVetorDouble(qtdAlunos, "Nota do aluno ");

        // Percorrer o vetor para calcular a média das notas [cite: 16]
        double media = Util.calcularMedia(notas);

        // Exibir o resultado final [cite: 16]
        System.out.println("Media da turma: " + media);
    }
}