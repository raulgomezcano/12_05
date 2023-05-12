package Herencia.Ejercicio2.Modelo;

public class Coche extends Vehiculo {
    private int cilindrada;

    public Coche(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void arrancar() {
        System.out.println("El coche ha arrancado.");
    }

    @Override
    public void detener() {
        System.out.println("El coche se ha detenido.");
    }

    public void acelerar() {
        System.out.println("El coche ha acelerado.");
    }

    public void frenar() {
        System.out.println("El coche ha frenado.");
    }
}
