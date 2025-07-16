package multithreading.course.synchronization;

public class BankExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread husband = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.withdraw(200);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        }, "Муж");

        Thread wife = new Thread(() -> {
            for (int i = 0; i <=5; i++) {
                account.withdraw(300);
                try {Thread.sleep(100); } catch (InterruptedException e) {}
            }
        }, "Жена");
        husband.start();
        wife.start();
    }
}
