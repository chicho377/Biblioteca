
package main;

public class Biblioteca {
    // atributo estatico de contador
    private static int contadorProductos = 0;

    // metodo estatico para incrementar el contador
    public static void contarProductos() {
        contadorProductos++;
    }

    // metodo estatico para obtener el resultado del contador
    public static int getContadorProductos() {
        return contadorProductos;
    }
}
