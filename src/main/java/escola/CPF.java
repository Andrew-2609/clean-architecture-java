package escola;

// VALUE OBJECT
public class CPF {

    private final String numero;

    public CPF(String numero) {
        String cpfRegex = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$";
        if (numero == null || !cpfRegex.matches(cpfRegex)) {
            throw new IllegalArgumentException("CPF inválido!");
        }

        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

}
