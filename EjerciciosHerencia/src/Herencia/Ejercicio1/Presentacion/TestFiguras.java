package Herencia.Ejercicio1.Presentacion;

import Herencia.Ejercicio1.Modelo.circulo;
import Herencia.Ejercicio1.Modelo.figura;
import Herencia.Ejercicio1.Modelo.rectangulo;

public class TestFiguras {
    public static void main(String[] args) {
        figura figura = new figura(10, 20);
        circulo circulo = new circulo(30, 40, 5.0);
        rectangulo rectangulo = new rectangulo(50, 60, 10.0, 20.0);

        System.out.println(figura.posicion());
        System.out.println(circulo.posicion());
        System.out.println(rectangulo.posicion());
    }
}
