package com.example.tpo3moviles.View;

import static android.widget.Toast.LENGTH_SHORT;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.tpo3moviles.ViewModel.DetalleViewModel;
import com.example.tpo3moviles.databinding.ActivityDetalleBinding;

public class DetalleActivity extends AppCompatActivity {
    private ActivityDetalleBinding b;
    private DetalleViewModel vm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Inicializo el binding
        b = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        //Inicializo el ViewModel
        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(DetalleViewModel.class);
        //Recibo el id del libro
        int idLibro = getIntent().getIntExtra("libro", 0);
        //Observo el libro
        vm.getLibroMutable().observe(this, libro -> {
            b.title.setText(libro.getTitle());
            b.description.setText(libro.getDescription());
            b.autor.setText(libro.getAutor());
            b.year.setText("Año: " + libro.getYear());
            b.pages.setText("Páginas: " + libro.getPages());
            b.img.setImageResource(libro.getImage());
            b.tvGenres.setText (libro.getGenres());
        });
        //Observo el error
        vm.getErrorMutable().observe(this, error -> {
            Toast.makeText(DetalleActivity.this, error, LENGTH_SHORT).show();
            finish();
        });
        //Busco el libro
        vm.buscarLibro(idLibro);
        //Listener para el boton de volver
        b.btnVolver.setOnClickListener(view -> {
            finish();
        });
    }
}
