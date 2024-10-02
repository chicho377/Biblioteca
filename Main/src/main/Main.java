
package main;

import java.util.Scanner;

/*
 * Fabricio Mora Gomez
 * Examen 1
 * Programacion 2
 */
public class Main {

    public static void main(String[] args) {
        menu();
    }
    
    // funcion para el menu
    public static void menu(){
        
        // objeto scanner para obtener los datos desde la consola
        Scanner scanner = new Scanner(System.in);
        
        // variable opcion para el ciclo del menu
        String opcion;
        
        // ciclo do while para el menu
        do {
            // impresion del menu en consola
            System.out.println("\n===============================");
            System.out.println("        MENU PRINCIPAL         ");
            System.out.println("===============================");
            System.out.println("1. Agregar libro");
            System.out.println("2. Agregar revista");
            System.out.println("Escriba 'salir' para terminar");
            System.out.println("===============================");
            System.out.print("Elija una opcion: ");
            
            // inicializacion de la variable opcion
            opcion = scanner.nextLine().toLowerCase(); // lo pasa a minuscula
            
            // switch para el control de opciones del menu
            switch(opcion){
                case "1":
                    // opcion 1 agregar libro
                    System.out.println("----- Agregar Libro -----");
                    System.out.println("Ingrese el nombre del libro:");
                    String nombreLibro = scanner.nextLine();
                    
                    // variable para almacenar el precio del libro
                    double precioLibro;
                    
                    // ciclo do while para validacion de que el precio no sea negativo y se pueda seguir ingresando
                    do {
                        // se solicita el ingreso del precio
                        System.out.println("Ingrese el precio del libro:");
                        precioLibro = Double.parseDouble(scanner.nextLine());
                        
                        // validacion de precio negativo
                        if (precioLibro < 0) {
                            System.out.println("El precio no puede ser negativo. Intente de nuevo.");
                        }
                    } while (precioLibro < 0); // validacion de precio negativo
                    
                    // se solicita el autor del libro
                    System.out.println("Ingrese el autor del libro:");
                    String autor = scanner.nextLine();

                    // se crea el objeto libro
                    Libro libro = new Libro(nombreLibro, precioLibro, autor);
                    // se usan sus metodos, tanto el de la abstracta como la interfaz que fueron sobre escritos
                    libro.imprimirDetalles();
                    libro.describir();
                    // se llama el metodo estatico para el contador
                    Biblioteca.contarProductos();
                    
                    break;
                case "2":
                    // opcion 2 agregar revista
                    System.out.println("----- Agregar Revista -----");
                    System.out.println("Ingrese el nombre de la revista:");
                    String nombreRevista = scanner.nextLine();
                    
                    // variable para almacenar el precio de la revista
                    double precioRevista;
                    
                    // ciclo do while para validacion de que el precio no sea negativo y se pueda seguir ingresando
                    do {
                        // se solicita el ingreso del precio en este caso de la revista
                        System.out.println("Ingrese el precio de la revista:");
                        precioRevista = Double.parseDouble(scanner.nextLine());
                        
                        // validacion de precio negativo
                        if (precioRevista < 0) {
                            System.out.println("El precio no puede ser negativo. Intente de nuevo.");
                        }
                    } while (precioRevista < 0); // validacion de precio negativo
                    
                    // se solicita la edicion de la revista
                    System.out.println("Ingrese la edicion de la revista:");
                    int edicion = Integer.parseInt(scanner.nextLine());
                    
                    // se crea el objeto revista
                    Revista revista = new Revista(nombreRevista, precioRevista, edicion);
                    // se usa su metodoto sobre escrito de la abstracta
                    revista.imprimirDetalles();
                    // se llama el metodo estatico para el contador
                    Biblioteca.contarProductos();
                    
                    break;
                case "salir":
                    // opcion 3 salir
                    System.out.println("Saliendo");
                    break;
                default:
                    // otra opcion que no sea parte del menu
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        } while (!opcion.equals("salir"));
        
        // mostrar el total de productos ingresados al salir
        System.out.println("\n===============================");
        System.out.println("Cantidad total de productos ingresados: " + Biblioteca.getContadorProductos());
        System.out.println("===============================\n");
    }
}
