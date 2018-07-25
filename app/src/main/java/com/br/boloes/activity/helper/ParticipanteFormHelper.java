package com.br.boloes.activity.helper;

import android.app.Activity;
import android.widget.EditText;

import com.br.boloes.R;

public class ParticipanteFormHelper {
    private final EditText editNome;
    private final EditText editTelefone;
    private final EditText editEmail;

    public ParticipanteFormHelper(Activity activity) {
        editNome = activity.findViewById(R.id.formulario_nome);
        editTelefone = activity.findViewById(R.id.formulario_telefone);
        editEmail = activity.findViewById(R.id.formulario_email);
    }
}
