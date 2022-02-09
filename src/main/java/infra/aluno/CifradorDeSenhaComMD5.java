package infra.aluno;

import com.ndrewcoding.escola.dominio.aluno.CifradorDeSenha;

public class CifradorDeSenhaComMD5 implements CifradorDeSenha {

    @Override
    public void cifrarSenha(String senha) {

    }

    @Override
    public boolean validarSenhaCifrada(String senha, String senhaCifrada) {
        return false;
    }

}
