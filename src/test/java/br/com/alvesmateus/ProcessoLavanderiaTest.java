package br.com.alvesmateus;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProcessoLavanderiaTest {
    @Test
    public void deveExecutarFluxoCompletoParaLavagemDelicada() {
        ProcessoLavanderia lavagemDelicada = new LavagemDelicada();

        List<String> resultado = lavagemDelicada.processarPedido();

        assertNotNull(resultado, "A lista de processamento não deve ser nula");
        assertEquals(5, resultado.size(), "O processo deve conter exatamente 5 etapas");

        assertEquals("1. Roupas recebidas, pesadas e triadas.", resultado.get(0));
        assertEquals("4. Roupas passadas, dobradas e embaladas.", resultado.get(3));
        assertEquals("5. Roupas entregues ao cliente.", resultado.get(4));

        assertEquals("2. Lavando em modo suave com água fria e sabão neutro.", resultado.get(1));
        assertEquals("3. Secando à sombra, sem uso de secadora térmica.", resultado.get(2));
    }

    @Test
    public void deveExecutarFluxoCompletoParaLavagemPesada() {
        ProcessoLavanderia lavagemPesada = new LavagemPesada();

        List<String> resultado = lavagemPesada.processarPedido();

        assertNotNull(resultado, "A lista de processamento não deve ser nula");
        assertEquals(5, resultado.size(), "O processo deve conter exatamente 5 etapas");

        assertEquals("1. Roupas recebidas, pesadas e triadas.", resultado.get(0));
        assertEquals("4. Roupas passadas, dobradas e embaladas.", resultado.get(3));
        assertEquals("5. Roupas entregues ao cliente.", resultado.get(4));

        assertEquals("2. Lavando em modo intensivo com água quente e tira-manchas.", resultado.get(1));
        assertEquals("3. Secando na secadora industrial em alta temperatura.", resultado.get(2));
    }
}
