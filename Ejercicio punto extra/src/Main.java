public class Main {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[5];
        Barbero[] barberos = new Barbero[5];


        for (int i = 0; i < 5; i++) {
            clientes[i] = new Cliente(i + 1);
            barberos[i] = new Barbero(i + 1, clientes[i]);
            barberos[i].start();
        }

        int clienteID = 1;
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("El cliente " + clienteID + " ha llegado");
            synchronized (clientes[clienteID % 5]) {
                clientes[clienteID % 5].entrar();
                clientes[clienteID % 5].notificarBarbero(); 
            }
            clienteID++;
        }
    }
}




