package com.jesuscristo.recycleview_part1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jesuscristo.recycleview_part1.R;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recy =      findViewById(R.id.recyclerView);

        //configurando o adapter

        //configurando managerLayout

        RecyclerView.LayoutManager layout = new LinearLayoutManager( getApplicationContext() );
        recy.setLayoutManager( layout );

        //melhorando a performave definindo um tamanho fixo
        recy.setHasFixedSize( true );

        //Definindo o adapter
        //recy.setAdapter();
    }
}