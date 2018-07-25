package com.br.boloes.model;

import java.util.Arrays;

public class Aposta {
    private long id;
    private int[] numeros;
    private long valor;

    public Aposta(long id, int[] numeros, long valor) {
        this.id = id;
        Arrays.sort(numeros);
        this.numeros = numeros;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return id + "={" + Arrays.toString(numeros) + ", valor=" + valor + "}";
    }
}
