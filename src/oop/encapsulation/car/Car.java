package oop.encapsulation.car;

public class Car {

    // поля (переменные экземпляра)
    // 🔹 Поля делаем private - теперь они доступны только внутри класса
   private String name;
   private String color;
   private int speed;
   private int gear;
   private int doors;
   private int wheels;

    // Конструктор (задаёт значения полям)
    public  Car(String name, String color, int speed, int gear, int doors, int wheels) {
        this.name = name;
        this.color = color;
        setSpeed(speed);
        setGear(gear);
        setDoors(doors);
        setWheels(wheels);
    }

    // getter - для получение значений

    public String getName () {
            return  name;
    }

    public  String getColor () {
        return color;
    }

    public int getSpeed () {
        return speed;
    }

    public int getGear () {
        return gear;
    }

    public int getDoors () {
        return doors;
    }

    public int getWheels () {
        return wheels;
    }

    // setter (методы для установки значений с проверкой)
    public void setSpeed (int speed) {
        if (speed >= 0 && speed <= 300) {
            this.speed = speed;
        } else {
            System.out.println("Скорость не должно быть отрицательной !!! ");
        }
    }

    public  void setGear (int gear) {
        if (gear >= 2 && gear <= 8) {
            this.gear = gear;
        } else {
            System.out.println("Недопустимая передача");
        }
    }

    public  void setDoors(int doors) {
        if (doors >= 2 && doors <= 5) { // обычно у машин от 2 до 5 дверей
            this.doors = doors;
        } else {
            System.out.println("Недопустимое колличество дверей");
        }
    }

    public  void  setWheels (int wheels) {
        if (wheels >= 4 && wheels <= 6) { // обычно у машин от 2 до 6 колесо например грузовик
            this.wheels = wheels;
        }
    }

    // метод для увелечение скорости

    public  void accelerate (int increment) {
        if (increment > 0) {
            setSpeed(this.speed + increment);
        }
    }

    // метод для уменьшение скорости

    public void decelerate(int decrement) {
        if (decrement > 0) {
            setSpeed(Math.max(0, this.speed - decrement));
        }
    }



    // метод (поведение, которое может выполнять объект (например, показать информацию о машине).)
    public void displayInfo() {
        System.out.println("Название : " + name);
        System.out.println("Цвет : " + color);
        System.out.println("Скорость : " + speed + "км/ч");
        System.out.println("Передача : " + gear);
        System.out.println("Дверей : " + doors);
        System.out.println("Колес : " + wheels);
    }
}
