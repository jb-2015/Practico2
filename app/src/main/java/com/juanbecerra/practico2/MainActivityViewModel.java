package com.juanbecerra.practico2;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class MainActivityViewModel extends AndroidViewModel {
    private MutableLiveData<String> tituloLibro;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<String> getTituloLibro() {
        if(tituloLibro == null){
            tituloLibro = new MutableLiveData<>();
        }
        return tituloLibro;
    }

    public void setTituloLibro(String titulo){
        tituloLibro.setValue(titulo);
    }

}
