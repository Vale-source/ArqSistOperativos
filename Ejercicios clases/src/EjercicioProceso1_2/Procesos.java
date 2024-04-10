package EjercicioProceso1_2;


public class Procesos extends Thread {
    public int id;

    public Procesos(String name, int id) {
        super(name);
        this.id = id;
    }

    public void run(){
        System.out.println("Soy el proceso "+ this.getName()+ " " + id);
    }
}
