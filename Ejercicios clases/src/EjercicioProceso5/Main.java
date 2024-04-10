package EjercicioProceso5;

public class Main {
    public static void main(String[] args) {
        CuentaBanco c = new CuentaBanco(80);
        SacarDinero h1 = new SacarDinero("Ana",c);
        SacarDinero h2 = new SacarDinero("Juan",c);
        h1.start();
        h2.start();
    }
}
