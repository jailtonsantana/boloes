package com.br.boloes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.br.boloes.activity.helper.BolaoFormHelper;

public class BolaoFormActivity extends AppCompatActivity {

    private BolaoFormHelper formHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolao_form);
        formHelper = new BolaoFormHelper(this);
    }
}
