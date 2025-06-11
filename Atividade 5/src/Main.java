import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        TrocoOuFalta modelo = new TrocoOuFalta();
        System.out.print("Digite o preço do produto: ");
        modelo.precoProduto = sc.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        modelo.qtdeProduto = sc.nextDouble();
        System.out.print("Digite o dinheiro do cliente: ");
        modelo.dinheroCliente = sc.nextDouble();
        modelo.TrocoOuFalta();
        sc.close();
    }
}