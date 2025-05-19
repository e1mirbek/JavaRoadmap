package oop.abstraction.animal;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.eat();
        cat.makeSound();
        cat.stopSound();
        dog.makeSound();
        dog.eat();
    }
}
