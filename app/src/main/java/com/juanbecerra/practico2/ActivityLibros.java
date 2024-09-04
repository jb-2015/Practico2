package com.juanbecerra.practico2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.juanbecerra.practico2.databinding.ActivityLibrosActivityBinding;

import java.util.List;

public class ActivityLibros extends AppCompatActivity {
    private ActivityLibrosViewModel vm;
    private ActivityLibrosActivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLibrosActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(ActivityLibrosViewModel.class);
        vm.getMListaLibros().observe(this, new Observer<List<Libro>>() {
            @Override
            public void onChanged(List<Libro> libros) {
                LibroAdapter la = new LibroAdapter(libros, getLayoutInflater());
                GridLayoutManager glm = new GridLayoutManager(ActivityLibros.this, 1, GridLayoutManager.VERTICAL, false);
                RecyclerView rv = binding.listaLibros;
                rv.setLayoutManager(glm);
                rv.setAdapter(la);
            }
        });
        Intent i = getIntent();
        String tituloLibro = i.getStringExtra("tituloLibro");
        vm.cargarListaLibros(tituloLibro);
    }
}