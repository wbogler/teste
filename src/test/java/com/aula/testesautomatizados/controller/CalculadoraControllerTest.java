package com.aula.testesautomatizados.controller;

import com.aula.testesautomatizados.service.CalculadoraService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CalculadoraControllerTest {

    @Mock
    private CalculadoraService calculadoraService;

    @InjectMocks
    private CalculadoraController calculadoraController;

    @Test
    void deveRetornarResultadoDaSoma() {
        when(calculadoraService.somar(2, 3)).thenReturn(5);

        ResponseEntity<Integer> resposta = calculadoraController.somar(2, 3);

        assertEquals(HttpStatus.OK, resposta.getStatusCode());
        assertEquals(5, resposta.getBody());
        verify(calculadoraService).somar(2, 3);
    }

    @Test
    void deveRetornarResultadoDaSubtracao() {
        when(calculadoraService.subtrair(5, 3)).thenReturn(2);

        ResponseEntity<Integer> resposta = calculadoraController.subtrair(5, 3);

        assertEquals(HttpStatus.OK, resposta.getStatusCode());
        assertEquals(2, resposta.getBody());
        verify(calculadoraService).subtrair(5, 3);
    }

    @Test
    void deveRetornarResultadoDaMultiplicacao() {
        when(calculadoraService.multiplicar(4, 3)).thenReturn(12);

        ResponseEntity<Integer> resposta = calculadoraController.multiplicar(4, 3);

        assertEquals(HttpStatus.OK, resposta.getStatusCode());
        assertEquals(12, resposta.getBody());
        verify(calculadoraService).multiplicar(4, 3);
    }

    @Test
    void deveRetornarResultadoDaDivisao() {
        when(calculadoraService.dividir(10, 2)).thenReturn(5.0);

        ResponseEntity<Double> resposta = calculadoraController.dividir(10, 2);

        assertEquals(HttpStatus.OK, resposta.getStatusCode());
        assertEquals(5.0, resposta.getBody());
        verify(calculadoraService).dividir(10, 2);
    }
}
