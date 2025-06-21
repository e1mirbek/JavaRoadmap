package multithreading.tasks.counter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Thread> threadList = new ArrayList<>();

        var counter = new SimpleCounter();

        for (int i = 0; i < 50; i++) {
            Thread thread = new MyThread(counter, i);
            thread.start();
            threadList.add(thread);
        }
        System.out.println("Цикл for завершен");

        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Counter = " + counter.get());
    }
}
