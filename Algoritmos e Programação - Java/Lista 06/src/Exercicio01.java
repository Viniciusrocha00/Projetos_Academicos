public class Exercicio01 {
    public static void main(String[] args) {
        int totalConvidados = Util.lerInt("Quantidade de convidados: ");

        for (int i = 1; i <= totalConvidados; i++) {
            System.out.print("Nome: ");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            String nome = sc.nextLine();

            System.out.println("Entrada liberada para: " + nome);
        }

        System.out.println("Todos os convidados foram registrados");
    }
}
