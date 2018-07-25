package com.br.boloes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.br.boloes.dao.DbHelper;
import com.br.boloes.model.Participante;

import java.util.List;

public class ParticipantesActivity extends AppCompatActivity {

    private DbHelper dbHelper;
    private ListView listaParticipantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participantes);
        dbHelper = new DbHelper(this);
        listaParticipantes = (ListView) findViewById(R.id.listParticipantes);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_adicionar);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent intent = new Intent(ParticipantesActivity.this, ParticipanteActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<Participante> participantes = dbHelper.getParticipantes();
        ArrayAdapter<Participante> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, participantes);
        listaParticipantes.setAdapter(adapter);
    }
}
