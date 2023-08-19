package edu.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] ingredientesPizzaItaliana = {"queso", "tomate", "oregano"};
        PizzaItaliana miPizzaItaliana = new PizzaItaliana("Clasica", 35.50, ingredientesPizzaItaliana);

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Desea agregar toppings? (s/n)");
        String respuesta = scanner.nextLine();
        if (respuesta.equals("s")) {
            System.out.println("¿Qué topping desea agregar?");
            String toppingNombre = scanner.nextLine();
            Topping topping = new Topping(toppingNombre);
            miPizzaItaliana.agregarTopping(topping);
        }

        System.out.println(miPizzaItaliana.toString());
        miPizzaItaliana.preparar();
        pizza.ContadorMetodo.contadorSegundos(30);

        scanner.close();
    }
}