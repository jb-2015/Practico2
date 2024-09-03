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
    //private MainActivityViewModel mv;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        //mv = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
        Button botonBuscar = binding.btnBuscar;
        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mv.setTituloLibro(binding.etInput.getText()+"");
                Log.d("raw", "tocandooo");
                Intent intent = new Intent(getApplication(), ActivityLibros.class);
                //intent.putExtra("tituloLibro", mv.getTituloLibro()+"");
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        setContentView(binding.getRoot());
    }
}