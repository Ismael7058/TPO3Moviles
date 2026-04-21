package com.example.tpo3moviles;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class MainViewModel extends AndroidViewModel {
    private MutableLiveData<Integer> libroMutable;
    private MutableLiveData<String> errorMutable;
    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<Integer> getLibroMutable() {
        if (libroMutable == null) {
            libroMutable = new MutableLiveData<>();
        }
        return libroMutable;
    }

    public MutableLiveData<String> getErrorMutable() {
        if (errorMutable == null) {
            errorMutable = new MutableLiveData<>();
        }
        return errorMutable;
    }

    public void buscarLibro(String query) {
        if (query.isEmpty()) {
            errorMutable.setValue("Ingrese un título valido");
        }
        int libro = LibroData.buscarLibro(query);
        if (libro >= 0) {
            libroMutable.setValue(libro);
        } else {
            errorMutable.setValue("Libro no encontrado");
        }
    }


}
