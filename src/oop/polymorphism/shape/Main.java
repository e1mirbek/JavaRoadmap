package oop.polymorphism.shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создать список фигур
        List <Shape> shapes = new ArrayList<>();

        // добавить фигур в список
        shapes.add(new Circle(5));
        shapes.add(new Restangle(4, 5));

        // Вывести площадь с помощью полиморфизма
        for (Shape shape : shapes){
            System.out.println("Площадь фигуры : " + shape.getArea());
        }

    }
}
