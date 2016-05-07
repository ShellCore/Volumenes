package mx.shellCore.java.volumenes.services;

import mx.shellCore.java.volumenes.models.Caja;

public class VolumenService {
    public static double calcularVolumenCaja(Caja caja) {
        return caja.getAncho() * caja.getAlto() * caja.getLargo();
    }
}
