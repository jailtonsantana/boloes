package com.br.boloes.dao;

import android.content.Context;

import com.br.boloes.model.Aposta;
import com.br.boloes.model.Bolao;
import com.br.boloes.model.Loteria;
import com.br.boloes.model.Participante;

import java.util.ArrayList;
import java.util.List;

public class DbHelper {
    public DbHelper(Context context) {
    }

    public List<Participante> getParticipantes() {
        ArrayList<Participante> participantes = new ArrayList<>();
        participantes.add(new Participante(1, "Jailton", "11973965394", "jailton.santana@gmail.com"));
        participantes.add(new Participante(2, "Janaina", "11997375688", "jcamargosantana@uol.com.br"));
        return participantes;
    }

    public List<Bolao> getBoloes() {
        List<Bolao> boloes = new ArrayList<>();
        Bolao bolao = new Bolao(1, Loteria.MEGASENA,1000, 500);
        bolao.addParticipante(new Participante(1, "Jailton", "11973965394", "jailton.santana@gmail.com"));
        bolao.addParticipante(new Participante(2, "Janaina", "11997375688", "jcamargosantana@uol.com.br"));
        bolao.addAposta(new Aposta(3, new int[]{5, 8, 15, 60, 4, 31}, 350));
        boloes.add(bolao);
        bolao = new Bolao(2, Loteria.MEGASENA, 1001, 500);
        bolao.addAposta(new Aposta(1, new int[]{11, 16, 17, 28, 38, 49}, 350));
        bolao.addAposta(new Aposta(2, new int[]{7, 8, 60, 59, 34, 10}, 350));
        bolao.addParticipante(new Participante(1, "Jailton", "11973965394", "jailton.santana@gmail.com"));
        boloes.add(bolao);
        return boloes;
    }
}
