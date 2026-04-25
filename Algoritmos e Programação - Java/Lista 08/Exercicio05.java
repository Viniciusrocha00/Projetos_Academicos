public class Exercicio05 {
    public static void main(String[] args) {
        String placa = Util.lerString("Digite a placa do veículo: ").toUpperCase();

        // Regex: 3 letras, 1 número, 1 letra, 2 números
        String padraoMercosul = "[A-Z]{3}[0-9][A-Z][0-9]{2}";

        if (placa.matches(padraoMercosul)) {
            System.out.println("Placa: " + placa + " - Válida");
        } else {
            System.out.println("Placa: " + placa + " - Inválida");
        }
    }
}