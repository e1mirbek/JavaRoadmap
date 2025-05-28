package oop.polymorphism.animal;


// Полиморфизм времени выполнения (Runtime Polymorphism)
public class Test {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // родителский класс
        Animal myDog = new Dog(); // ссылка Animal - обьект Dog
        Animal myCat = new Cat(); // ссылка Animal - обьект Cat

        myAnimal.makeSound();
        myDog.makeSound(); // полиморфизм !!!
        myCat.makeSound(); // полиморфизм !!!
    }
}

// Как это работает ?
// Компилятор не знает какой метод makeSound будет вызван -
// это определяется в рантайме (динамическое связывание)
