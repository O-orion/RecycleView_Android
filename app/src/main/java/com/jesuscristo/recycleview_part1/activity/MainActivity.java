package com.jesuscristo.recycleview_part1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.jesuscristo.recycleview_part1.R;
import com.jesuscristo.recycleview_part1.adapter.Adapter;
import com.jesuscristo.recycleview_part1.activity.model.Filme;
import com.jesuscristo.recycleview_part1.activity.model.RecyclerItemClickListener;

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

        //adicionando linha
        recy.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        //melhorando a performave definindo um tamanho fixo
        recy.setHasFixedSize( true );

        //Definindo o adapter
        recy.setAdapter( adptador );

        // adicionando evento de click
        recy.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recy,
                        new RecyclerItemClickListener.OnItemClickListener() {

                            @Override
                            public void onItemClick(View view, int position) {
                                Filme filme = listaFilmes.get( position );
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Jesus é bom: " + filme.getTituloFilme(),
                                        Toast.LENGTH_LONG
                                ).show();

                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Filme filme = listaFilmes.get( position );
                                Toast.makeText(
                                        getApplicationContext(),
                                        "JESUS E MUITO BOM: Item clicado " + filme.getTituloFilme(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            }
                        }
                )
        );

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