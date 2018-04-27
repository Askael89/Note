package com.example.roger.note;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private cardAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ArrayList<itemCard> lista = new ArrayList<>();
        lista.add(new itemCard(R.drawable.ic_android, "Documento android.txt", "04/03/2018"));
        lista.add(new itemCard(R.drawable.ic_android, "Nota1.txt", "14/04/2018"));
        lista.add(new itemCard(R.drawable.ic_android, "Ejemplo.txt", "20/04/2018"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new cardAdapter(lista);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new cardAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                lista.get(position);
            }
        });
    }

    public void OpenDocument(View v){
        Intent i = new Intent(this, DocumentActivity.class);
        startActivity(i);
    }
}
