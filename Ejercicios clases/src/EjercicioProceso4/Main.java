package EjercicioProceso4;

public class Main {
    public static void main(String[] args) {
        Contador cont = new Contador(100);
        Hilo h = new Hilo("HiloA",cont);
        HiloB j = new HiloB("HiloB",cont);
        h.start();
        j.start();
    }
}
