public class Exercicio02 {
    public static void main(String[] args) {
        int qtdProdutos = Util.lerInt("Quantidade de produtos: ");
                double totalCompra = 0;

                for (int i = 0; i < qtdProdutos; i++) {
                double valor = Util.lerDouble("Valor: ");
                totalCompra += valor;
        }

        System.out.println("Total da compra: " + totalCompra);
    }
}