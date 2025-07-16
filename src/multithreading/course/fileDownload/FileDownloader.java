package multithreading.course.fileDownload;


// Изучение потоки

// Реальный пример : Загрузка файлов

// Нужно скачать несколько файлов пораллельно

public class FileDownloader {
    public static void main(String[] args) {

        String [] files = {"file1.zip", "file2.pdf", "file3.mp4"};

        for (String file : files) {
          new Thread(new DownloadTask(file)).start();
        }
    }
}
