import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author budd8y
 * @since 05/12/21
 */
public class CalculadoraTest {

    @Test
    void deveSomarDoisNumeros() {
        Calculadora calculadora = new Calculadora();

        int a = 10;
        int b = 20;

        Assertions.assertEquals(30, calculadora.somar(a, b));
    }

}
