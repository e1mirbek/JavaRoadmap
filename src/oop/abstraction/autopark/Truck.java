package oop.abstraction.autopark;

public class Truck extends AbstractVehicle {
    private double cargoCapacity;

   public Truck(String model, int year, double cargoCapacity) {
       super(model, year);
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
    public double caclulateFualConsumpttion (double distance) {
        return  distance * 0.9;
    }

    // информация
    public void displayInfo () {
        System.out.println("=== Информация о грузовике ===");
        super.displayInfo();
        System.out.println("Грузоподъемность" + cargoCapacity + "тонн");
    }
 }
