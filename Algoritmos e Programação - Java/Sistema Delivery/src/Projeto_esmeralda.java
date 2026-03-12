public class Projeto_esmeralda {

    public static void main(String[] args) {
        // --- ETAPA 1: ESCOLHA DO PRODUTO ---
        System.out.println("======= CARDÁPIO =======");
        System.out.println("1 - Hambúrguer - R$ 18.00");
        System.out.println("2 - Pizza - R$ 25.00");
        System.out.println("3 - Batata frita - R$ 12.00");
        System.out.println("4 - Refrigerante - R$ 8.00");
        System.out.println("5 - Milkshake - R$ 15.00");
        System.out.println("========================");

        int codigo = Util.lerInt("Digite o código do produto: ");

        String nomeProduto = "";
        double precoUnitario = 0;


        switch (codigo) {
            case 1:
                nomeProduto = "Hambúrguer";
                precoUnitario = 18.00;
                break;
            case 2:
                nomeProduto = "Pizza";
                precoUnitario = 25.00;
                break;
            case 3:
                nomeProduto = "Batata frita";
                precoUnitario = 12.00;
                break;
            case 4:
                nomeProduto = "Refrigerante";
                precoUnitario = 8.00;
                break;
            case 5:
                nomeProduto = "Milkshake";
                precoUnitario = 15.00;
                break;
            default:
                System.out.println("Código inválido!");
                return; // Encerra o programa caso o código esteja errado
        }

        // --- ETAPA 2: QUANTIDADE ---
        int quantidade = Util.lerInt("Informe a quantidade desejada: ");

        // --- ETAPA 3: CÁLCULO DO VALOR (CHAMANDO A FUNÇÃO) ---
        double totalPedido = calcularTotal(precoUnitario, quantidade);

        // --- ETAPA 4: FORMA DE PAGAMENTO ---
        System.out.println("\n--- FORMAS DE PAGAMENTO ---");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Cartão");
        System.out.println("3 - Pix");
        int formaPagamento = Util.lerInt("Escolha a forma de pagamento: ");

        String nomePagamento = "";
        switch (formaPagamento) {
            case 1: nomePagamento = "Dinheiro"; break;
            case 2: nomePagamento = "Cartão"; break;
            case 3: nomePagamento = "Pix"; break;
            default: nomePagamento = "Não informado"; break;
        }

        // --- ETAPA 5 e 6: DESCONTO E TAXA (CHAMANDO A FUNÇÃO) ---
        double valorComDesconto = calcularDesconto(totalPedido, formaPagamento);

        double taxaEntrega = 0;
        // Regra: Se o valor com desconto for menor que 40, cobrar 8 reais
        if (valorComDesconto < 40) {
            taxaEntrega = 8.00;
        } else {
            taxaEntrega = 0.00;
        }

        // --- ETAPA 7: VALOR FINAL ---
        double valorFinal = valorComDesconto + taxaEntrega;

        // --- SAÍDA DO PROGRAMA (RESUMO) ---
        System.out.println("\n======= RESUMO DO PEDIDO =======");
        System.out.println("Produto escolhido: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor unitário: R$ " + precoUnitario);
        System.out.println("Valor total do pedido: R$ " + totalPedido);
        System.out.println("Forma de pagamento: " + nomePagamento);
        System.out.println("Valor com desconto: R$ " + valorComDesconto);
        System.out.println("Taxa de entrega: R$ " + taxaEntrega);
        System.out.println("VALOR FINAL: R$ " + valorFinal);
        System.out.println("================================");
    }

    // --- FUNÇÕES  ---

    public static double calcularTotal(double preco, int quantidade) {
        return preco * quantidade;
    }

    public static double calcularDesconto(double total, int formaPagamento) {
        // Regras de desconto: Dinheiro 10%, Pix 5%, Cartão 0%
        if (formaPagamento == 1) {
            return total * 0.90; // Aplica 10% de desconto
        } else if (formaPagamento == 3) {
            return total * 0.95; // Aplica 5% de desconto
        } else {
            return total; // Sem desconto para cartão ou outros
        }
    }
}