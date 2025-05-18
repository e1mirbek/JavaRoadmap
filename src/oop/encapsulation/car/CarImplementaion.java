package oop.encapsulation.car;

public class CarImplementaion {
    public static void main(String[] args) {
        // 🧱Объекты (экземпляры класса)
        // 🔹tayota и audi — два разных объекта, у каждого свои значения свойств.
        Car tayota = new Car("Tayota", "Red", 1,1,4,4);
         tayota.displayInfo();
         tayota.setWheels(7);
         Car audi = new Car("Audi", "Blue", 300,2,1,4);
         audi.displayInfo();
         audi.setSpeed(310);

    }
}
