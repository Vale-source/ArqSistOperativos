package EjercicioProceso5;

public class SacarDinero extends Thread{
    private CuentaBanco c;
    public SacarDinero(String n,CuentaBanco c){
        super(n);
        this.c = c;
    }

    public void run(){
        for (int i = 0; i <= 4; i++) {
            c.retirarDinero(10,getName());
        }
    }
}
