package com.br.boloes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.br.boloes.dao.DbHelper;
import com.br.boloes.model.Bolao;

import java.util.List;

public class BoloesActivity extends AppCompatActivity implements View.OnClickListener {

    private DbHelper dbHelper;
    private ListView listBoloes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boloes);
        dbHelper = new DbHelper(this);
        listBoloes = (ListView) findViewById(R.id.listBoloes);
        Button btnAdicionar = (Button) findViewById(R.id.buttonAdicionaBolao);
        btnAdicionar.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<Bolao> boloes = dbHelper.getBoloes();
        ArrayAdapter<Bolao> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, boloes);
        listBoloes.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonAdicionaBolao:
                Intent intent = new Intent(BoloesActivity.this, BolaoFormActivity.class);
                startActivity(intent);
                break;
        }
    }
}
