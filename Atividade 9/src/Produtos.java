public class Produtos {
    public static void Calcularvalor(int codigo, int qtde){
        double valor = 0.0;

        switch (codigo) {
            case 1:
                valor = qtde * 5.00;
                break;
            case 2:
                valor = qtde * 3.50;
                break;
            case 3:
                valor = qtde * 4.80;
                break;
            case 4:
                valor = qtde * 8.90;
                break;
            case 5:
                valor = qtde * 7.32;
                break;
            default:
                System.out.println("Código inválido");
                return;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", valor);
    }
}
