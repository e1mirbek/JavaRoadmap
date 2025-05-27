package oop.abstraction.autopark;

import oop.abstraction.shapeAbstraction.AbstractShape;

public class Car extends AbstractVehicle {
    private double engineVolume;

   public Car (String model, int year, double engineVolume) {
       super(model, year);
        this.engineVolume = engineVolume;
    }

    // методы

    @Override
    public void start () {
        System.out.println("Автомобиль " + model + "заводится" );
    }

    @Override
    public void stop () {
        System.out.println("Автомобиль " + model + "остановливается");
    }

    @Override
    public double caclulateFualConsumpttion (double distance) {
       // формула расчета топлива
        return  distance * (engineVolume / 10.0);
    }


    // информация
    public void displayInfo () {
        System.out.println("=== Информация об автомобиле ===");
        super.displayInfo();
        System.out.println("Обьем двигателя : " + engineVolume);
    }

    public  double getEngineVolume () {
       return  getEngineVolume();
    }
}
