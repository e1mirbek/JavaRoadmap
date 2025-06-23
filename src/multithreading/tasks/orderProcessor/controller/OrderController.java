package multithreading.tasks.orderProcessor.controller;

import multithreading.tasks.orderProcessor.domain.Order;
import multithreading.tasks.orderProcessor.infrastructure.FakeOrderHandler;
import multithreading.tasks.orderProcessor.usecase.OrderProcessingUseCase;

import java.util.ArrayList;
import java.util.List;


//  контроллер — точка входа в приложение
public class OrderController {
    public void start () {
        var handler = new FakeOrderHandler();
        var useCase = new OrderProcessingUseCase(handler);

        List <Order> orders = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {
            orders.add(new Order(i));
        }
        useCase.processOrders(orders);
    }
}
