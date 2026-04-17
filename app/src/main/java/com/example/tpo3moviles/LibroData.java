package com.example.tpo3moviles;

import java.util.ArrayList;
import java.util.List;

public class LibroData {

    private static List<Libro> libros;

    static {
        libros = new ArrayList<>();
        libros.add(new Libro("Libro 1", "Autor 1", "2023", "Descripción del libro 1", R.drawable.libro1));
        libros.add(new Libro("Libro 2", "Autor 2", "2023", "Descripción del libro 2", R.drawable.libro2));
        libros.add(new Libro("Libro 3", "Autor 3", "2023", "Descripción del libro 3", R.drawable.libro3));
    }

    public static Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitle().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

}
