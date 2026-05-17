import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OperacoesExtrasTest {

    // =====================
    // TESTES DE POTÊNCIA
    // =====================

    @Test
    public void testePotenciaPositiva() {

        OperacoesExtras extras = new OperacoesExtras();

        double resultado = extras.potencia(2, 3);

        assertEquals(8, resultado);
    }

    @Test
    public void testePotenciaComZero() {

        OperacoesExtras extras = new OperacoesExtras();

        double resultado = extras.potencia(5, 0);

        assertEquals(1, resultado);
    }

    @Test
    public void testePotenciaNegativa() {

        OperacoesExtras extras = new OperacoesExtras();

        double resultado = extras.potencia(-2, 2);

        assertEquals(4, resultado);
    }

    @Test
    public void testePotenciaDecimal() {

        OperacoesExtras extras = new OperacoesExtras();

        double resultado = extras.potencia(2.5, 2);

        assertEquals(6.25, resultado);
    }

    // ==========================
    // TESTES DE RAIZ QUADRADA
    // ==========================

    @Test
    public void testeRaizQuadradaPositiva() {

        OperacoesExtras extras = new OperacoesExtras();

        double resultado = extras.raizQuadrada(25);

        assertEquals(5, resultado);
    }

    @Test
    public void testeRaizQuadradaZero() {

        OperacoesExtras extras = new OperacoesExtras();

        double resultado = extras.raizQuadrada(0);

        assertEquals(0, resultado);
    }

    @Test
    public void testeRaizQuadradaDecimal() {

        OperacoesExtras extras = new OperacoesExtras();

        double resultado = extras.raizQuadrada(2.25);

        assertEquals(1.5, resultado);
    }

    @Test
    public void testeRaizQuadradaNegativa() {

        OperacoesExtras extras = new OperacoesExtras();

        double resultado = extras.raizQuadrada(-9);

        assertEquals(0, resultado);
    }
}