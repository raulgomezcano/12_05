package com.softtek.presentacion;

import com.softtek.modelo.Areas;

import java.util.Scanner;

public class Main_Areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedir el radio del círculo por teclado
        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        // Pedir la base y altura del rectángulo por teclado
        System.out.print("Ingrese la base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = sc.nextDouble();

        // Calcular el área de un círculo
        double areaCirculo = Areas.areaCirculo(radio);
        System.out.println("El área del círculo con radio " + radio + " es: " + areaCirculo);

        // Calcular el área de un rectángulo
        double areaRectangulo = Areas.areaRectangulo(base, altura);
        System.out.println("El área del rectángulo con base " + base + " y altura " + altura + " es: " + areaRectangulo);

        sc.close(); // Cerrar el objeto Scanner
    }
}
