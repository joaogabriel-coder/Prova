import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de minutos:");
        int minutos = sc.nextInt();
        Plano.calcularPlano(minutos);
        sc.close();
    }
}