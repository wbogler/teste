package com.aula.testesautomatizados.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraServiceTest {

    private final CalculadoraService calculadoraService = new CalculadoraService();

    @Test
    void deveDividirDoisNumeros() {
        double resultado = calculadoraService.dividir(10, 2);

        assertEquals(5.0, resultado);
    }
}
