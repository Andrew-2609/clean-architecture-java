package com.ndrewcoding.escola.aplicacao.aluno.matricular;

import com.ndrewcoding.escola.dominio.aluno.Aluno;
import com.ndrewcoding.escola.dominio.aluno.CPF;
import com.ndrewcoding.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorioDeAlunos;

    public MatricularAluno(RepositorioDeAlunos repositorioDeAlunos) {
        this.repositorioDeAlunos = repositorioDeAlunos;
    }

    public void executar(MatricularAlunoDTO matricularAlunoDTO) {
        Aluno novoAluno = matricularAlunoDTO.criarAluno();
        repositorioDeAlunos.matricular(novoAluno);
    }

    public MatricularAlunoDTO buscarPorCPF(CPF cpf) {
        Aluno aluno = repositorioDeAlunos.buscarPorCPF(cpf);
        return new MatricularAlunoDTO(aluno);
    }

}
