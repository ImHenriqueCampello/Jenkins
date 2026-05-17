import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OperacoesAvancadasTest {

    // =========================
    // TESTES DE MULTIPLICAÇÃO
    // =========================

    @Test
    public void testeMultiplicacaoPositivos() {

        OperacoesAvancadas avancada = new OperacoesAvancadas();

        double resultado = avancada.multiplicar(4, 5);

        assertEquals(20, resultado);
    }

    @Test
    public void testeMultiplicacaoNegativo() {

        OperacoesAvancadas avancada = new OperacoesAvancadas();

        double resultado = avancada.multiplicar(-4, 5);

        assertEquals(-20, resultado);
    }

    @Test
    public void testeMultiplicacaoZero() {

        OperacoesAvancadas avancada = new OperacoesAvancadas();

        double resultado = avancada.multiplicar(10, 0);

        assertEquals(0, resultado);
    }

    @Test
    public void testeMultiplicacaoDecimal() {

        OperacoesAvancadas avancada = new OperacoesAvancadas();

        double resultado = avancada.multiplicar(2.5, 2);

        assertEquals(5, resultado);
    }

    // ====================
    // TESTES DE DIVISÃO
    // ====================

    @Test
    public void testeDivisaoPositivos() {

        OperacoesAvancadas avancada = new OperacoesAvancadas();

        double resultado = avancada.dividir(10, 2);

        assertEquals(5, resultado);
    }

    @Test
    public void testeDivisaoDecimal() {

        OperacoesAvancadas avancada = new OperacoesAvancadas();

        double resultado = avancada.dividir(5, 2);

        assertEquals(2.5, resultado);
    }

    @Test
    public void testeDivisaoNegativo() {

        OperacoesAvancadas avancada = new OperacoesAvancadas();

        double resultado = avancada.dividir(-10, 2);

        assertEquals(-5, resultado);
    }

    @Test
    public void testeDivisaoPorZero() {

        OperacoesAvancadas avancada = new OperacoesAvancadas();

        double resultado = avancada.dividir(10, 0);

        assertEquals(0, resultado);
    }
}