package escola;

// VALUE OBJECT
public class CPF {

    private final String numero;

    public CPF(String numero) {
        String cpfRegex = "([0-9]{2}[.]?[0-9]{3}[.]?[0-9]{3}[/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[.]?[0-9]{3}[.]?[0-9]{3}[-]?[0-9]{2})\n";
        if (numero == null || !cpfRegex.matches(cpfRegex)) {
            throw new IllegalArgumentException("CPF inválido!");
        }

        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

}
