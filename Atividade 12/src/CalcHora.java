public class CalcHora {
    public static void calcular(int horaInicial, int horaFinal) {
        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
