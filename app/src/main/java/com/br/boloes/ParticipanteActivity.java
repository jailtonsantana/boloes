package com.br.boloes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.br.boloes.activity.helper.ParticipanteFormHelper;

public class ParticipanteActivity extends AppCompatActivity {

    private ParticipanteFormHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participante_form);
        helper = new ParticipanteFormHelper(this);
    }


}
