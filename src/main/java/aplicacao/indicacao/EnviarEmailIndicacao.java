package aplicacao.indicacao;

import com.ndrewcoding.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);

}
