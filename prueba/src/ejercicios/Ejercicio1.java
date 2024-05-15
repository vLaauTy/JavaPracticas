package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear una lista vacía de números enteros
        List<Integer> lista = new ArrayList<>();

        // Insertar el número 20 al principio de la lista
        lista.add(0, 20);
        System.out.println("Lista después de insertar 20 al principio: " + lista);

        // Insertar el número 3 al final de la lista
        lista.add(3);
        System.out.println("Lista después de insertar 3 al final: " + lista);

        // Insertar el número 15 en la tercera posición de la lista
        if (lista.size() >= 2) {
            lista.add(2, 15);
        } else {
            lista.add(15);
        }
        System.out.println("Lista después de insertar 15 en la tercera posición: " + lista);
    }
}