# TPO3Moviles 
Aplicación Android para buscar libros por título y ver sus detalles.
## Descripción
Permite al usuario ingresar el título de un libro, buscarlo en un catálogo local y navegar a una pantalla de detalle con toda la información del libro encontrado.
## Características
- Búsqueda de libros por título (insensible a mayúsculas/minúsculas)
- Pantalla de detalle con: título, autor, año de publicación, descripción, géneros, número de páginas e imagen de portada
- Manejo de errores con mensajes Toast
- Arquitectura MVVM con LiveData y ViewBinding
## Catálogo disponible
| Título | Autor | Año |
|--------|-------|-----|
| El Principito | Antoine de Saint-Exupéry | 1943 |
| Harry Potter y el misterio del príncipe | J.K. Rowling | 2005 |
| Animales fantásticos y dónde encontrarlos | J.K. Rowling | 2001 |
## Arquitectura
```
com.example.tpo3moviles/
├── Model/
│   ├── Libro.java          # Entidad libro
│   └── LibroData.java      # Catálogo local y lógica de búsqueda
├── ViewModel/
│   ├── MainViewModel.java  # ViewModel de la pantalla principal
│   └── DetalleViewModel.java # ViewModel de la pantalla de detalle
├── View/
│   └── DetalleActivity.java # Pantalla de detalle del libro
└── MainActivity.java        # Pantalla principal con buscador
```
## Requisitos
- Android SDK mínimo: **API 33** (Android 13)
- Android SDK objetivo: **API 36**
- Java 11
## Uso
1. En la pantalla principal, escribí el título del libro en el campo de búsqueda.
2. Presioná el botón **Buscar**.
3. Si el libro existe en el catálogo, se abrirá la pantalla de detalle con toda su información.
4. Si no se encuentra, aparecerá un mensaje de error.
5. Desde la pantalla de detalle, presioná **Volver** para regresar a la búsqueda.

## Integrantes del grupo
- Miranda Salmin, Ismael Ariel - DNI: 44993241
- Quiroga, Maximo Tomas - DNI: 44642650
- Zegarra, Juan Cruz - DNI: 43057480
