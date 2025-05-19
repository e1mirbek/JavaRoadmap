package oop.abstraction.animal;

interface interfaceSoundMaker {
    void makeSound(); // абстрактный метод

    // default-методы (с реализацией)
    default void stopSound() {  // default-метод
        System.out.println("Звук прекратился");
    }
}
