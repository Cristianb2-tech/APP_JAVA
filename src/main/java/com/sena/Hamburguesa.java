package com.sena;

public class Hamburguesa {

    private String nombre;
    private double precio;
    private String ingredientes;
    private int calorias;

    public Hamburguesa() {
    }

    public Hamburguesa(String nombre, double precio, String ingredientes, int calorias) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {

        if (precio >= 0) {
            this.precio = precio;
        } else {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setCalorias(int calorias) {

        if (calorias >= 0) {
            this.calorias = calorias;
        } else {
            throw new IllegalArgumentException("Las calorías no pueden ser negativas");
        }
    }
    
    public String mostrarDetalles() {
        return "Hamburguesa: " + nombre + 
               "\nPrecio: $" + precio + 
               "\nIngredientes: " + ingredientes + 
               "\nCalorías: " + calorias + " kcal";
    }
}