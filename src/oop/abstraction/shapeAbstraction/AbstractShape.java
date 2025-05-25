package oop.abstraction.shapeAbstraction;



public abstract class AbstractShape {
    protected String color;
     public  AbstractShape(String color) {
         this.color = color;
     }

     // Методы
     public abstract  double calculateArea();
     public abstract  double calculatePerimeter();
     public String getColor() {
         return  color;
     }


     // Информация
     public void displayInfo () {
         System.out.println("Цвет фигуры : " + color);
         System.out.println("Площадь : " + calculateArea());
         System.out.println("Периметр : " + calculatePerimeter());
     }
}
