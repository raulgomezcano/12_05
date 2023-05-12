package Herencia.Ejercicio2.Modelo;

public class Barco extends Vehiculo {
    private double eslora;

    public Barco(String marca, String modelo, int anio, double eslora) {
        super(marca, modelo, anio);
        this.eslora = eslora;
    }


    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    @Override
    public void arrancar() {
        System.out.println("El barco ha zarpado.");
    }

    @Override
    public void detener() {
        System.out.println("El barco ha atracado.");
    }

    public void navegar() {
        System.out.println("El barco está navegando.");
    }

    public void anclar() {
        System.out.println("El barco ha anclado.");
    }
}
