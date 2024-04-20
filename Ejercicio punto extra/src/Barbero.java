public class Barbero extends Thread {
    private int numBarbero;
    private Cliente cliente;

    public Barbero(int numBarbero, Cliente cliente) {
        this.numBarbero = numBarbero;
        this.cliente = cliente;
    }

    public void run() {
        try {
            while (true) {
                System.out.println("Barbero " + numBarbero + " está durmiendo");
                synchronized (cliente) {
                    while (!cliente.entrada_salida()) {
                        cliente.wait();
                    }
                    System.out.println("Barbero " + numBarbero + " se puso a trabajar");
                    cliente.salir();
                    cliente.notify();
                }
                Thread.sleep(5000);
                System.out.println("Barbero " + numBarbero + " se volvió a dormir");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




