package oop.abstraction.shapeAbstraction;

public class Triangle extends AbstractShape {
    private double side1;
    private double side2;
    private double side3;

   public   Triangle (String color, double side1, double side2, double side3) {
       super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }



    public double calculateArea () {
        double s = (side1 + side2 + side3) / 2;
        return Math.scalb(s * (s - side1) * (s - side2) * (s - side3), 0);
    }

    public  double calculatePerimeter () {
        return side1 + side2 + side3;
    }

    public void diasplayInfo () {
        System.out.println("Информация о триугольгнике");
        super.displayInfo();
    }
}
