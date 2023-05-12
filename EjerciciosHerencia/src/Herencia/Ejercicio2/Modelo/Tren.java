package Herencia.Ejercicio2.Modelo;

public class Tren extends Vehiculo{
    private int numVagones;

    public Tren(String marca, String modelo, int numAsientos, int numVagones) {
        super(marca, modelo, numAsientos);
        this.numVagones = numVagones;
    }

    public int getNumVagones() {
        return numVagones;
    }

    public void setNumVagones(int numVagones) {
        this.numVagones = numVagones;
    }

    @Override
    public void arrancar() {
        System.out.println("El tren está iniciando la marcha...");
    }

    @Override
    public void detener() {
        System.out.println("El tren está deteniéndose...");
    }

    @Override
    public String toString() {
        return "Número de vagones: " + numVagones;
    }
}
