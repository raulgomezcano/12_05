package com.softtek.modelo;

public class Areas {
    public static double areaCirculo(double radio) {
        double area = Math.PI * radio * radio;
        return area;
    }

    public static double areaRectangulo(double base, double altura) {
        double area = base * altura;
        return area;
    }
}
