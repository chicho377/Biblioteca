
package main;

public class Libro extends Producto implements Describible {
    // atributo de los libros
    private String autor;

    // constructor con parametros
    public Libro(String nombre, double precio, String autor) {
        super(nombre, precio);
        this.autor = autor;
    }

    // sobre escribe el metodo de la clase Producto
    @Override
    public void imprimirDetalles() {
        System.out.println("Libro: " + nombre + ", Precio: " + precio + ", Autor: " + autor);
    }

    // sobre escribe el metodo de la interfaz Describible
    @Override
    public void describir() {
        System.out.println("Este es un libro titulado " + nombre + " por " + autor);
    }
}
