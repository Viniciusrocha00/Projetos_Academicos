public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("--- Validação de Chat ---");
        String mensagem = Util.lerString("Digite sua mensagem: ");

        if (mensagem.trim().isEmpty()) {
            System.out.println("Erro: A mensagem não pode estar vazia!");
        } else {
            System.out.println("Mensagem enviada: " + mensagem);
            System.out.println("Tamanho: " + mensagem.length() + " caracteres.");
        }
    }
}