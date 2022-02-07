package infra.aluno;

import com.ndrewcoding.escola.dominio.aluno.Aluno;
import com.ndrewcoding.escola.dominio.aluno.CPF;
import com.ndrewcoding.escola.dominio.aluno.RepositorioDeAlunos;

import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

    @Override
    public void matricular(Aluno aluno) {

    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return null;
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return null;
    }

}
