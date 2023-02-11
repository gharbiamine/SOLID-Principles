package com.directi.training.ocp.example;

import java.util.List;

public class AreaCalculator {
    public void calculateArea(List<Shape> shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            if (shape.getType() == ShapeType.SQUARE) {
                area += ((Square) shape).getArea();
            } else if (shape.getType() == ShapeType.CIRCLE) {
                area += ((Circle) shape).getArea();
            }
        }
        System.out.println("total area = " + area);
    }

}
