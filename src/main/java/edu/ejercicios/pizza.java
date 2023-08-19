package edu.ejercicios;

public class pizza {

    public pizza(String nombre, double precio, String[] ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private double precio;
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private static String masa = "masa tradicional";
    public static String getMasa() {
        return masa;
    }

    String ingredientes[];
    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void preparar() {
        System.out.println("Preparando pizza " + this.nombre);
        System.out.println("Empezamos amsando la : " + getMasa() + " para que amanse.");
        System.out.println("Seleccionando ingredientes:");
        for (String ingrediente : this.ingredientes) {
            System.out.println("Agregando " + ingrediente);
        }
        System.out.println("Horneando...");
    }

    public class ContadorMetodo {
        public static void main(String[] args) {
            int segundos = 30;
            contadorSegundos(segundos);
        }

        public static void contadorSegundos(int segundos) {
            int contador = 0;
            while (contador < segundos) {
                System.out.println(contador + 1);
                contador++;

                try {
                    Thread.sleep(1000); // Esperar 1000 ms (1 segundo)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Pizza lista!");
        }
    }

    @Override
    public String toString()
    {
        return "Nombre de la pizza: " + nombre + ", y su precio es: " + precio;
    }
}
