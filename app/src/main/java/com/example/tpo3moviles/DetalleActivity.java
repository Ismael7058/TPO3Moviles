package com.example.tpo3moviles;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.tpo3moviles.databinding.ActivityDetalleBinding;

public class DetalleActivity extends AppCompatActivity {

    private DetalleViewModel viewModel;
    private ActivityDetalleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(DetalleViewModel.class);

        viewModel.getLibroMutable().observe(this, new Observer<Libro>() {
            @Override
            public void onChanged(Libro libro) {
                binding.title.setText(libro.getTitle());
                binding.autor.setText(libro.getAutor());
                binding.img.setImageResource(libro.getImage());
                binding.year.setText(libro.getYear());
                binding.pages.setText( String.valueOf(libro.getPage()));
                binding.tags.removeAllViews();
                for (String genero : libro.getGender()) {
                    TextView textView = new TextView(DetalleActivity.this);
                    textView.setBackgroundResource(R.drawable.pildora);
                    textView.setPadding(16, 8, 16, 8);
                    textView.setTextSize(16);
                    textView.setText(genero);
                    binding.tags.addView(textView);
                }
                binding.description.setText(libro.getDescription());
            };
        });
        viewModel.cargarLibro(getIntent());

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}