package oop.Inheritance.animal;

public class Dog extends  Animal{

    Dog (String name) {
        super(name); // вызов конструктора супер класса
        System.out.println("Dog constructor");
    }

    void bark() {
        System.out.println("Dog bark");
    }
}
