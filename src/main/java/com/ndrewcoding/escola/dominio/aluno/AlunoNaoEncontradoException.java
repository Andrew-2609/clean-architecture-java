package com.ndrewcoding.escola.dominio.aluno;

public class AlunoNaoEncontradoException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AlunoNaoEncontradoException(CPF cpf) {
        super("Aluno não encontrado com o CPF: " + cpf.getNumero());
    }

}
