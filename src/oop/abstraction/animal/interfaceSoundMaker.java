package oop.abstraction.animal;

interface interfaceSoundMaker {
    void makeSound();

    // default-методы (с реализацией)
    default void stopSound() {
        System.out.println("Звук прекратился");
    }
}
