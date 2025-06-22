package multithreading.tasks.fileDownloader.domain;

public class DownloadTask {
    private final String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }


    public String getFileName() {
        return fileName;
    }
}
