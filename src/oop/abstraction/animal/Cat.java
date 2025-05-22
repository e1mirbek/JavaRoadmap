package oop.abstraction.animal;

// Интерфейс — это контракт, который определяет, что класс должен реализовать, но не содержит реализации

public class Cat extends Animal implements interfaceSoundMaker {
    @Override // <- указываем, что переопределяем абстрактный метод
    public void makeSound() {
        System.out.println("Cat make sound : meow");
    }
}
