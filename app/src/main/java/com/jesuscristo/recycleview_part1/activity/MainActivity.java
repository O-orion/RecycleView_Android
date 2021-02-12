package com.jesuscristo.recycleview_part1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jesuscristo.recycleview_part1.R;
import com.jesuscristo.recycleview_part1.adapter.Adapter;
import com.jesuscristo.recycleview_part1.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recy;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recy =      findViewById(R.id.recyclerView);

        //criando a lista de filmes
        this.criarFilmes();

        //configurando o adapter
        Adapter adptador = new Adapter( listaFilmes );

        //configurando managerLayout
        RecyclerView.LayoutManager layout = new LinearLayoutManager( getApplicationContext() );
        recy.setLayoutManager( layout );

        //melhorando a performave definindo um tamanho fixo
        recy.setHasFixedSize( true );

        //Definindo o adapter
        recy.setAdapter( adptador );
    }

    public void criarFilmes(){


        Filme filme = new Filme("JESUS CRISTO É O SENHOR!!","PARA TODO SEMPRE",
                "CELESTIAL DOS CELESTIAIS");
        listaFilmes.add(filme);

        filme = new Filme("Corajoso","2017","Ação/Espiritual");
        listaFilmes.add(filme);

        filme = new Filme("Liga da Justiça","2017","Ação/Ficção");
        listaFilmes.add(filme);

        filme = new Filme("Homem Aranha de Voltar ao Lar","201","Ficção");
        listaFilmes.add(filme);

        filme = new Filme("Homem Aranha de Voltar ao Lar","201","Ficção");
        listaFilmes.add(filme);

        filme = new Filme("Homem Aranha de Voltar ao Lar","201","Ficção");
        listaFilmes.add(filme);

        filme = new Filme("Homem Aranha de Voltar ao Lar","201","Ficção");
        listaFilmes.add(filme);

        filme = new Filme("Homem Aranha de Voltar ao Lar","201","Ficção");
        listaFilmes.add(filme);

        filme = new Filme("Homem Aranha de Voltar ao Lar","201","Ficção");
        listaFilmes.add(filme);

        filme = new Filme("Moise principe do Egito","1997","real");
        listaFilmes.add(filme);

    }

}