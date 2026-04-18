package com.example.tpo3moviles;

import static android.widget.Toast.LENGTH_SHORT;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.tpo3moviles.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private MainViewModel vm;
    private ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainViewModel.class);

        b.btnSearch.setOnClickListener(view -> {
            vm.buscarLibro(b.etSearch.getText().toString());
        });
        vm.getLibroMutable().observe(this, libro -> {
            Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
            intent.putExtra("libro", libro);
            startActivity(intent);
        });
        vm.getErrorMutable().observe(this, error -> {
            Toast.makeText(MainActivity.this, error, LENGTH_SHORT).show();
        });
    }

}