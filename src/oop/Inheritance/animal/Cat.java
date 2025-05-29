package oop.Inheritance.animal;

public class Cat extends  Animal{

    Cat (String name) {
        super(name);
        System.out.println("Cat constructor");
    }
    void meow() {
        System.out.println("Meow !!! ");
    }
}
