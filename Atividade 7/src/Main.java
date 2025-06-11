import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CalcularMaior calcularMaior = new CalcularMaior();
        System.out.print("Digite a primeira distancia: ");
        calcularMaior.distancia1 = sc.nextFloat();
        System.out.print("Digite a segunda distacia: ");
        calcularMaior.distancia2 = sc.nextFloat();
        System.out.print("Digite a terceira distancia: ");
        calcularMaior.distancia3 = sc.nextFloat();
        calcularMaior.calcularMaior();
        sc.close();
    }
}