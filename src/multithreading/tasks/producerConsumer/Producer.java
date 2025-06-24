package multithreading.tasks.producerConsumer;


// Producer (Производитель) — это поток,
// который создаёт данные (например, добавляет элементы в очередь).

public class Producer implements Runnable {

    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int value = 0;
        while (true) {
            try {
                buffer.produce(value++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

