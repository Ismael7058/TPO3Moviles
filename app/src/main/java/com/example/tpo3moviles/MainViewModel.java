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
        if (query == null || query.trim().isEmpty()) {
            errorMutable.setValue("Primero ingrese un titulo");
            return;
        }
        int  libro = LibroData.buscarLibro(query);
        if (libro == 0) {
            errorMutable.setValue("No se encontro el libro");
            return;
        }
        libroMutable.setValue(libro);
    }


}
