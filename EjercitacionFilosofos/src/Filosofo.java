import java.util.Random;

public class Filosofo extends Thread {
    private int id;
    private Tenedor tenedorDerecho;
    private Tenedor tenedorIzquierdo;

    private Random rand = new Random();

    public Filosofo(int id, Tenedor tenedorDerecho, Tenedor tenedorIzquierdo) {
        this.id = id;
        this.tenedorDerecho = tenedorDerecho;
        this.tenedorIzquierdo = tenedorIzquierdo;
    }

    public void run(){
        try {
            while (true){
                System.out.println("El filosofo " + id + " esta pensando");
                Thread.sleep(rand.nextInt(5000) + 1000);

                synchronized (tenedorIzquierdo){
                    while (!tenedorIzquierdo.estaDisponible()){
                        tenedorIzquierdo.wait();
                    }
                    tenedorIzquierdo.usar();
                    System.out.println("El filosofo " + id + " agarro el tenedor izquierdo");
                }

                synchronized (tenedorDerecho){
                    while (!tenedorDerecho.estaDisponible()){
                        tenedorDerecho.wait();
                    }
                    tenedorDerecho.usar();
                    System.out.println("El filosofo " + id + " agarro el tenedor derecho");
                }

                System.out.println("El filosofo " + id + " esta comiendo");
                Thread.sleep(rand.nextInt(5000) + 1000);

                synchronized (tenedorIzquierdo){
                    tenedorIzquierdo.dejar();
                    tenedorIzquierdo.notifyAll();
                    System.out.println("El filosofo " + id + " ha dejado el tenedor izquierdo");
                }

                synchronized (tenedorDerecho){
                    tenedorDerecho.dejar();
                    tenedorDerecho.notifyAll();
                    System.out.println("El filosofo " + id + " ha dejado el tenedor derecho");
                }
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
