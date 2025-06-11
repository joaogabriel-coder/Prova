import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Coeficientes coeficiente = new Coeficientes();
        System.out.print("Digite o coeficiente A: ");
        coeficiente.coeficienteA = sc.nextFloat();
        System.out.print("Digite o coeficiente B: ");
        coeficiente.coeficienteB = sc.nextFloat();
        System.out.print("Digite o coeficiente C: ");
        coeficiente.coeficienteC = sc.nextFloat();
        coeficiente.calcularRaizes();
    }
}