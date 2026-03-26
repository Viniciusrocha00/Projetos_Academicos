public class Exercicio03 {
    public static void main(String[] args) {
        int permitidos = 0;
        int negados = 0;
        int idade = 0;

        while (idade != -1) {
            idade = Util.lerInt("Idade: ");

            if (idade == -1) break;

            if (idade >= 16) {
                permitidos++;
            } else {
                negados++;
            }
        }

        System.out.println("Acessos permitidos: " + permitidos);
        System.out.println("Acessos negados: " + negados);
    }
}