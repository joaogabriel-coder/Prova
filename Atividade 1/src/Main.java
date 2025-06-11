import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Notas notas = new Notas();
        System.out.print("Digite a primeira nota: ");
        notas.primeiraNota = sc.nextFloat();
        System.out.print("Digite a segunda nota: ");
        notas.segundaNota = sc.nextFloat();
        float media = notas.calcularMedia();
        System.out.printf("Nota final", media);


        if (media < 60.0) {
            System.out.printf("Reprovado", media);
        } else {
            System.out.printf("Aprovado", media);
        }
        sc.close();
    }
}