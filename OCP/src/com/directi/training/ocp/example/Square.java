package com.directi.training.ocp.example;

public class Square extends Shape {
    private final double _side;

    public Square(double side) {
        _shapeType = ShapeType.SQUARE;
        _side = side;
    }

    public double getSide() {
        return _side;
    }

    public double getArea() {
        return this.getSide() * this.getSide();
    }
}
