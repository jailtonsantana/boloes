package com.br.boloes.activity.helper;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.br.boloes.R;

public class BolaoFormHelper {
    public BolaoFormHelper(Activity activity) {
        Spinner spinner = (Spinner) activity.findViewById(R.id.spinner_loteria);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(activity, R.array.loterias_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
