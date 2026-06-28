package Interfaz;

import Interfaces.Gato;
import Interfaces.IAnimal;
import Interfaces.Perro;
import Interfaces.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre;
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        List<IAnimal> animales = new ArrayList<IAnimal>();

        do {
            menu();
            System.out.println("Ingrese la Opción: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1: {
                    System.out.println("Ingrese el nombre del perro: ");
                    nombre = sc.nextLine();
                    animales.add(new Perro(nombre));
                }
                break;
                case 2: {
                    System.out.println("Ingrese el nombre del gato: ");
                    nombre = sc.nextLine();
                    animales.add(new Gato(nombre));
                }
                break;
                case 3: {
                    System.out.println("----- LISTADO DE PERROS Y GATOS-----");

                    for (IAnimal a : animales) {

                        Animal animal = (Animal) a;

                        System.out.println(
                                "Nombre: " + animal.getNombre() +
                                        "\nTipo: " + animal.tipoAnimal() +
                                        "\nSonido: " + animal.comunicarse()
                        );
                    }
                }
                break;
                case 4: {
                    System.out.println("\n----- PERROS -----");

                    for (IAnimal a : animales) {

                        if (a instanceof Perro) {
                            Animal perro = (Perro) a;

                            System.out.println(
                                    "\nNombre: " + perro.getNombre() +
                                            "\nTipo: " + perro.tipoAnimal() +
                                            "\nSonido: " + perro.comunicarse()
                            );
                        }
                    }
                }
                break;
                case 5: {
                    System.out.println("\n----- GATOS -----");

                    for (IAnimal a : animales) {

                        if (a instanceof Gato) {
                            Animal gato = (Gato) a;

                            System.out.println(
                                    "\nNombre: " + gato.getNombre() +
                                            "\nTipo: " + gato.tipoAnimal() +
                                            " \nSonido: " + gato.comunicarse()
                            );
                        }
                    }
                }
                break;
                case 6: {
                    System.out.printf("Saliendo Del Programa. !Exitos......!");
                }
                break;
            }
        } while (opc != 6);
    }
    public static void menu(){
        System.out.println("-------- MENU DE ANIMALES ------------\n");
        System.out.println("1. Ingrese perro\n");
        System.out.println("2. Ingrese gato\n");
        System.out.println("3. Mostrar Lista\n");
        System.out.println("4. Mostrar Perros\n");
        System.out.println("5. Mostrar Gatos\n");
        System.out.println("6. Salir\n");
    }
}
