import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo do produto:");
        int codigo = sc.nextInt();
        System.out.println("Digite a quantidade:");
        int qtde = sc.nextInt();
        Produtos.Calcularvalor(codigo, qtde);
        sc.close();
    }
}