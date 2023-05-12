package com.softtek.presentacion;

import com.softtek.modelo.Tabla_multiplicar;
public class Main_tabla_multiplicar {
    public static void main(String[] args) {
        Tabla_multiplicar tabla3 = new Tabla_multiplicar(3);
        String tabla3_mostrar = tabla3.mostrarTabla();
        System.out.println("Tabla del 3:\n" + tabla3_mostrar);
    }
}
