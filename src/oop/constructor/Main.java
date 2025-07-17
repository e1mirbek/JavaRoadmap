package oop.constructor;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person(); // вызов конструктора
//        System.out.println(person);
//        Person person1 = new Person("Tom", 27);
//        System.out.println("Name : " + person1.name + " Возраст : " + person1.age);



        // 👉 Перегрузка конструктора позволяет создавать объекты разными способами.
//        Person person = new Person("Мария"); // Вызов 1 конструктора
//        Person person1 = new Person("Вика", 55); // Вызов 2 конструктора

        // 👉 Полезно, чтобы избежать побочных эффектов при работе с объектами.
        Person original = new Person("Олег", 25);
        Person copy = new Person(original);
        System.out.println(copy);

    }
}
