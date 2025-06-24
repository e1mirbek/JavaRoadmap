package multithreading.tasks.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
    private final Queue <Integer> buffer = new LinkedList<>();
    private final int limit;

    public SharedBuffer(int limit) {
        this.limit = limit;
    }

    public void produce (int value) throws InterruptedException {
        synchronized (buffer) {
            while (buffer.size() == limit) {
                buffer.wait(); // очередь полна
            }
            buffer.add(value);
            System.out.println("Producer добавил" + value);
            buffer.notify(); // разбуди Consumer
        }
    }


    public int consume () throws InterruptedException {
        synchronized (buffer) {
            while (buffer.isEmpty()) {
                buffer.wait(); // очередь пуста
            }
            int value = buffer.poll();
            System.out.println("Consumer забрал" + value);
            buffer.notify(); // разбуди Producer
            return value;
        }

    }
}
