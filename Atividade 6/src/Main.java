import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Medidor m = new Medidor();
        System.out.print("Digite a medida da sua glicose: ");
        int glicose = sc.nextInt();
        m.Medir(glicose);
        sc.close();
    }
}