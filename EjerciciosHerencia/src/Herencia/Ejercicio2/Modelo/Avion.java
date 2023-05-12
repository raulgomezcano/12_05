package Herencia.Ejercicio2.Modelo;

public class Avion extends Vehiculo{
    private double altitud;

    public Avion(String marca, String modelo, int numAsientos, double altitud) {
        super(marca, modelo, numAsientos);
        this.altitud = altitud;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    @Override
    public void arrancar() {
        System.out.println("El avión está despegando...");
    }

    @Override
    public void detener() {
        System.out.println("El avión está aterrizando...");
    }

    @Override
    public String toString() {
        return "Altitud: " + altitud + "m";
    }
}
