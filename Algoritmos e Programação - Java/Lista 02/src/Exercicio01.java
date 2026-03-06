import java.util.Scanner; // Importamos o Scanner para ler o teclado

public class Exercicio01 {
    public static void main(String[] args) {
        // Criamos o objeto 'leitor' para capturar o que você digita
        Scanner leitor = new Scanner(System.in);

        // Passo 1: Pedir o nível de luz
        System.out.println("Digite o nível de luz do ambiente (0 a 100):");
        int nivelLuz = leitor.nextInt(); // O programa para e espera você digitar um número

        // Passo 2: A estrutura de decisão
        if (nivelLuz >= 60) {
            // Se o nível for 60 ou mais...
            System.out.println("Filtro Ativado! ✨");
        } else {
            // Se for qualquer valor menor que 60...
            System.out.println("Ambiente escuro. Ligue as luzes! 💡");
        }

        // Fechamos o leitor (boa prática)
        leitor.close();
    }
}
