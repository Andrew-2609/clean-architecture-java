package escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefoneTest {

    @Test
    void deveriaCriarTelefoneComDDDENumeroValidos() {
        assertDoesNotThrow(() -> new Telefone("85", "91234-5678"));
    }

    @Test
    void naoDeveriaCriarTelefonesComDDDOuNumeroInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("85", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", "91234-5678"));
    }

}
