package ru.gb.interview.task_3;

public class Rectangle implements Shape2D {

    private double side;

    public Rectangle(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

}
