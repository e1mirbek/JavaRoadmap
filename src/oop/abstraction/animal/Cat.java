package oop.abstraction.animal;

public class Cat extends Animal implements interfaceSoundMaker {
    @Override // <- указываем, что переопределяем абстрактный метод
    public void makeSound() {
        System.out.println("Cat make sound : meow");
    }
}
