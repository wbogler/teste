package com.aula.testesautomatizados.service;

public class CalculadoraService {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return (double) a / b;
    }

    public int media(int a, int b, int c, int d, int e, int f, int g, int h) {
        return (a + b + c + d + e + f + g + h) / 8;
    }
}
