package oop.abstraction.autopark;

import oop.abstraction.shapeAbstraction.AbstractShape;

public abstract class AbstractVehicle {
    protected String model;
    protected int year;

    AbstractVehicle (String model, int year) {
        this.model = model;
        this.year = year;
    }

    // абстрактные методы
    public abstract void start ();
    public abstract void stop  ();
    public abstract double caclulateFualConsumpttion(double distance);

    // конкретные методы
    public String getModel () {
        return model;
    }

    public int getYear () {
        return year;
    }

    // информация
    public void displayInfo () {
        System.out.println("Модель : " + model);
        System.out.println("Год выпуска : " + year);
    }
}
