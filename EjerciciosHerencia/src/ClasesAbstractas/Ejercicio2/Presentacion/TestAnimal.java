package ClasesAbstractas.Ejercicio2.Presentacion;
//¿Qué ocurre si no implemento todos los métodos? Si no se implementan todos los métodos abstractos
// de una clase abstracta, la clase debe ser declarada como abstracta.

// ¿Puedo crear instancias igualmente? No se puede crear una instancia de esta clase.

//¿Puedo modificar parte de la definición de los métodos abstractos? No se puede modificar parte de
// la definición de un método abstracto en una subclase. La subclase debe implementar el método tal
// y como está definido en la clase abstracta.

// ¿Puedo utilizar polimorfismo? Sí, se puede utilizar polimorfismo para trabajar con objetos de diferentes
// subclases de la clase abstracta.

import ClasesAbstractas.Ejercicio2.Modelo.Animal;
import ClasesAbstractas.Ejercicio2.Modelo.Perro;
import ClasesAbstractas.Ejercicio2.Modelo.Pez;

// Crea clases extendiendo la clase Pajaro, por ejemplo Gorrión y Buitre. ¿También son abstractas estas clases?
// Las clases Gorrión y Buitre no necesariamente tienen que ser abstractas, a menos que la clase Pajaro tenga
// métodos abstractos sin implementar que requieran que sus subclases también sean abstractas.
public class TestAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Perro();
        Animal animal2 = new Pez();

        animal1.comer();
        animal1.moverse();

        animal2.comer();
        animal2.moverse();
    }
}
