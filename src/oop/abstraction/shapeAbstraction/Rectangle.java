package oop.abstraction.shapeAbstraction;

public class Rectangle extends AbstractShape {
  private double lenght;
  private  double width;
  public Rectangle (String color, double lenght,double width) {
 super(color);
 this.lenght = lenght;
 this.width = width;
  }


  @Override
    public double calculateArea() {
     return lenght * width;
    }

    @Override
    public double calculatePerimeter() {
     return 2 * (lenght + width);
    }

    @Override
    public void  displayInfo () {
        System.out.println("Информация о прямоугольнике: ");
        super.displayInfo();
    }
}



