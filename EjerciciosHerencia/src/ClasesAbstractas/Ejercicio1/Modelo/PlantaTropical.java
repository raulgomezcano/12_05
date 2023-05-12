package ClasesAbstractas.Ejercicio1.Modelo;

public class PlantaTropical extends Planta{
    public PlantaTropical(String especie) {
        super(especie);
    }
    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Regando una planta tropical de especie " + getEspecie());
    }
}
