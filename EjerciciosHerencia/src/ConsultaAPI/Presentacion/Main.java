package ConsultaAPI.Presentacion;

public class Main {
    public static void main(String[] args) {
        String cadena = "Bienvenidos al curso de Java";
        //Mostrar en mayúsculas
        System.out.println(cadena.toUpperCase());
        //Mostrar en minúsculas
        System.out.println(cadena.toLowerCase());
        //Mostrar solo la palabra Bienvenidos
        String[] palabras = cadena.split(" ");
        System.out.println(palabras[0]);
        //Mostrar solo la palabra Java
        System.out.println(palabras[4]);
        //Mostrar la palabra curso
        System.out.println(palabras[2]);
        //Mostrar la posicion de la letra c
        System.out.println("La c esta en la posicion: " + cadena.indexOf("c"));
        //Devolver la longitud de la cadena
        System.out.println("La longitud de la cadena es: " + cadena.length());
        //Modificar las e minusculas por mayusculas
        String nuevaCadena = cadena.replace("e", "E");
        System.out.println(nuevaCadena);
        //Concatenar la frase anterior con "con fecha 14 de Septiembre"
        cadena = cadena + " con fecha 14 de Septiembre";
        System.out.println(cadena);
    }
}
