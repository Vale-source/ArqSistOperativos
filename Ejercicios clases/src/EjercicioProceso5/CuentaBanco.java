package EjercicioProceso5;

public class CuentaBanco extends Thread{
    private double saldo;

    public CuentaBanco(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void restar(int cantidad){
        saldo = saldo - cantidad;
    }

    synchronized void retirarDinero(int cantidad, String nombre) {
        if (getSaldo() >= cantidad) {
            System.out.println(nombre + " va a retirar saldo (El saldo actual es " + getSaldo() + ")");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) { }
            restar(cantidad);
            System.out.println(nombre + " retira => " + cantidad + " Actual(" + getSaldo() + ")");
        } else {
            System.out.println("No hay saldo");
        }
    }
}

