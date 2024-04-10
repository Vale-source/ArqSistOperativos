package EjercicioProceso6;

import java.util.Random;

public class Proceso extends Thread{
    private static int tam = 8;
    private static int []vec = new int[tam];
    private int ini,fin;

    public Proceso(int ini, int fin) {
        this.ini = ini;
        this.fin = fin;
    }

    public void run(){
        for (int i = ini; i < fin ; i++) {
            vec[i] += 10;
        }
    }

    public static void main(String[] args){
        Random ran = new Random(System.nanoTime());

        double tiempo_inicio, tiempo_final;

        for (int i = 0; i < vec.length; i++) {
            vec[i] = ran.nextInt(10);
        }

        Proceso p1 = new Proceso(0,4);
        Proceso p2 = new Proceso(4,8);

        p1.start();
        p2.start();

        try{
            p1.join();
            p2.join();
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
    }
}
