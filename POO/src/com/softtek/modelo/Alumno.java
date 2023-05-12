package com.softtek.modelo;

public class Alumno {
    private String nombreCompleto;
    private double[] parciales;

    public Alumno(String nombreCompleto, int cantidadParciales) {
        this.nombreCompleto = nombreCompleto;
        this.parciales = new double[cantidadParciales];
    }

    public void setParcial(int indice, double nota) {
        parciales[indice] = nota;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : parciales) {
            suma += nota;
        }
        double promedio = suma / parciales.length;
        return promedio;
    }

    public void mostrarParciales() {
        System.out.println("Calificaciones de " + nombreCompleto + ":");
        for (int i = 0; i < parciales.length; i++) {
            System.out.println("Parcial " + (i + 1) + ": " + parciales[i]);
        }
    }
}
