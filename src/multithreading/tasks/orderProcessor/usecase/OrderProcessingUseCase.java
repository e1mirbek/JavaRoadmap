package multithreading.tasks.orderProcessor.usecase;

import multithreading.tasks.orderProcessor.domain.Order;
import multithreading.tasks.orderProcessor.domain.OrderHandler;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


// отвечает за обработку списка заказов в несколько потоков
public class OrderProcessingUseCase {
    private final OrderHandler orderHandler;


    public OrderProcessingUseCase(OrderHandler orderHandler) {
        this.orderHandler = orderHandler;
    }

    public void processOrders (List <Order> orders) {
        ExecutorService executor = Executors.newFixedThreadPool(3);


        for (Order order : orders) {
            executor.submit(() -> orderHandler.handle(order));
        }
        executor.shutdown();
    }
}
