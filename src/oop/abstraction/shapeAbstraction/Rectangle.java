package oop.abstraction.shapeAbstraction;

public class Rectangle extends AbstractShape {
  private double lenght;
  private  double width;

  public Rectangle (String color, double lenght,double width) {
 super(color);
 this.lenght = lenght;
 this.width = width;
  }
}



