package com.softtek.modelo;

public class Tabla_multiplicar {
    private int tabla;

    public Tabla_multiplicar(int tabla) {
        this.tabla = tabla;
    }

    public String mostrarTabla() {
        String resultado = "";
        for (int i = 1; i <= 10; i++) {
            int multiplicacion = tabla * i;
            resultado += tabla + " x " + i + " = " + multiplicacion + "\n";
        }
        return resultado;
    }
}
