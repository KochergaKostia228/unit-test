package org.example.ex_1;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class GeometryAreaCalculator {

    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public double calculateSquareArea(double side) {
        return side * side;
    }

    public double calculateRhombusArea(double diagonal1, double diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }
}
