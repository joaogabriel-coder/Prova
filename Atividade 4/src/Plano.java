public class Plano {
    public static void calcularPlano(int minutos){
        int planoFixo = 50;
        double valorAdicional = 2.0;
        double valorTotal;
        if (minutos <= 100) {
            valorTotal = planoFixo;
        } else {
            int minutosExcedentes = minutos - 100;
            valorTotal = planoFixo + (minutosExcedentes * valorAdicional);
        }
        System.out.println("Valor total do plano: R$ " + String.format("%.2f", valorTotal));
    }
}
