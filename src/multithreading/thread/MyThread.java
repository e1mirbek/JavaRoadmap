package multithreading.thread;

public class MyThread extends Thread {



    // run() содержит код который выполнится внутри этого потока

    @Override
    public void run () {
        System.out.println("Привет из потока " + Thread.currentThread().getName());
    }

    // start() запускает поток (асинхронно)

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }

}
