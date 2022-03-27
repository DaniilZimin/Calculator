package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.service.impl.CalculatorServiceImpl;

import java.util.stream.Stream;

import static pro.sky.calculator.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplParameterTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSummation(int a, int b) {
        Assertions.assertEquals(a + b, out.addition(a, b));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSubtraction(int a, int b) {
        Assertions.assertEquals(a - b, out.subtraction(a, b));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfMultiplication(int a, int b) {
        Assertions.assertEquals(a * b, out.multiplication(a, b));
    }

    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfDivision(int a, int b) {
        Assertions.assertEquals(a / b, out.division(a, b));
    }

    private static Stream<Arguments> provideArgumentsForCalculatorTests() {
        return Stream.of(
                Arguments.of(ZERO, ONE),
                Arguments.of(ZERO, TWO),
                Arguments.of(ONE, ONE),
                Arguments.of(ONE, TWO),
                Arguments.of(FOUR, ONE),
                Arguments.of(TWO, TWO)
        );
    }
}
