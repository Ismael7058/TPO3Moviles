package com.example.tpo3moviles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibroData {

    private static final List<Libro> libros;

    static {
        libros = new ArrayList<>();
        libros.add(new Libro(1, "El principito", "Antoine de Saint-Exupéry", "1943", "'El Principito' (en francés: 'Le Petit Prince'), publicado el 6 de abril de 1943, es el relato corto más conocido del escritor y aviador francés Antoine de Saint-Exupéry. Lo escribió mientras se hospedaba en un hotel en Nueva York y fue publicado por primera vez en los Estados Unidos. Ha sido traducido a ciento ochenta lenguas y dialectos, convirtiéndose en una de las obras más reconocidas de la literatura universal. El principito habita un pequeñísimo asteroide, que comparte con una flor caprichosa y tres volcanes. Pero tiene «problemas» con la flor y empieza a experimentar la soledad; hasta que decide abandonar el planeta en busca de un amigo. Buscando esa amistad recorre varios planetas, habitados sucesivamente por un rey, un vanidoso, un borracho, un hombre de negocios, un farolero, un geógrafo… El concepto de «seriedad» que tienen estas «personas mayores» le deja perplejo y confuso. Prosiguiendo su búsqueda llega al planeta Tierra, pero en su enorme extensión siente más que nunca la soledad. Una serpiente le da su versión pesimista sobre los hombres y lo poco que se puede esperar de ellos. Tampoco el zorro contribuye a mejorar su opinión, pero en cambio le enseña el modo de hacerse amigos: hay que crear lazos, hay que dejarse «domesticar». Y al final le regala su secreto: «Sólo se ve bien con el corazón. Lo esencial es invisible a los ojos». De pronto, el principito se da cuenta de que su flor le ha «domesticado» y decide regresar a su planeta valiéndose de los medios expeditivos que le ofrece la serpiente. Y es entonces cuando entra en contacto con el aviador; también el hombre habrá encontrado un amigo", R.drawable.img1, 140, Arrays.asList("Infantil", "Fabula", "Ficcion", "Novela Corta")));
        libros.add(new Libro(
                2,
                "Harry Potter y el misterio del príncipe",
                "J.K. Rowling",
                "2005",
                "Con dieciséis años cumplidos, Harry inicia el sexto curso en Hogwarts en medio de terribles acontecimientos que asolan Inglaterra. Elegido capitán del equipo de Quidditch, los entrenamientos, los exámenes y las chicas ocupan todo su tiempo, pero la tranquilidad dura poco. A pesar de los férreos controles de seguridad que protegen la escuela, dos alumnos son brutalmente atacados. Dumbledore sabe que se acerca el momento, anunciado por la Profecía, en que Harry y Voldemort se enfrentarán a muerte: «El único con poder para vencer al Señor Tenebroso se acerca… Uno de los dos debe morir a manos del otro, pues ninguno de los dos podrá vivir mientras siga el otro con vida.». El anciano director solicitará la ayuda de Harry y juntos emprenderán peligrosos viajes para intentar debilitar al enemigo, para lo cual el joven mago contará con la ayuda de un viejo libro de pociones perteneciente a un misterioso príncipe, alguien que se hace llamar Príncipe Mestizo.",
                R.drawable.img2,
                608,
                Arrays.asList("Fantasía", "Aventura", "Magia")
        ));

        libros.add(new Libro(
                3, "Animales fantásticos y dónde encontrarlos","J.K. Rowling","2001","Hay un ejemplar de Animales Fantásticos y Dónde Encontrarlos en casi todos los hogares de magos del país. Ahora, sólo por cierto tiempo, también los muggles pueden descubrir dónde viven los quintapeds, qué come el puffskein y por qué es mejor no dejar leche fuera de casa para un knarl", R.drawable.img3,128,Arrays.asList("Fantasía", "Guía", "Magia")
        ));
        libros.add(new Libro(4, "El principito", "Antoine de Saint-Exupéry", "1943", "'El Principito' (en francés: 'Le Petit Prince'), publicado el 6 de abril de 1943, es el relato corto más conocido del escritor y aviador francés Antoine de Saint-Exupéry. Lo escribió mientras se hospedaba en un hotel en Nueva York y fue publicado por primera vez en los Estados Unidos. Ha sido traducido a ciento ochenta lenguas y dialectos, convirtiéndose en una de las obras más reconocidas de la literatura universal. El principito habita un pequeñísimo asteroide, que comparte con una flor caprichosa y tres volcanes. Pero tiene «problemas» con la flor y empieza a experimentar la soledad; hasta que decide abandonar el planeta en busca de un amigo. Buscando esa amistad recorre varios planetas, habitados sucesivamente por un rey, un vanidoso, un borracho, un hombre de negocios, un farolero, un geógrafo… El concepto de «seriedad» que tienen estas «personas mayores» le deja perplejo y confuso. Prosiguiendo su búsqueda llega al planeta Tierra, pero en su enorme extensión siente más que nunca la soledad. Una serpiente le da su versión pesimista sobre los hombres y lo poco que se puede esperar de ellos. Tampoco el zorro contribuye a mejorar su opinión, pero en cambio le enseña el modo de hacerse amigos: hay que crear lazos, hay que dejarse «domesticar». Y al final le regala su secreto: «Sólo se ve bien con el corazón. Lo esencial es invisible a los ojos». De pronto, el principito se da cuenta de que su flor le ha «domesticado» y decide regresar a su planeta valiéndose de los medios expeditivos que le ofrece la serpiente. Y es entonces cuando entra en contacto con el aviador; también el hombre habrá encontrado un amigo", R.drawable.img1, 140, Arrays.asList("Infantil", "Fabula", "Ficcion", "Novela Corta")));
    }

    public static int buscarLibro(String titulo) {

        for (Libro libro : libros) {
            if (libro.getTitle().toLowerCase().contains(titulo.toLowerCase())) {
                return libro.id;
            }
        }
        return 0;
    }
    public static Libro buscarLibro(int id) {
        for (Libro libro : libros) {
            if (libro.id == id) {
                return libro;
            }
        }
        return null;
    }
}

