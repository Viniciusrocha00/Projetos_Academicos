public class Exercicio04 {
    public static void main(String[] args) {
        String serial = Util.lerString("Digite o Serial Completo (XXXX-YYY-ZZZZ): ");

        try {
            String[] partes = serial.split("-");
            String modelo = partes[1]; // Pega a parte central
            System.out.println("O modelo identificado é: " + modelo);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Formato de serial inválido.");
        }
    }
}