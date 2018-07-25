package com.br.boloes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selected = null;
                switch (item.getItemId()) {
                    case R.id.action_boloes:
                        selected = BoloesFragment.newInstance();
                        break;
                    case R.id.action_participantes:
                        selected = ParticipantesFragment.newInstance();
                        break;
                    case R.id.action_resultados:
                        selected =  ResultadosFragment.newInstance();
                        break;
                    case R.id.action_estatisticas:
                        selected = EstatisticasFragment.newInstance();
                        break;
                }
                if (selected != null) {
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame_layout, selected);
                    transaction.commit();
                }
                return true;
            }
        });
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, BoloesFragment.newInstance());
        transaction.commit();
    }

    @Override
    public void onClick(View view) {

    }
}
