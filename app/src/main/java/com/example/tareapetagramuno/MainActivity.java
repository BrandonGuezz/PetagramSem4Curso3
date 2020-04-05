package com.example.tareapetagramuno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasMain);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

    }// llave final princiapl main

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<>();

        mascotas.add(new Mascotas("Luna","5",R.drawable.perrouno));
        mascotas.add(new Mascotas("Max","3",R.drawable.perrodos));
        mascotas.add(new Mascotas("Misifus","6",R.drawable.pez));
        mascotas.add(new Mascotas("Morita","9",R.drawable.pugsito));
        mascotas.add(new Mascotas("Franklin","4",R.drawable.tortu));
        mascotas.add(new Mascotas("Limon","7",R.drawable.loro));

    }
}
