package oop.abstraction.autopark;

import oop.abstraction.shapeAbstraction.AbstractShape;

public class Car extends AbstractShape {
    private double engineVolume;

    public Car(String model, int year, double engineVolume) {
        super(model, year);
        this.engineVolume = engineVolume;
    }

    @Override
    public void start () {
        System.out.println("Автомобиль " + model + "Заводится с ключа");
    }

    @Override
    public void stop () {
        System.out.println("Автомобиль " + model + "Остановливается");
    }

    @Override
    public double calculateFuelConsumption (double distance) {
        return distance * (0.1 * engineVolume);
    }

    // информация
    public void displayInfo () {
        System.out.println("=== Информация об автомобиле ===");
        super.displayInfo();
        System.out.println("Обьем двигателя : " + engineVolume);
    }
}
