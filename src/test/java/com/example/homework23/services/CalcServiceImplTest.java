package com.example.homework23.services;

import com.example.homework23.exceptions.InfinityException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class CalcServiceImplTest {

    static CalcService calcService;
    static int a = 12;  //на всякий случай проверяю с разными типами
    static double b = -6.25;
    static int a2 = 4;
    static double b2 = 7.2;

    @BeforeAll
    private static void setUp() {
        calcService = new CalcServiceImpl();
    }

    @Test
    public void add() {
        ArrayList<Double> actual = new ArrayList<>(Arrays.asList(calcService.add(a, b), calcService.add(a2, b2)));
        ArrayList<Double> expected = new ArrayList<>(Arrays.asList(5.75, 11.2));
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    public void subtract() {
        double actual[] = new double[]{calcService.subtract(a, b), calcService.subtract(a2, b2)};  //Пробую и массивы и листы. С массивами проще, а что правильнее?
        double expected[] = new double[]{18.25, -3.2};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void multiply() {
        double actual[] = new double[]{calcService.multiply(a, b), calcService.multiply(a2, b2)};  //Пробую и массивы и листы. С массивами проще, а что правильнее?
        double expected[] = new double[]{-75, 28.8};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void divide() {
        double actual[] = new double[]{calcService.divide(a, b), calcService.divide(a2, b2)};  //Пробую и массивы и листы. С массивами проще, а что правильнее?
        double expected[] = new double[]{-1.92, 0.55555555555555555555555555555556};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void divideByZeroException() {
        Assertions.assertThrows(InfinityException.class, () -> calcService.divide(a, 0));
        Assertions.assertThrows(InfinityException.class, () -> calcService.divide(b2, 0));
    }
}
