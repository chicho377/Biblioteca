
package main;

import java.util.Scanner;

/*
 * Fabricio Mora Gomez
 * Examen 1
 * Programacion 2
 */
public class Main {

    public static void main(String[] args) {
        
    }
    
    // funcion para el menu
    public static void menu(){
        
        // objeto scanner para obtener los datos desde la consola
        Scanner scanner = new Scanner(System.in);
        
        // variable opcion para el ciclo del menu
        int opcion;
        
        // ciclo do while para el menu
        do {
            // impresion del menu en consola
            System.out.println("Menu:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Agregar revista");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");
            
            // inicializacion de la variable opcion
            opcion = Integer.parseInt(scanner.nextLine());
            
            // switch para el control de opciones del menu
            switch(opcion){
                case 1:
                    // opcion 1 agregar libro
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
                    break;
                case 2:
                    // opcion 2 agregar revista
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
                    break;
                case 3:
                    // opcion 3 salir
                    System.out.println("Saliendo");
                    break;
                default:
                    // otra opcion que no sea parte del menu
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 3);
    }
}
