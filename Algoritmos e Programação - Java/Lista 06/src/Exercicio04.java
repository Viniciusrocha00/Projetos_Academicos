public class Exercicio04 {
    public static void main(String[] args) {
        double valorMensal = Util.lerDouble("Valor mensal: ");
                int meses = Util.lerInt("Meses: ");
                double totalEconomizado = 0;

                for (int i = 1; i <= meses; i++) {
                totalEconomizado += valorMensal;


        }

        System.out.println("Total economizado: " + totalEconomizado);
    }
}