package com.softtek.presentacion;

import com.softtek.modelo.Alumno;

public class Main_alumno {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan Pérez", 3);
        alumno1.setParcial(0, 7.5);
        alumno1.setParcial(1, 8);
        alumno1.setParcial(2, 6.5);
        alumno1.mostrarParciales();
        double promedio1 = alumno1.calcularPromedio();
        System.out.println("Promedio: " + promedio1);
    }
}
