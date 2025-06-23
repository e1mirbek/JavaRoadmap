package multithreading.tasks.orderProcessor;

import multithreading.tasks.orderProcessor.controller.OrderController;

public class Main {
    public static void main(String[] args) {
        new OrderController().start();
    }
}
