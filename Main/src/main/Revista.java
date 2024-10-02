
package main;

public class Revista extends Producto {
    // atributo de las revistas
    private int edicion;

    // constructor con parametros
    public Revista(String nombre, double precio, int edicion) {
        super(nombre, precio);
        this.edicion = edicion;
    }

    // sobre escribe el metodo de la clase Producto
    @Override
    public void imprimirDetalles() {
        System.out.println("=================================");
        System.out.println("     DETALLES DE LA REVISTA      ");
        System.out.println("=================================");
        System.out.println("Revista: " + nombre + ", Precio: " + precio + ", Edicion: " + edicion);
        System.out.println("=================================\n");
    }
}
