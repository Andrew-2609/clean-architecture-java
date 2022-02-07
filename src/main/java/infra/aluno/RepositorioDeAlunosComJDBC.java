package infra.aluno;

import com.ndrewcoding.escola.dominio.aluno.Aluno;
import com.ndrewcoding.escola.dominio.aluno.RepositorioDeAlunos;

import java.sql.Connection;
import java.util.List;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

    private final Connection connection;

    public RepositorioDeAlunosComJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {

    }

    @Override
    public Aluno buscarPorCpf(Aluno aluno) {
        return null;
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return null;
    }

}
