public class Exercicio01 {
    public static void main(String[] args) {
        int senhaCorreta = 1234;
        int tentativas = 0;
        boolean acessoPermitido = false;

        while (tentativas < 3) {
            int tentativa = Util.lerInt("Senha: ");
            tentativas++;

            if (tentativa == senhaCorreta) {
                acessoPermitido = true;
                break;
            }
        }

        if (acessoPermitido) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso bloqueado");
        }
    }
}