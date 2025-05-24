package oop.abstraction.autopark;

import oop.abstraction.shapeAbstraction.AbstractShape;

public class Motorcycle extends AbstractShape {
    private boolean hasSidecar;

    public Motorcycle (boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void stop () {
        System.out.println("Мотоцикл : " + model + "остановливается");
    }

    public double calculateFuelConsumption () {
        return distance * 0.05;
    }

    // информация
    public void displayInfo () {
        System.out.println("=== Информация о мотоцикле ===");
        super.displayInfo();
        System.out.println("Имеется коляска : " + (hasSidecar ? "Да" : "Нет"));
    }
}
