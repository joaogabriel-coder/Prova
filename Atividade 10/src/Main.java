import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeors inteiros:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        CalcularMultiplo.calcMultiplo(n1, n2);
        sc.close();
    }
}