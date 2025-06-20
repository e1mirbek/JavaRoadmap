package multithreading.runnable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// ExecutorService — современный способ управления потоками
// Позволяет управлять пулом потоков и выполнять задачи эффективно.

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3); // пул из 3 потоков
        Runnable task = () -> {
            System.out.println("Выполняется задача : " + Thread.currentThread().getName());
        };
        for (int i = 0; i < 5; i++) {
            executorService.submit(task);
        }
        executorService.shutdown(); // останавливаем приём новых задач


    }
}
