package Herencia.Ejercicio1.Modelo;

public class rectangulo extends figura{
    private double ancho;
    private double alto;

    public rectangulo(int x, int y, double a, double h) {
        super(x, y);
        this.ancho = a;
        this.alto = h;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    @Override
    public String posicion() {
        return super.posicion() + " Dimensiones del rectángulo: " + ancho + " x " + alto;
    }
}
