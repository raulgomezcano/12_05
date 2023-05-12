package ClasesAbstractas.Ejercicio1.Presentacion;

import ClasesAbstractas.Ejercicio1.Modelo.Cactus;
import ClasesAbstractas.Ejercicio1.Modelo.Planta;
import ClasesAbstractas.Ejercicio1.Modelo.PlantaTropical;

public class TestPlanta {
    public static void main(String[] args) {
            Planta[] plantas = new Planta[3];

            plantas[0] = new PlantaTropical("Palmera");
            plantas[1] = new PlantaTropical("Café");
            plantas[2] = new Cactus("Cactus de Navidad");

            for (Planta planta : plantas) {
                System.out.println("Planta: " + planta.getEspecie());
                planta.regar(100, 30);
                System.out.println();
            }
    }
}
