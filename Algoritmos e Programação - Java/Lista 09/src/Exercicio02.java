public class Exercicio02 {
    public static void main(String[] args) {
        // 1. Pedir o número de produtos [cite: 28]
        int qtdProdutos = Util.lerInt("Quantidade de produtos: ");

        // 2. Criar o vetor e ler a quantidade de cada produto [cite: 26, 29]
        // Utilizamos o método da classe Util para preencher o array
        int[] estoque = Util.lerVetorInt(qtdProdutos, "Estoque produto ");

        // 3. Percorrer o vetor e contar quantos têm estoque menor que 5 [cite: 30]
        int contadorBaixoEstoque = 0;
        for (int i = 0; i < estoque.length; i++) {
            if (estoque[i] < 5) {
                contadorBaixoEstoque++; // Incrementa o contador se for menor que 5
            }
        }

        // 4. Exibir o total de produtos com estoque baixo [cite: 31]
        System.out.println("Produtos com estoque baixo: " + contadorBaixoEstoque);
    }
}