public class CalcularMultiplo {
    public static void calcMultiplo(int n1, int n2) {
        if (n2 % n1 == 0) {
            System.out.println(n1 + " é múltiplo de " + n2);
        } else {
            System.out.println(n1 + " não é múltiplo de " + n2);
        }
    }
}
