package multithreading.course;


// Многопоточность позволяет программе выполнять несколько задач одновременно.
// В Java это реализовано через класс Thread и интерфейс Runnable

// 1. Поток (Thread) - легковесный процесс, который выполняется параллельно с другими потоками

// 2. Runnable - задача, которую можно выполнить в потоке

// 3. Синхронизация - механизм контроля доступа к общим ресурсам

public class ThreadExample {
    public static void main(String[] args) {

        // Создаем первый поток

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Поток 1 : " + i);
                try {
                    Thread.sleep(500); // пауза на 0.5 секунды
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // Создаем второй поток

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Поток 2 : " + i);
                try {
                    Thread.sleep(300); // пауза на 0.3 секунды
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        // запускаем потоки
        thread1.start();
        thread2.start();
        
    }
}
