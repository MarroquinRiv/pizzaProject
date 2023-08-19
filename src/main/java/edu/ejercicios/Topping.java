package edu.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Topping {
    private String nombre;

    public Topping(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Topping pina = new Topping("piña");
        Topping champinones = new Topping("champiñones");
    }

    public void agregarTopping(Topping topping) {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(topping);
    }
}
