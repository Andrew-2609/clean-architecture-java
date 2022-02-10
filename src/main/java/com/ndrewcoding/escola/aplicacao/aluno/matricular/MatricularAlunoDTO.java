package com.ndrewcoding.escola.aplicacao.aluno.matricular;

public class MatricularAlunoDTO {

    private final String nomeAluno;
    private final String cpfAluno;
    private final String emailAluno;

    public MatricularAlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

}
