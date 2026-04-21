package com.example.tpo3moviles;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class DetalleViewModel extends AndroidViewModel {
    private MutableLiveData<Libro> libroMutable;

    public DetalleViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Libro> getLibroMutable() {
        if (libroMutable == null) {
            libroMutable = new MutableLiveData<>();
        }
        return libroMutable;
    }

    public void cargarLibro(Intent intent) {
        int indice = intent.getIntExtra("libro", -1);
        Libro libro = LibroData.buscarLibro(indice);
        if (libro != null) {
            libroMutable.setValue(libro);
        }
    }
}
