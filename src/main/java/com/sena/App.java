package com.sena;
public class App 
{
    public static void main( String[] args )
    {
        // 1. Crear hamburguesas usando el constructor vacío
        Hamburguesa hamburguesa1 = new Hamburguesa();
        hamburguesa1.setNombre("Hamburguesa Clásica");
        hamburguesa1.setPrecio(20.000);
        hamburguesa1.setIngredientes("Carne, queso, lechuga, tomate");
        hamburguesa1.setCalorias(450);

        // 2. Crear hamburguesas usando el constructor con parámetros
        Hamburguesa hamburguesa2 = new Hamburguesa(
            "Hamburguesa Doble", 
            22.50, 
            "Doble carne, queso cheddar, tocino, cebolla caramelizada", 
            850
        );

        // 3. Crear hamburguesa con validación (esto lanzará error)
        // Hamburguesa hamburguesa3 = new Hamburguesa("Hamburguesa", -10.00, "Carne", 300);
        // IllegalArgumentException: El precio no puede ser negativo

        // 4. Mostrar información de las hamburguesas
        System.out.println("=== MENÚ DE HAMBURGUESAS ===\n");
        
        System.out.println(hamburguesa1.mostrarDetalles());
        System.out.println("\n" + "=".repeat(30) + "\n");
        
        System.out.println(hamburguesa2.mostrarDetalles());
        System.out.println("\n" + "=".repeat(30) + "\n");

        // 5. Modificar datos usando setters
        System.out.println("=== ACTUALIZANDO PRECIOS ===\n");
        hamburguesa1.setPrecio(18.99);
        hamburguesa2.setCalorias(800);
        
        System.out.println("Nueva hamburguesa 1: " + hamburguesa1.mostrarDetalles());
        System.out.println("Nueva hamburguesa 2: " + hamburguesa2.mostrarDetalles());

        // 6. Calcular total de precios
        double total = hamburguesa1.getPrecio() + hamburguesa2.getPrecio();
        System.out.println("\n" + "=".repeat(30));
        System.out.println("TOTAL A PAGAR: $" + total);
    }
}