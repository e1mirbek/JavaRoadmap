package multithreading.thread;

public class MyThread extends Thread {
    private final  int threadNumber;

    public MyThread (int threadNumber) {
        this.threadNumber = threadNumber;
    }
    // run() содержит код который выполнится внутри этого потока
    @Override
    public void run () {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " Из патока №" + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
