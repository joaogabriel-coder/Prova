public class Medidor {
    public static void Medir(int glicose) {
        if (glicose <= 100) {
            System.out.println("Normal");
        } else if (glicose >= 100 && glicose <= 140) {
            System.out.println("Elvado");
        } else if (glicose >= 140) {
            System.out.println("Diabates");
        }
    }
}