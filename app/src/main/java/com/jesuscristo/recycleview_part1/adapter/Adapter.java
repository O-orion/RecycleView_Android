package com.jesuscristo.recycleview_part1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jesuscristo.recycleview_part1.R;
import com.jesuscristo.recycleview_part1.activity.model.Filme;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {
    private List<Filme> listaFilmes;

    public Adapter(List<Filme> lista) {
        this.listaFilmes = lista;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //recuperando layout xml e transformando em um objeto
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.adapter_lista,
                parent,
                false
        );

        return new myViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        Filme filme = listaFilmes.get( position );
        holder.titulo.setText( filme.getTituloFilme() );
        holder.ano.setText( filme.getAno() );
        holder.genero.setText( filme.getGenero() );

    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    //criando uma classe para guarda os dados vh

    public class myViewHolder extends RecyclerView.ViewHolder{
        TextView titulo;
        TextView ano;
        TextView genero;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.textTitulo);
            ano = itemView.findViewById(R.id.textAno);
            genero = itemView.findViewById(R.id.textGenero);

        }
    }
}
