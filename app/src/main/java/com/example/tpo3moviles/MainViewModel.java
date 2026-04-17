package com.example.tpo3moviles;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class MainViewModel extends AndroidViewModel {
    private MutableLiveData<Libro> libroMutable;
    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<Libro> getLibroMutable() {
        if (libroMutable == null) {
            libroMutable = new MutableLiveData<>();
        }
        return libroMutable;
    }

    public void buscarLibro(String query) {

    }


}
