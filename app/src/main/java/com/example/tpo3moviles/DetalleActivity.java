package com.example.tpo3moviles;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tpo3moviles.databinding.ActivityDetalleBinding;

public class DetalleActivity extends AppCompatActivity {
    private ActivityDetalleBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        int idLibro = getIntent().getIntExtra("libro", 0);
        Libro libro = LibroData.buscarLibro(idLibro);
        if (libro == null) {
            finish();
            return;
        }
            b.title.setText(libro.getTitle());
            b.description.setText(libro.getDescription());
            b.autor.setText(libro.getAutor());
            b.year.setText("Año: " + libro.getYear());
            b.pages.setText("Páginas: " + libro.getPages() + " \uD83D\uDCC4");
            b.img.setImageResource(libro.getImage());
            b.tvGenres.setText(libro.getGenres());


        b.btnVolver.setOnClickListener(view -> {
            finish();
        });
    }
}
