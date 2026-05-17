import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OperacoesBasicasTest {

    // =================
    // TESTES DE SOMA
    // =================

    @Test
    public void testeSomaPositivos() {

        OperacoesBasicas basica = new OperacoesBasicas();

        double resultado = basica.somar(10, 5);

        assertEquals(15, resultado);
    }

    @Test
    public void testeSomaNegativos() {

        OperacoesBasicas basica = new OperacoesBasicas();

        double resultado = basica.somar(-10, -5);

        assertEquals(-15, resultado);
    }

    @Test
    public void testeSomaComZero() {

        OperacoesBasicas basica = new OperacoesBasicas();

        double resultado = basica.somar(10, 0);

        assertEquals(10, resultado);
    }

    @Test
    public void testeSomaDecimal() {

        OperacoesBasicas basica = new OperacoesBasicas();

        double resultado = basica.somar(2.5, 1.5);

        assertEquals(4, resultado);
    }

    // ======================
    // TESTES DE SUBTRAÇÃO
    // ======================

    @Test
    public void testeSubtracaoPositivos() {

        OperacoesBasicas basica = new OperacoesBasicas();

        double resultado = basica.subtrair(10, 5);

        assertEquals(5, resultado);
    }

    @Test
    public void testeSubtracaoNegativos() {

        OperacoesBasicas basica = new OperacoesBasicas();

        double resultado = basica.subtrair(-10, -5);

        assertEquals(-5, resultado);
    }

    @Test
    public void testeSubtracaoComZero() {

        OperacoesBasicas basica = new OperacoesBasicas();

        double resultado = basica.subtrair(10, 0);

        assertEquals(10, resultado);
    }

    @Test
    public void testeSubtracaoDecimal() {

        OperacoesBasicas basica = new OperacoesBasicas();

        double resultado = basica.subtrair(5.5, 2.5);

        assertEquals(3, resultado);
    }
}