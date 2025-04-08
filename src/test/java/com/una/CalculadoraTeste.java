package com.una;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {

    Calculadora calc = new Calculadora();

    @Test
    void testSomar() {
        assertEquals(8, calc.somar(5, 3));
    }

    @Test
    void testSubtrair() {
        assertEquals(2, calc.subtrair(5, 3));
    }

    @Test
    void testMultiplicar() {
        assertEquals(15, calc.multiplicar(5, 3));
    }

    @Test
    void testDividir() {
        assertEquals(5.0/3, calc.dividir(5, 3));
    }

    @Test
    void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }

    @Test
    void testPotenciar() {
        assertEquals(8, calc.potenciar(2, 3));
    }
}
