package oop.abstraction.shapeAbstraction;
import java.util.Collections;

public class Circle extends  AbstractShape {
    private  double radius;
    public  Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    // реализация метода площадь
    @Override
     public double calculateArea() {
        return  Math.PI * radius * radius;
    }

    // реализация метода
    @Override
    public double calculatePerimeter () {
        return  2 * Math.PI * radius;
    }

    // реализация метода
    public  void displayInfo () {
        System.out.println("Информация о круге");
        super.displayInfo();
    }

}
