package com.example.marci.listadeusuarios_actividad5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> userNames = new ArrayList<>();
        userNames.add("Marcial Fernando Tellez Hernandez Edad: 20");
        userNames.add("Jorge Carranza Solis Huerta Edad: 20");
        userNames.add("Matias Marin Settecase Edad: 20");

        RecyclerView recyclerView = findViewById(R.id.recyclerUsuarios);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, userNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Hiciste click aqui" + adapter.getItem(position) + "en la fila" + position, Toast.LENGTH_SHORT).show();
    }
}
