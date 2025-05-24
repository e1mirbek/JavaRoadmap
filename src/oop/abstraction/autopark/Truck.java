package oop.abstraction.autopark;

public class Truck extends AbstractVehicle {
    private double cargoCapacity;

    Truck(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void start () {
        System.out.println("Грузовик : " + model + "заводится с пневмозапуском");
    }

    @Override
    public  void stop () {
        System.out.println("Грузовик" + model + "остановливается с пневматическим тормажением");
    }

    @Override
    public double calculateFuelConsumption (double distance) {
        return distance * 0.2;
    }

    // информация
    public void displayInfo () {
        System.out.println("=== Информация о грузовике ===");
        super.displayInfo();
        System.out.println("Грузоподъемность" + cargoCapacity + "тонн");
    }
 }
