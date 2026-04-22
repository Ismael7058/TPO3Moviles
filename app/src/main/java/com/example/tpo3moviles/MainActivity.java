package com.example.tpo3moviles;

import static android.widget.Toast.LENGTH_SHORT;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.tpo3moviles.View.DetalleActivity;
import com.example.tpo3moviles.ViewModel.MainViewModel;
import com.example.tpo3moviles.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private MainViewModel vm;
    private ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Inicializo el binding
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        //Inicializo el ViewModel
        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainViewModel.class);
        //Observo el libro y envío al detalle
        vm.getLibroMutable().observe(this, idLibro -> {
            Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
            intent.putExtra("libro", idLibro);
            startActivity(intent);
        });
        //Observo el error y muestro toast
        vm.getErrorMutable().observe(this, error -> {
            Toast.makeText(MainActivity.this, error, LENGTH_SHORT).show();
        });
        //Listener para el botón de buscar
        b.btnSearch.setOnClickListener(view -> {
            vm.buscarLibro(b.etSearch.getText().toString());
        });
    }

}