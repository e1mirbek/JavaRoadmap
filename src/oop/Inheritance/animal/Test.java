package oop.Inheritance.animal;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy"); // наследованный метод
        dog.makeSound(); // метод самого класса Dog

        Cat cat = new Cat("Putty");
        cat.makeSound();
    }
}
