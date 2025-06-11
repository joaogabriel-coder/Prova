import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario = sc.nextDouble();
        CalcSalario.calcularSalario(salario);
        sc.close();
    }
}