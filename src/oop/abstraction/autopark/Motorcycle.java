package oop.abstraction.autopark;

public class Motorcycle extends AbstractVehicle {
    private boolean hasSidecar;

    public Motorcycle (String model, int year, boolean hasSidecar) {
        super(model, year);
        this.hasSidecar = hasSidecar;
    }

    // методы
    @Override
    public  void start () {
        System.out.println("Мотоцикл" + model + "заводится");
    }


    @Override
    public void stop () {
        System.out.println("Мотоцикл " + model + "остановливается");
    }

    @Override
    public  double caclulateFualConsumpttion (double distance) {
        return  distance * 0.7;
    }



    // информация
    public void displayInfo () {
        System.out.println("=== Информация о мотоцикле ===");
        super.displayInfo();
        System.out.println("Имеется коляска : " + (hasSidecar ? "Да" : "Нет"));
    }
}
