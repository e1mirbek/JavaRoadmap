package multithreading.course.fileDownload;


// Runnable - задача, которую можно выполнить в потоке

// 💡 Зачем нужен Runnable?
//    Вот основные причины, почему Runnable полезен:
// ✅ Отделение задачи от потока
//    Задача (DownloadTask) отдельно
//    Поток (Thread) отдельно
//    → Это чисто и гибко
// ✅ Можно переиспользовать код
//    Один и тот же DownloadTask можно запустить в разных потоках
//
// ✅ Работает с ExecutorService
//
//Современные многопоточные системы (пулы потоков) используют Runnable для выполнения задач

import java.util.concurrent.TimeUnit;

public class DownloadTask implements Runnable{

    private String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {

        System.out.println("Начало загрузки : " + fileName);

        // Имитация загрузки (случайное время от 1 до 5)

        try {
            int downloadTime = (int) (Math.random() * 4) + 1;
            TimeUnit.SECONDS.sleep(downloadTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Загрузка завершена : " + fileName);

    }
}
