package mx.shellCore.java.volumenes.models;

public class Caja {
    private double ancho;
    private double largo;
    private double alto;

    public Caja() {
    }

    public Caja(double ancho, double largo, double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Caja\nAncho: " + ancho + "\nLargo: " + largo + "\nAltura: " + alto;
    }
}
