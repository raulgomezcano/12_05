package Herencia.Ejercicio1.Modelo;

public class figura {
    private int coordenadaX;
    private int coordenadaY;

    public figura(int x, int y) {
        this.coordenadaX = x;
        this.coordenadaY = y;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public String posicion() {
        return "Coordenadas de la figura: (" + coordenadaX + ", " + coordenadaY + ")";
    }
}
