package oop.abstraction.shapeAbstraction;



public abstract class AbstractShape {
    protected String color;
     public  AbstractShape(String color) {
         this.color = color;
     }

    // Абстрактные методы - должны быть реализованы в подклассах !!!

     public abstract  double calculateArea(); // метод площадь
     public abstract  double calculatePerimeter();
     public String getColor() {
         return  color;
     }

     public void displayInfo () {
         System.out.println("Цвет фигуры : " + color);
         System.out.println("Площадь : " + calculateArea());
         System.out.println("Периметр : " + calculatePerimeter());
     }


}
