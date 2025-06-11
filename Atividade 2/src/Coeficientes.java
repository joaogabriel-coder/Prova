public class Coeficientes {
    public double coeficienteA;
    public double coeficienteB;
    public double coeficienteC;
    public double x1;
    public double x2;

    public void calcularRaizes() {
        double delta = (coeficienteB * coeficienteB) - (4 * coeficienteA * coeficienteC);
        if (delta < 0) {
            System.out.println("Impossível calcular as raízes, delta negativo.");
        } else {
            x1 = (-coeficienteB + Math.sqrt(delta)) / (2 * coeficienteA);
            x2 = (-coeficienteB - Math.sqrt(delta)) / (2 * coeficienteA);
            System.out.printf("Raiz 1: %.2f%n", x1);
            System.out.printf("Raiz 2: %.2f%n", x2);
        }
        if(delta < 0) {
            System.out.println("Nao existe raiz real");
        }
    }
}
