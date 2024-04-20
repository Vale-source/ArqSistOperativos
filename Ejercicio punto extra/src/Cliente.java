public class Cliente {
    private int id;
    private boolean llegoBarberia = false;

    public Cliente(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public synchronized boolean entrada_salida() {
        return llegoBarberia;
    }

    public synchronized void entrar() {
        llegoBarberia = true;
    }

    public synchronized void salir() {
        llegoBarberia = false;
    }

    public synchronized void notificarBarbero() {
        notify();
    }
}


