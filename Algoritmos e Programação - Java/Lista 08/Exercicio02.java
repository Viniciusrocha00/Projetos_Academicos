public class Exercicio02 {
    public static void main(String[] args) {
        final String USUARIO_CORRETO = "admin";

        String login = Util.lerString("Digite seu nome de usuário: ");


        if (login.trim().equalsIgnoreCase(USUARIO_CORRETO)) {
            System.out.println("Acesso concedido ao sistema da Academy!");
        } else {
            System.out.println("Usuário não reconhecido.");
        }
    }
}