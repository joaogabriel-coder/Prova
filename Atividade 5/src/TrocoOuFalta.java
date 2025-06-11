public class TrocoOuFalta {
    double precoProduto;
    double qtdeProduto;
    double dinheroCliente;

    public void TrocoOuFalta() {
        double precoTotal = precoProduto * qtdeProduto;
        if (dinheroCliente >= precoTotal) {
            double troco = dinheroCliente - precoTotal;
            System.out.printf("O troco é: R$ %.2f%n", troco);
        } else {
            double falta = precoTotal - dinheroCliente;
            System.out.printf("Falta R$ %.2f%n", falta);
        }
    }
}
