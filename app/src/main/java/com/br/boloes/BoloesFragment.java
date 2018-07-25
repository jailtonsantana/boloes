package com.br.boloes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.br.boloes.adapter.BolaoItemAdapter;
import com.br.boloes.dao.DbHelper;
import com.br.boloes.model.Bolao;

import java.util.List;


/**
 *
 */
public class BoloesFragment extends Fragment implements View.OnClickListener {
    private ListView listBoloes;
    private DbHelper dbHelper;

    public BoloesFragment() {
        // Required empty public constructor
    }

    /**
     *
     * @return
     */
    public static Fragment newInstance() {
        BoloesFragment fragment = new BoloesFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_boloes, container, false);
        listBoloes = (ListView) view.findViewById(R.id.listBoloes);
        Button btnAdicionar = (Button) view.findViewById(R.id.buttonAdicionaBolao);
        btnAdicionar.setOnClickListener(this);
        dbHelper = new DbHelper(view.getContext());
        List<Bolao> boloes = dbHelper.getBoloes();
        ArrayAdapter<Bolao> adapter = new ArrayAdapter<Bolao>(view.getContext(), android.R.layout.simple_list_item_1, boloes);
        adapter2 = new BolaoItemAdapter(boloes, this);
        listBoloes.setAdapter(adapter2);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonAdicionaBolao:
                break;
        }
    }
}
