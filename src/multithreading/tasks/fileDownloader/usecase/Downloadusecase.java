package multithreading.tasks.fileDownloader.usecase;

import multithreading.tasks.fileDownloader.domain.DownloadTask;
import multithreading.tasks.fileDownloader.domain.Downloader;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Создаётся пул из 3 потоков.
// Это значит, что одновременно может выполняться максимум 3 задачи.
// Если задач больше — они будут ждать в очереди.

public class Downloadusecase {
    private final Downloader downloader;

    public Downloadusecase(Downloader downloader) {
        this.downloader = downloader;
    }

    public void downloadFiles (List <DownloadTask> tasks) {
        ExecutorService executorService = Executors.newFixedThreadPool(3); // пул из 3 потоков
        for (DownloadTask task : tasks) {
            executorService.submit( () -> downloader.download(task)); // отправляем задачу в пул
        }
        executorService.shutdown(); // запрещаем принимать новые задачи, но ждем выполнения текущих
    }
}
