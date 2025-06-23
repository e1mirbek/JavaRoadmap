package multithreading.tasks.orderProcessor.infrastructure;

import multithreading.tasks.orderProcessor.domain.Order;
import multithreading.tasks.orderProcessor.domain.OrderHandler;

public class FakeOrderHandler implements OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.println(Thread.currentThread().getName() + "Идет обработка заказа #" + order.getId());
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "Завершил оброботку заказа #" + order.getId());
    }


}
