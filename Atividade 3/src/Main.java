import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Numeros numeros = new Numeros();
        System.out.println("Digite o primeiro número:");
        numeros.numero1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        numeros.numero2 = sc.nextInt();
        System.out.println("Digite o terceiro número:");
        numeros.numero3 = sc.nextInt();
        numeros.calcularMenor();
        sc.close();
    }
}