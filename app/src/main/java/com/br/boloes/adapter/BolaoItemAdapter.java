package com.br.boloes.adapter;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.br.boloes.BoloesFragment;
import com.br.boloes.R;
import com.br.boloes.model.Bolao;

import java.util.List;

public class BolaoItemAdapter extends BaseAdapter {
    private final List<Bolao> boloes;
    private final Fragment fragment;

    public BolaoItemAdapter(List<Bolao> boloes, BoloesFragment boloesFragment) {
        this.boloes = boloes;
        this.fragment = boloesFragment;
    }

    @Override
    public int getCount() {
        return boloes.size();
    }

    @Override
    public Object getItem(int i) {
        return boloes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = fragment.getLayoutInflater().inflate(R.layout.item_lista_boloes, viewGroup, false);
        return v;
    }
}
