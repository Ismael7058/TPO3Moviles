package com.example.tpo3moviles.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.tpo3moviles.Model.Libro;
import com.example.tpo3moviles.Model.LibroData;

public class DetalleViewModel extends AndroidViewModel {
    private MutableLiveData<Libro> libroMutable;
    private MutableLiveData<String> errorMutable;

    public DetalleViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Libro> getLibroMutable() {
        if (libroMutable == null) {
            libroMutable = new MutableLiveData<>();
        }
        return libroMutable;
    }

    public LiveData<String> getErrorMutable() {
        if (errorMutable == null) {
            errorMutable = new MutableLiveData<>();
        }
        return errorMutable;
    }

    //Metodo para buscar el libro desde LibroData
    public void buscarLibro(int query) {
        if (query == 0) {
            errorMutable.setValue("Libro no encontrado");
            return;
        }
        Libro libro = LibroData.buscarLibro(query);
        if (libro == null) {
            errorMutable.setValue("No se encontro el libro");
            return;
        }
        libroMutable.setValue(libro);
    }
}
