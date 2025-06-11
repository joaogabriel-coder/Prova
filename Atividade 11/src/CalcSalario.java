public class CalcSalario {
    public static void calcularSalario(double salario){
        if(salario >= 1000){
            double novoSalario = salario + (salario * 0.20);
            System.out.printf("Seu novo salário é: %.2f%n", novoSalario);
            double aumento = novoSalario - salario;
            System.out.printf("O aumento foi de: %.2f%n", aumento);
            System.out.println("seu aumento foi de 20%");
        }
        if(salario <= 1000 && salario >= 3000){
            double novoSalario = salario + (salario * 0.15);
            double aumento = novoSalario - salario;
            System.out.printf("O aumento foi de: %.2f%n", aumento);
            System.out.println("seu aumento foi de 15%");
            System.out.printf("Seu novo salário é: %.2f%n", novoSalario);
        }
        if(salario <= 3000 && salario >= 8000){
            double novoSalario = salario + (salario * 0.10);
            double aumento = novoSalario - salario;
            System.out.println("seu aumento foi de 10%");
            System.out.printf("O aumento foi de: %.2f%n", aumento);
            System.out.printf("Seu novo salário é: %.2f%n", novoSalario);
        }
        if(salario < 8000){
            double novoSalario = salario + (salario * 0.05);
            double aumento = novoSalario - salario;
            System.out.println("seu aumento foi de 5%");
            System.out.printf("O aumento foi de: %.2f%n", aumento);
            System.out.printf("Seu novo salário é: %.2f%n", novoSalario);
        }
    }
}
