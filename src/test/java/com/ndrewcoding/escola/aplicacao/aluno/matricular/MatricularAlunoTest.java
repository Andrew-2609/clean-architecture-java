package com.ndrewcoding.escola.aplicacao.aluno.matricular;

import com.ndrewcoding.escola.dominio.aluno.Aluno;
import com.ndrewcoding.escola.dominio.aluno.CPF;
import com.ndrewcoding.escola.dominio.aluno.RepositorioDeAlunos;
import com.ndrewcoding.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlunos repositorioDeAlunos = new RepositorioDeAlunosEmMemoria();

        MatricularAluno useCase = new MatricularAluno(repositorioDeAlunos);

        MatricularAlunoDTO dto = new MatricularAlunoDTO("123.456.789-00", "Andrew Monteiro", "andrew@email.com");

        useCase.executar(dto);

        Aluno alunoEncontrado = repositorioDeAlunos.buscarPorCPF(new CPF("123.456.789-00"));

        assertNotNull(alunoEncontrado);
        assertEquals("Andrew Monteiro", alunoEncontrado.getNome());
        assertEquals("andrew@email.com", alunoEncontrado.getEmail());
    }

}
