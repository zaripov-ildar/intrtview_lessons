package ru.gb.interview.task_3;

import java.util.List;

public class PolymorphismExample {
    public static void main(String[] args) {
        List<Shape2D> shapes = List.of(
                new Triangle(3, 4, 5),
                new Circle(3.18),
                new Rectangle(12.45));

        double area = shapes.stream()
                .mapToDouble(Shape2D::getArea)
                .sum();

        System.out.println(area);

        double perimeter = shapes.stream()
                .mapToDouble(Shape2D::getPerimeter)
                .sum();

        System.out.println(perimeter);

    }
}
