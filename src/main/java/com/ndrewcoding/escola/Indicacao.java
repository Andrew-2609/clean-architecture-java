package com.ndrewcoding.escola;

import com.ndrewcoding.escola.aluno.Aluno;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public class Indicacao {

    private final Aluno indicante;
    private final Aluno indicado;
    private final LocalDateTime dataIndicacao;

    public Indicacao(Aluno indicante, Aluno indicado) {
        this.indicante = indicante;
        this.indicado = indicado;
        this.dataIndicacao = now();
    }

    public Aluno getIndicante() {
        return indicante;
    }

    public Aluno getIndicado() {
        return indicado;
    }

    public LocalDateTime getDataIndicacao() {
        return dataIndicacao;
    }

}
