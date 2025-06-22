package multithreading.tasks.fileDownloader.controller;

import multithreading.tasks.fileDownloader.domain.DownloadTask;
import multithreading.tasks.fileDownloader.infrastructure.FakeDownloader;
import multithreading.tasks.fileDownloader.usecase.Downloadusecase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DownloadController {
    public void start () {
        var downloader = new FakeDownloader();
        var usecase = new Downloadusecase(downloader);
        List <DownloadTask> tasks = Arrays.asList(
                new DownloadTask("Файл_1.txt"),
                new DownloadTask("Файл_2.txt"),
                new DownloadTask("Файл_3.txt"),
                new DownloadTask("Файл_4.txt"),
                new DownloadTask("Файл_5.txt")
                );
        usecase.downloadFiles(tasks);
    }
}
