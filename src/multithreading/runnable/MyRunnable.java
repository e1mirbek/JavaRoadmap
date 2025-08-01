package multithreading.runnable;


   // Интерфейс Runnable
   // Предпочтительный способ создания потока, особенно при работе с ExecutorService
   // ------------------------------------------------------------------------------
   // ExecutorService зачем он нужен ?
   // Thread thread = new Thread(() -> {
   //      // твоя задача
   //      });
   //    thread.start();
   // В этом случае ты сам контролируешь поток:
   // когда он начинается,
   // когда заканчивается,
   // сколько потоков создать и т.д.
   // Но это сложно и неэффективно, если нужно запускать много задач параллельно.
   // ------------------------------------------------------------------------------
   // Вот тут и приходит на помощь ExecutorService — менеджер потоков, который:
   // автоматически создает и управляет пулом потоков;
   // повторно использует уже завершённые потоки (перезапуск не нужен);
   // упрощает работу с асинхронными задачами.

   // ✅ Преимущества ExecutorService
   // 📌 Автоматическое управление потоками (пул);
   // 📌 Повторное использование потоков (без создания новых);
   // 📌 Упрощённый запуск Runnable и Callable;
   // 📌 Возможность получить результат от задачи (через Future);
   // 📌 Возможность корректного завершения всех задач (shutdown()).

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Привет из Runnable" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
    }
}




