package edu.ejercicios;
import java.util.ArrayList;
import java.util.List;

class PizzaItaliana extends pizza {
    private static String salsa = "salsa de tomate italiana";
    private List<Topping> toppings = new ArrayList<>();

    public PizzaItaliana(String nombre, double precio, String[] ingredientes) {
        super(nombre, precio, ingredientes);
    }

    public void agregarTopping(Topping topping) {
        toppings.add(topping);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza italiana " + getNombre());
        System.out.println("Empezando a amasar la masa: " + getMasa());
        System.out.println("Agregando la salsa: " + salsa);
        System.out.println("Seleccionando ingredientes:");
        for (String ingrediente : getIngredientes()) {
            System.out.println("Agregando " + ingrediente);
        }
        System.out.println("Horneando...");
    }

    @Override
    public String toString() {
        return super.toString() + ", salsa: " + salsa;
    }
}
