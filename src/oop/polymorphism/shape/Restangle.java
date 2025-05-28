package oop.polymorphism.shape;

public class Restangle implements  Shape{
    private  double width;
    private  double height;
     Restangle (double width, double height) {
         this.width = width;
         this.height = height;
     }


     @Override
    public double getArea () {
         return  Math.PI * width * height;
     }
}
