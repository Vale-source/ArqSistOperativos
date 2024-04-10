package EjercicioProceso1_2;

public class Main {
    public static void main(String[] args) {
        Procesos p1 = new Procesos("Llamar a la impresora",1);
        Procesos p2 = new Procesos("Grabar el disco",2);
        Procesos p3 = new Procesos("Ejecutar programa",3);
        Procesos p4 = new Procesos("Tomar datos casilla 001",4);

        p1.start();
        p2.start();
        p3.start();
        p4.start();

    }
}