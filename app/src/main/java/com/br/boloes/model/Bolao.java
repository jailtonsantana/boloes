package com.br.boloes.model;

import java.util.ArrayList;

public class Bolao {
    private final ArrayList<Participante> participantes;
    private final ArrayList<Aposta> apostas;
    private int id;
    private int loteria;
    private int concurso;
    private long valor;
    private int status;

    public Bolao(int id, int loteria, int concurso, long valor) {
        this.id = id;
        this.loteria = loteria;
        this.concurso = concurso;
        this.valor = valor;
        participantes = new ArrayList<Participante>();
        apostas = new ArrayList<>();
    }

    public void addParticipante(Participante participante) {
        participantes.add(participante);
    }

    public void addAposta(Aposta aposta) {
        apostas.add(aposta);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(id).append(" -> ");
        sb.append(loteria).append("\nConcurso=");
        sb.append(concurso).append("\nParticipantes=");
        sb.append(participantes).append("\nApostas=");
        sb.append(apostas);
        return sb.toString();
    }
}
