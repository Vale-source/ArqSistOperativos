package EjercicioProceso1_2;

public class MainEjercicio2 {
    public static void main(String[] args) {

        Procesos[] proceso = new Procesos[5];

        for (int i = 0; i < 5; i++) {

            proceso[i] = new Procesos("Proceso " + i, i);
            proceso[i].start();

            try{
                proceso[1].join();
            }
            catch (Exception E){}

        }

    }
}
