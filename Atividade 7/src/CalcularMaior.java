public class CalcularMaior {
    float distancia1;
    float distancia2;
    float distancia3;

    public void calcularMaior() {
        if (distancia1 >= distancia2 && distancia1 >= distancia3) {
            System.out.printf("A maior distância é: %.2f%n", distancia1);
        } else if (distancia2 >= distancia1 && distancia2 >= distancia3) {
            System.out.printf("A maior distância é: %.2f%n", distancia2);
        } else {
            System.out.printf("A maior distância é: %.2f%n", distancia3);
        }
    }
}
