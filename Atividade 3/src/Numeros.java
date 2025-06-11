public class Numeros {
    public int numero1;
    public int numero2;
    public int numero3;

    public void calcularMenor() {
        if (numero1 <= numero2 && numero1 <= numero3) {
            System.out.println("O menor número é: " + numero1);
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            System.out.println("O menor número é: " + numero2);
        } else {
            System.out.println("O menor número é: " + numero3);
        }
    }
}
