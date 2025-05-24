package oop.abstraction.shapeAbstraction;
import java.util.Collections;

public class Circle extends  AbstractShape {
    private  double radius;
    public  Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void displayInfo () {
        System.out.println("Информация о круге");
        super.displayInfo();
    }



}
