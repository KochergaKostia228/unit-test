package org.example.ex_1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GeometryAreaCalculatorTest {

    static GeometryAreaCalculator calculator = new GeometryAreaCalculator();

    @BeforeAll
    static void initCalculate() {

        calculator = new GeometryAreaCalculator();
        System.out.println("Before All called");
    }

    @Test
    void area_CalculateTriangleArea_WhenCalled() {
        double base = 5.0;
        double height = 4.0;
        double expected = 10.0;
        assertEquals(expected, calculator.calculateTriangleArea(base, height), "123");
    }

    @Test
    void area_CalculateRectangleArea_WhenCalled() {
        double length = 5.0;
        double width = 4.0;
        double expected = 20.0;
        assertEquals(expected, calculator.calculateRectangleArea(length, width), "123");
    }

    @Test
    void area_CalculateSquareArea_WhenCalled() {
        double side = 5.0;
        double expected = 25.0;
        assertEquals(expected, calculator.calculateSquareArea(side), "123");
    }

    @Test
    void area_CalculateRhombusArea_WhenCalled() {
        double diagonal1 = 5.0;
        double diagonal2 = 4.0;
        double expected = 10.0;
        assertEquals(expected, calculator.calculateRhombusArea(diagonal1, diagonal2), "123");
    }
}