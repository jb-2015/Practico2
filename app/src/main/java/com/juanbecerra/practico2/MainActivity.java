package com.juanbecerra.practico2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.juanbecerra.practico2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
//    private MainActivityViewModel mv;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        mv = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        Button botonBuscar = binding.btnBuscar;
        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Rawww", binding.etInput.getText()+"");
                Intent intent = new Intent(getApplication(), ActivityLibros.class);
                intent.putExtra("tituloLibro", binding.etInput.getText()+"");
//                mv.setTituloLibro(binding.etInput.getText()+"");
                startActivity(intent);
            }
        });
    }
}