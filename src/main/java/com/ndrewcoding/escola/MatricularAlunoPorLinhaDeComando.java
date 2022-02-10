package com.ndrewcoding.escola;

import com.ndrewcoding.escola.dominio.aluno.Aluno;
import com.ndrewcoding.escola.dominio.aluno.CPF;
import com.ndrewcoding.escola.dominio.aluno.Email;
import com.ndrewcoding.escola.dominio.aluno.RepositorioDeAlunos;
import com.ndrewcoding.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
    public static void main(String[] args) {

        CPF cpf = new CPF("123.456.789-00");
        String nome = "Andrew Monteiro";
        Email email = new Email("andrew@email.com");

        Aluno aluno = new Aluno(cpf, nome, email);
        aluno.adicionarTelefone("85", "93345-2440");

        RepositorioDeAlunos repositorioDeAlunos = new RepositorioDeAlunosEmMemoria();
        repositorioDeAlunos.matricular(aluno);

        System.out.println(repositorioDeAlunos.listarTodosAlunosMatriculados());

    }
}
