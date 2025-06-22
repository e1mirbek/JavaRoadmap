package multithreading.tasks.fileDownloader.infrastructure;


// просто ждёт и выводит текст

import multithreading.tasks.fileDownloader.domain.DownloadTask;
import multithreading.tasks.fileDownloader.domain.Downloader;

public class FakeDownloader implements Downloader {

    @Override
    public void download(DownloadTask task) {
        System.out.println(Thread.currentThread().getName() + "Начинает скачивание" + task.getFileName());
        try {
            Thread.sleep(2000); // // имитация загрузки 2 секунды
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "Завершил скачивание" + task.getFileName());
    }
}
