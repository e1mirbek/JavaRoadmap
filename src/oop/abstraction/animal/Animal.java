package oop.abstraction.animal;

public abstract class Animal {
    public void eat(){
        System.out.println("Animal eat");
    }
    public  abstract  void makeSound(); // <- абстрактный метод
}
