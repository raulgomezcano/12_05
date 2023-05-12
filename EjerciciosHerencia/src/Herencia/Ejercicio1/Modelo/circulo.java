package Herencia.Ejercicio1.Modelo;

public class circulo extends figura{
    private double radio;

    public circulo(int x, int y, double r) {
        super(x, y);
        this.radio = r;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String posicion() {
        return super.posicion() + " Radio del círculo: " + radio;
    }
}
