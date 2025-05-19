package oop.abstraction.animal;

public class Dog extends Animal {
    @Override // <- указываем, что переопределяем абстрактный метод
    public void makeSound() {
        System.out.println("Dog make sound : Bark");
    }
}
