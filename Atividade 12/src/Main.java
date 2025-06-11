import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial (apenas o nunero)");
        int horaInicial = sc.nextInt();
        System.out.println("Digite a hora final (apenas o numero)");
        int horaFinal = sc.nextInt();
        CalcHora.calcular(horaInicial, horaFinal);
        sc.close();
    }
}