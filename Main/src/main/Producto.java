
package main;

public abstract class Producto {
    // atributos de los productos
    private String nombre;
    private double precio;

    // constructor con parametrox
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // metodo abstracto para ambos productos
    public abstract void imprimirDetalles();
}
