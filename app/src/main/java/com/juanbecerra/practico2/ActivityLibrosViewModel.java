package com.juanbecerra.practico2;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

public class ActivityLibrosViewModel extends AndroidViewModel {
    private MutableLiveData<ArrayList<Libro>> mListaLibros;
    private ArrayList<Libro> listaLibros = new ArrayList<>();
    private ArrayList<Libro>listaActualizada = new ArrayList<>();
    public ActivityLibrosViewModel(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<ArrayList<Libro>> getMListaLibros(){
        if(mListaLibros == null){
            mListaLibros = new MutableLiveData<>();
        }
        return mListaLibros;
    }

    public void cargarListaLibros(String tituloLibro){
        listaLibros.add(new Libro("12345", "Harry Potter y la piedra filosofal", "J.K.Rowling",306, 1997, "Ciencia Ficción", "La Piedra Filosofal fue una piedra roja hecha por hombres con propiedades mágicas. Podía ser utilizada para crear el Elixir de la Vida, el cuál alarga la vida del bebedor, al igual que transforma cualquier metal en oro puro. El famoso alquimista Nicolas Flamel creó la única Piedra Filosofal conocida en existencia.", R.drawable.harry_potter1));
        listaLibros.add(new Libro("54321", "Harry Potter y la camara secreta", "J.K.Rowling",320, 1998, "Ciencia Ficción", "Sin saber que alguien ha abierto la Cámara de los Secretos, dejando escapar una serie de monstruos peligrosos, Harry y sus amigos Ron y Hermione tendrán que enfrentarse con arañas gigantes, serpientes encantadas, fantasmas enfurecidos y, sobre todo, con la mismísima reencarnación de su más temible adversario.", R.drawable.harry_potter2));
        listaLibros.add(new Libro("24680", "El señor de los anillos", "J.R.R.Tolkien",1392, 1954, "Ciencia Ficción", "La novela narra el viaje del protagonista principal, Frodo Bolsón, hobbit de la Comarca, para destruir el Anillo Único y la consiguiente guerra que provocará el enemigo para recuperarlo, ya que es la principal fuente de poder de su creador, el señor oscuro Sauron. «Tres Anillos para los Reyes Elfos bajo el cielo.", R.drawable.elseniordelosanillos));
        listaLibros.add(new Libro("13579", "Nada es azar", "Richard Bach",278, 1969, "Aventura", "Richard Bach relata un verano excepcional que pasó con dos amigos en los años sesenta. Con dos pequeños aeroplanos y un paracaídas, ofrecían viajes por el interior de Estados Unidos a cambio del dinero para el combustible y la comida.", R.drawable.nada_es_azar));
        for(Libro l:listaLibros){
            if(l.getTitulo().toLowerCase().startsWith(tituloLibro.toLowerCase())){
                listaActualizada.add(l);
            }
        }
        mListaLibros.setValue(listaActualizada);
    }

}
