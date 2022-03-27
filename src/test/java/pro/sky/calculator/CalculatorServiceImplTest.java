package pro.sky.calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.exception.ZeroDivideException;
import pro.sky.calculator.service.impl.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.calculator.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturn3WhenSum1and2() {
        assertEquals(THREE, out.addition(ONE, TWO));
    }

    @Test
    public void shouldReturn4WhenSum1and3() {
        assertEquals(FOUR, out.addition(ONE, THREE));
    }

    @Test
    public void shouldReturn1WhenSubtract3and2() {
        assertEquals(ONE, out.subtraction(THREE, TWO));
    }

    @Test
    public void shouldReturn0WhenSubtract4and4() {
        assertEquals(ZERO, out.subtraction(FOUR, FOUR));
    }

    @Test
    public void shouldReturn4WhenMultiplication2and2() {
        assertEquals(FOUR, out.multiplication(TWO, TWO));
    }

    @Test
    public void shouldReturn3WhenMultiplication3and1() {
        assertEquals(THREE, out.multiplication(THREE, ONE));
    }

    @Test
    public void shouldReturn3WhenDivision3and1() {
        assertEquals(THREE, out.division(THREE, ONE));
    }

    @Test
    public void shouldReturn2WhenDivision4and2() {
        assertEquals(TWO, out.division(FOUR, TWO));
    }

    @Test
    public void shouldThrowZeroDividerExceptionWhenDivideAnyNumAnd0() {
        assertThrows(ZeroDivideException.class, () -> out.division(THREE, ZERO));
    }
}


