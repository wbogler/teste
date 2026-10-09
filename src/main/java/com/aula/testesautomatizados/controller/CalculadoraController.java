package com.aula.testesautomatizados.controller;

import com.aula.testesautomatizados.service.CalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculadora")
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @GetMapping("somar/{numerox}/{numeroy}")
    public ResponseEntity<Integer> somar(@PathVariable Integer numerox, @PathVariable Integer numeroy) {
        return ResponseEntity.ok(calculadoraService.somar(numerox, numeroy));
    }

    @GetMapping("subtrair/{numerox}/{numeroy}")
    public ResponseEntity<Integer> subtrair(@PathVariable Integer numerox, @PathVariable Integer numeroy) {
        return ResponseEntity.ok(calculadoraService.subtrair(numerox, numeroy));
    }

    @GetMapping("multiplicar/{numerox}/{numeroy}")
    public ResponseEntity<Integer> multiplicar(@PathVariable Integer numerox, @PathVariable Integer numeroy) {
        return ResponseEntity.ok(calculadoraService.multiplicar(numerox, numeroy));
    }

    @GetMapping("dividir/{numerox}/{numeroy}")
    public ResponseEntity<Double> dividir(@PathVariable Integer numerox, @PathVariable Integer numeroy) {
        return ResponseEntity.ok(calculadoraService.dividir(numerox, numeroy));
    }
}
