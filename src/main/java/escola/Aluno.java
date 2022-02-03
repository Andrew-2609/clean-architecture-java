package escola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ENTITY
public class Aluno {

    private final String cpf;
    private final String nome;
    private final Email email;
    private final List<Telefone> telefones = new ArrayList<>();

    public Aluno(String cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Email getEmail() {
        return email;
    }

    public List<Telefone> getTelefones() {
        return Collections.unmodifiableList(telefones);
    }

}
