package com.example.tpo3moviles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.tpo3moviles.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private MainViewModel viewModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainViewModel.class);

        viewModel.getLibroMutable().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer indice) {
                Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
                intent.putExtra("libro", indice);
                startActivity(intent);
            }
        });
        viewModel.getErrorMutable().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String msj) {
                binding.tvError.setText(msj);
            }
        });

        binding.btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.buscarLibro(binding.etSearch.getText().toString());
            }
        });
    }
}