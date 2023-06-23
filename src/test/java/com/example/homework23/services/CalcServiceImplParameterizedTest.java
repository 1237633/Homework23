package com.example.homework23.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class CalcServiceImplParameterizedTest {

    static CalcService out = new CalcServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParams")
    public void add(double a, double b) {
        double actual = out.add(a, b);
        Assertions.assertEquals(a + b, actual);  //Если я правильно понял, наша задача проверить, не изменилась ли логика поведения метода. И если логика поведения - это сложение двух чисел, то для уменшьения трудозатрат можно и сравнивать не с результатом вычислений, а с изначальной логикой?
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    public void subtract(double a, double b) {
        double actual = out.subtract(a, b);
        Assertions.assertEquals(a - b, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    public void multiply(double a, double b) {
        double actual = out.multiply(a, b);
        Assertions.assertEquals(a * b, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    public void divide(double a, double b) {
        double actual = out.divide(a, b);
        Assertions.assertEquals(a / b, actual);
    }

    public static Stream<Arguments> provideParams() {
        //return Stream.of(Arguments.of(4, 5, 9));
        return Stream.of(Arguments.of(12.7, 6),
                Arguments.of(8, -12),
                Arguments.of(4.3, 5.3),
                Arguments.of(228, 1488),
                Arguments.of(-500, 6231),
                Arguments.of(0.55555555, 68));

    }
}