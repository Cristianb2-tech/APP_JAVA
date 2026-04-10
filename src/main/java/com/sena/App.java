package com.sena;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // 1. creamos objetos usndo el constructor
        Aprendiz aprendiz1 = new Aprendiz("Juan Perez", "151532552", "juan@correo.com", 20);
        Aprendiz aprendiz2 = new Aprendiz("Maria Gomez", "151532553", "maria@correo.com", 22);

        Aprendiz aprendiz3 = new Aprendiz(); // objeto creado con constructor vacio
        aprendiz3.setNombre("Carlos Rodriguez");
        aprendiz3.setDocumento("151532554");
        aprendiz3.setCorreo("carlos@correo.com");
        aprendiz3.setEdad(25);

        // 2. Creamos una lista para almacenar los aprendices
        ArrayList<Aprendiz> aprendices = new ArrayList<>();
        // 3. Agregamos los aprendices a la lista
        aprendices.add(aprendiz1);
        aprendices.add(aprendiz2);
        aprendices.add(aprendiz3);

        // 4. Imprimimos los datos de los aprendices
        for (Aprendiz aprendiz : aprendices) {

            // llama metodo prsentarse
            System.out.println(aprendiz.presentarse());
            System.out.println("Nombre: " + aprendiz.getNombre());
            System.out.println("Documento: " + aprendiz.getDocumento());
            System.out.println("Correo: " + aprendiz.getCorreo());
            System.out.println("Edad: " + aprendiz.getEdad());
            System.out.println("-------------------------");
        }

    }
}