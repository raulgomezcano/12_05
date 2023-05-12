package Herencia.Ejercicio2.Presentacion;

import Herencia.Ejercicio2.Modelo.Avion;
import Herencia.Ejercicio2.Modelo.Barco;
import Herencia.Ejercicio2.Modelo.Coche;
import Herencia.Ejercicio2.Modelo.Tren;

public class TestVehiculos {
    public static void main(String[] args) {
        Coche coche = new Coche("Seat", "León", 200, 5);
        coche.acelerar();
        coche.frenar();
        coche.detener();

        Barco barco = new Barco("Barco1", "Azul", 30, 10);
        barco.arrancar();
        barco.navegar();
        barco.anclar();

        Avion avion = new Avion("Boeing", "747", 800, 300);
        avion.arrancar();
        System.out.println(avion.toString());
        avion.detener();


        Tren tren = new Tren("Renfe", "AVE", 300, 1000);
        tren.arrancar();
        System.out.println(tren.toString());
        tren.detener();

    }
}
