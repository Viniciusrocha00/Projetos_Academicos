import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Segurança da Balada Geek ---");

        // Passo 1: Pegar a idade
        System.out.print("Digite a idade do convidado: ");
        int idade = leitor.nextInt();

        // Passo 2: Verificar a lista (1 para Sim, 0 para Não)
        System.out.print("O nome está na lista? (1 para SIM / 0 para NÃO): ");
        int naLista = leitor.nextInt();

        // Passo 3: A decisão com o operador && (AND)
        if (idade >= 18 && naLista == 1) {
            // Só entra aqui se AMBAS as condições forem verdadeiras
            System.out.println("Acesso Autorizado! Divirta-se! 🎮");
        } else {
            // Entra aqui se for menor de idade OU se não estiver na lista
            System.out.println("Acesso Negado. 🚫");
        }

        leitor.close();
    }
}