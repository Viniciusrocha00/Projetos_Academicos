public class Exercicio05 {
    public static void main(String[] args) {
        double totalVendido = 0;
        int quantidadePedidos = 0;

        while (true) {
            double valor = Util.lerDouble("Valor: ");

            if (valor == 0) {
                break;
            }

            if (valor < 0) {
                continue;
            }

            totalVendido += valor;
            quantidadePedidos++;
        }

        if (quantidadePedidos > 0) {
            System.out.println("Total vendido: " + totalVendido);
            System.out.println("Quantidade de pedidos: " + quantidadePedidos);
        } else {
            System.out.println("Nenhum pedido válido registrado");
        }
    }
}
