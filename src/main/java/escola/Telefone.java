package escola;

// VALUE OBJECT
public class Telefone {

    private final String ddd;
    private final String numero;

    public Telefone(String ddd, String numero) {
        String dddRegex = "^[1-9]{2}$";
        String numeroRegex = "^(?:[2-8]|9[1-9])[0-9]{3}-[0-9]{4}$";

        if (ddd == null || numero == null || !ddd.matches(dddRegex) || !numero.matches(numeroRegex)) {
            throw new IllegalArgumentException("Telefone inválido!");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getTelefone() {
        return "(".concat(ddd).concat(")").concat(" ").concat(numero);
    }

}
