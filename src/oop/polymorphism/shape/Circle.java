package oop.polymorphism.shape;

public class Circle implements Shape{
    private double radius;

    Circle (double radius) {
        this.radius = radius;
    }

   @Override
    public  double getArea () {
        return  Math.PI * radius * radius;
   }
}
