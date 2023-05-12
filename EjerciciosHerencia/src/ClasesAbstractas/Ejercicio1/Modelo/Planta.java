package ClasesAbstractas.Ejercicio1.Modelo;

public abstract class Planta {
    private String especie;

    public Planta(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public abstract void regar(int cantidad, int tiempo);
}
