import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Sistema de Skins ---");
        System.out.print("Digite o preço da Skin: R$ ");

        // Usamos nextDouble() porque o preço pode ter centavos
        double preco = leitor.nextDouble();

        // Regra 1: Menor que 50
        if (preco < 50.0) {
            System.out.println("Raridade: Comum ⚪");
        }
        // Regra 2: Entre 50 e 100 (Inclusive o 100)
        else if (preco <= 100.0) {
            System.out.println("Raridade: Rara 🔵");
        }
        // Regra 3: Tudo que sobrou (ou seja, maior que 100)
        else {
            System.out.println("Raridade: Lendária ✨💎");
        }

        leitor.close();
    }
}