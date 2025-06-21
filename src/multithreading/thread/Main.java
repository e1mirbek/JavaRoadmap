package multithreading.thread;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            var thread = new MyThread(i);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
