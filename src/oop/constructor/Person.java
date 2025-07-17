package oop.constructor;


// Конструктор — это специальный метод класса,
// который вызывается автоматически при создании объекта (экземпляра класса).

public class Person {
    String name;
    int age;


//    // Конструктор по умалчанию
//    Person () {
//        System.out.println("Создан новый обьект Person");
//    }
//
//    // Параметризованный конструктор
//    public Person(String name, int age) {
//        this.name = name; // this ссылка на текуший обьект
//        this.age = age;
//    }
//


       // Можно создавать несколько конструкторов с разными параметрами:

//    // Перегрузка конструкторов
//
//    // конструктор 1 - без возврата
//
//    Person (String name) {
//        this.name = name;
//        this.age = 0; // возраст по умолчанию
//    }
//
//    // Констуктор 2 - с именем и возрастом
//
//    Person (String name, int age) {
//        this.name = name;
//        this.age = age;
//    }


    // Конструктор копирование

    // Иногда нужно создать копию обьекта

    // Обычный конструктор

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Конструктор копирование

    // 👉 Полезно, чтобы избежать побочных эффектов при работе с объектами.

    Person (Person other){
        this.name = other.name;
        this.age = other.age;
    }
}



