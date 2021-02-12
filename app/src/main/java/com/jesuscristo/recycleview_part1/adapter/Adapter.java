package com.jesuscristo.recycleview_part1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jesuscristo.recycleview_part1.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {
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
        holder.titulo.setText("JESUS CRISTO É O SENHOR");
        holder.ano.setText("SEMPRE");
        holder.genero.setText("CELESTIAL DOS CELESTIAI");

    }

    @Override
    public int getItemCount() {
        return 0;
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
