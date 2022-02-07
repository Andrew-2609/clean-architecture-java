package infra.aluno;

import com.ndrewcoding.escola.dominio.aluno.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

    private final Connection connection;

    public RepositorioDeAlunosComJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {
        String sql = "INSERT INTO alunos VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, aluno.getCpf());
            preparedStatement.setString(2, aluno.getNome());
            preparedStatement.setString(3, aluno.getEmail());
            preparedStatement.execute();

            sql = "INSERT INTO telefones VALUES (?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            for (Telefone telefone : aluno.getTelefones()) {
                preparedStatement.setString(1, telefone.getDdd());
                preparedStatement.setString(2, telefone.getNumero());
                preparedStatement.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        String sql = "SELECT id, nome, email FROM alunos WHERE cpf = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cpf.getNumero());
            ResultSet resultSet = preparedStatement.executeQuery();

            boolean encontrouAluno = resultSet.next();
            if (!encontrouAluno) {
                throw new AlunoNaoEncontradoPorCPFException(cpf);
            }

            String nome = resultSet.getString("nome");
            Email email = new Email(resultSet.getString("email"));
            Long id = resultSet.getLong("id");

            Aluno alunoEncontrado = new Aluno(cpf, nome, email);

            sql = "SELECT ddd, numero FROM telefones WHERE aluno_id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String ddd = resultSet.getString("ddd");
                String numero = resultSet.getString("numero");
                alunoEncontrado.adicionarTelefone(ddd, numero);
            }

            return alunoEncontrado;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return null;
    }

}
