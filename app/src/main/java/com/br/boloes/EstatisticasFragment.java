package com.br.boloes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 *
 */
public class EstatisticasFragment extends Fragment {

    public EstatisticasFragment() {
        // Required empty public constructor
    }

    /**
     *
     * @return
     */
    public static EstatisticasFragment newInstance() {
        EstatisticasFragment fragment = new EstatisticasFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_estatisticas, container, false);
        return view;
    }
}
