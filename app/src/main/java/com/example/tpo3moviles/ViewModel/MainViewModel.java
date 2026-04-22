package com.example.tpo3moviles.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.tpo3moviles.Model.LibroData;

public class MainViewModel extends AndroidViewModel {
    private MutableLiveData<Integer> libroMutable;
    private MutableLiveData<String> errorMutable;

    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Integer> getLibroMutable() {
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
    public void buscarLibro(String query) {
        if (query == null || query.trim().isEmpty()) {
            errorMutable.setValue("Primero ingrese un titulo");
            return;
        }
        int libro = LibroData.buscarLibro(query);
        if (libro == 0) {
            errorMutable.setValue("No se encontro el libro");
            return;
        }
        libroMutable.setValue(libro);
    }


}
