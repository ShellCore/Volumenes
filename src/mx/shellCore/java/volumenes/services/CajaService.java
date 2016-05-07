package mx.shellCore.java.volumenes.services;

import mx.shellCore.java.volumenes.models.Caja;

public class CajaService {

    public static Caja leerCajaHardCode() {
        // TODO Lectura por HardCode
        Caja caja = new Caja(5, 4, 3);
        return caja;
    }
}
