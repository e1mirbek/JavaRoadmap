package multithreading.tasks.producerConsumer;



// Producer (Производитель) — это поток,
// который создаёт данные (например, добавляет элементы в очередь).
// Consumer (Потребитель) — это поток,
// который забирает данные (например, берёт элементы из очереди и обрабатывает).

// Они работают одновременно,
// и чтобы не было ошибок,
// они делят между собой "буфер" (например, очередь).

// 🎯 Цель программы:
// ✅ Один поток добавляет данные в общую очередь.
// ✅ Другой поток забирает эти данные.
// ✅ Оба потока работают параллельно, не мешая друг другу.

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5); // max 5 element

        Thread producerTread = new Thread(new Producer(buffer));
        Thread consumerTread = new Thread(new Consumer(buffer));

        producerTread.start();
        consumerTread.start();


    }
}

