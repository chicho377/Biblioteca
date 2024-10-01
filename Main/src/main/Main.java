
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
            
            // inicialixe la variable opcion
            opcion = Integer.parseInt(scanner.nextLine());
        } while (opcion != 3);
    }
}
