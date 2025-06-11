public class calcularTemp {
    public static void calcularTemperatura(double tempA, char escolha) {
        if (escolha == 'C') {
            double tempF = (tempA * 9/5) + 32;
            System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", tempF);
        } else if (escolha == 'F') {
            double tempC = (tempA - 32) * 5/9;
            System.out.printf("Temperatura em Celsius: %.2f°C%n", tempC);
        } else {
            System.out.println("Escolha inválida. Use 'C' para Celsius ou 'F' para Fahrenheit.");
        }

    }
}
