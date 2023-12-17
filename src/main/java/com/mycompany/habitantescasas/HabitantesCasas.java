/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.habitantescasas;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;
import java.util.Scanner;
public class HabitantesCasas {

    public static void main(String[] args) {
        //Datos a usar
       String nombre;
       int edad;
       String direccion;
       int numHabitantes;
       
       Scanner scanner = new Scanner(System.in);
       ArrayList<Casa> listaDeCasas = new ArrayList<>();
       
       System.out.println("\t\t\t>Habitantes de casas<");
       System.out.println("---------------------------------------------------------");
       //for con el numero de casas que son dos
       for(int i=0; i<2; i++)
       {
            System.out.printf("\n\tCasa %d%n", (i + 1));
            System.out.println("..............................");
            System.out.print("\nDireccion: ");
            direccion = scanner.next();
            Casa casa = new Casa(direccion);

            //Personas de cada casa
            System.out.print("Cuántas personas viven en la casa "+ (i+1)+" :");
            numHabitantes= scanner.nextInt();
      
            //creamos otro for dentro del numero de clase;
            for(int y=0; y<numHabitantes; y++)
            {
                System.out.print("\nNombre de la persona "+(y+1)+":");
                nombre = scanner.next();
                System.out.print("Edad de la persona "+(y+1)+": ");
                edad = scanner.nextInt();
                Persona persona = new Persona(nombre, edad);
                casa.agregarHabitante(persona);
             }
            listaDeCasas.add(casa);
       }
       
       // Imprimir información de casas y habitantes
       
       System.out.println("---------------------------------------------------------\n.");
        for (Casa casa : listaDeCasas) {
            System.out.println("Habitantes en la casa con direccion: " + casa.getDireccion());
          

            for (Persona habitante : casa.getHabitantes()) {
                 System.out.println("- " + habitante.getNombre() + " " +habitante.getEdad()+ "  años");  

            }
        }
    }
}