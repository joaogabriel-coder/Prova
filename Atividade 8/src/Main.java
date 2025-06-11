import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Voce vai digitar a temperatura em qual escala (C/F)?");
        char escolha = sc.next().toUpperCase().charAt(0);
        switch (escolha){
            case 'C':
                System.out.println("Digite a temperatura em Celsius: ");
                double tempC = sc.nextDouble();
                calcularTemp.calcularTemperatura(tempC, 'C');
                break;
            case 'F':
                System.out.println("Digite a temperatura em Fahrenheit: ");
                double tempF = sc.nextDouble();
                calcularTemp.calcularTemperatura(tempF, 'F');
                break;
        }
    }
}