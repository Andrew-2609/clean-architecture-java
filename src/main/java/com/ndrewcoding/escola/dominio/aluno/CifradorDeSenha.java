package com.ndrewcoding.escola.dominio.aluno;

public interface CifradorDeSenha {

    void cifrarSenha(String senha);

    boolean validarSenhaCifrada(String senha, String senhaCifrada);

}
