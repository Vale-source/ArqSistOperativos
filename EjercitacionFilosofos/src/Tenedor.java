public class Tenedor {
    private boolean disponible = true;

    public synchronized boolean estaDisponible(){
        return disponible;
    }

    public synchronized void usar(){
        disponible = false;
    }

    public synchronized void dejar(){
        disponible = true;
    }
}
