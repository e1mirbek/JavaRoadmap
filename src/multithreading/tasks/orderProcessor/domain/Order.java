package multithreading.tasks.orderProcessor.domain;

public class Order {
    private final int id;

    public Order(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
