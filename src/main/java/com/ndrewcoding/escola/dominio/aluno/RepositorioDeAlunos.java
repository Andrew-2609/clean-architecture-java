package com.ndrewcoding.escola.dominio.aluno;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(Aluno aluno);

    Aluno buscarPorCpf(Aluno aluno);

    List<Aluno> listarTodosAlunosMatriculados();

}
