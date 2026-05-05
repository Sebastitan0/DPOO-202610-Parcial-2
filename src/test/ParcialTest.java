package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

class ParcialTest {

    private Parcial parcial;

    @BeforeEach
    void setUp() {
        parcial = new Parcial();
    }

    @Test
    void testPotenciaNormal() throws Exception {
        int resultado = parcial.potencia(2, 3);
        assertEquals(8, resultado);
    }

    @Test
    void testExponenteCero() throws Exception {
        int resultado = parcial.potencia(5, 0);
        assertEquals(1, resultado);
    }

    @Test
    void testBaseCero() throws Exception {
        int resultado = parcial.potencia(0, 5);
        assertEquals(0, resultado);
    }

    @Test
    void testExponenteNegativo() {
        assertThrows(Exception.class, () -> parcial.potencia(2, -3));
    }

    @Test
    void testCeroElevadoACero() {
        assertThrows(Exception.class, () -> parcial.potencia(0, 0));
    }

    @Test
    void testResultadoGrande() {
        assertThrows(Exception.class, () -> parcial.potencia(32294184, 21421412));
    }
}