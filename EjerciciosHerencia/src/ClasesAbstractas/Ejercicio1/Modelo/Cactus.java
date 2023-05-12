package ClasesAbstractas.Ejercicio1.Modelo;

public class Cactus extends Planta{
    public Cactus(String especie) {
        super(especie);
    }
    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Regando un cactus de especie " + getEspecie());
    }
}
