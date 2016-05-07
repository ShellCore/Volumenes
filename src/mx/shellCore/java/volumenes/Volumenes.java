package mx.shellCore.java.volumenes;

import mx.shellCore.java.volumenes.models.Caja;
import mx.shellCore.java.volumenes.services.CajaService;
import mx.shellCore.java.volumenes.services.VolumenService;

public class Volumenes {
        private static Caja caja;
        private static double res;


    public static void main(String[] args) {
        caja = CajaService.leerCajaHardCode();
        res = VolumenService.calcularVolumenCaja(caja);
        mostrarResultado();
    }


    private static void mostrarResultado() {
        System.out.println(caja);
        System.out.println("Volumen = " + res);
    }
}
