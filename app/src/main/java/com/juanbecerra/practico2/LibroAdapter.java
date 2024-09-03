package com.juanbecerra.practico2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.ViewHolderLibro> {
    private List<Libro> listaLibros;
    private LayoutInflater li;

    public LibroAdapter(List<Libro> listaLibros, LayoutInflater li){
        this.listaLibros = listaLibros;
        this.li = li;
    }

    @NonNull
    @Override
    public ViewHolderLibro onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = li.inflate(R.layout.libros, parent, false);
        return new ViewHolderLibro(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLibro holder, int position) {
        Libro libro = listaLibros.get(position);
        holder.tvTitulo.setText(libro.getTitulo());
        holder.tvIsbn.setText(libro.getIsbn());
        holder.tvAutor.setText(libro.getAutor());
        holder.tvCantPaginas.setText(libro.getCantPaginas()+"");
        holder.tvAnioLanzamiento.setText(libro.getAnioLanzammiento()+"");
        holder.tvGenero.setText(libro.getGenero());
        holder.tvDescripcion.setText(libro.getDescripcion());
        holder.ivPortada.setImageResource(libro.getImagen());
    }

    @Override
    public int getItemCount() {
        return listaLibros.size();
    }

    public class ViewHolderLibro extends RecyclerView.ViewHolder {
        TextView tvTitulo, tvIsbn, tvAutor, tvCantPaginas, tvAnioLanzamiento, tvGenero, tvDescripcion;
        ImageView ivPortada;

        public ViewHolderLibro(@NonNull View itemView) {
            super(itemView);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvIsbn = itemView.findViewById(R.id.tvIsbn);
            tvAutor = itemView.findViewById(R.id.tvAutor);
            tvCantPaginas = itemView.findViewById(R.id.tvCantPaginas);
            tvAnioLanzamiento = itemView.findViewById(R.id.tvAnioLanzamiento);
            tvGenero = itemView.findViewById(R.id.tvGenero);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
            ivPortada = itemView.findViewById(R.id.ivPortada);
        }
    }
}
