package multithreading.tasks.fileDownloader;

import multithreading.tasks.fileDownloader.controller.DownloadController;

public class Main {
    public static void main(String[] args) {
        new DownloadController().start();
    }
}
