public class Cena {
    public static void main(String[] args) {
        int cantidadFilosofos = 2;
        Filosofo[] filosofo = new Filosofo[cantidadFilosofos];
        Tenedor[] tenedores = new Tenedor[cantidadFilosofos];

        for (int i = 0; i < cantidadFilosofos; i++) {
            tenedores[i] = new Tenedor();
        }

        for (int i = 0; i < cantidadFilosofos; i++) {
            filosofo[i] = new Filosofo(i,tenedores[i], tenedores[(i + 1) % cantidadFilosofos]);
            filosofo[i].start();
        }
    }
}
