import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de x:");
        double x = sc.nextDouble();
        System.out.println("Digite o valor de y:");
        double y = sc.nextDouble();
        CalcularCartesiano.calcular(x, y);
        sc.close();
    }
}