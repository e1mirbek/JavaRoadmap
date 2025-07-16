package multithreading.course.synchronization;

 // Синхронизация потоков — это механизм,
 // который позволяет управлять доступом нескольких потоков к общим ресурсам,
 // чтобы не возникало конфликтов и ошибок

public class BankAccount {

    private int balance = 1000;

    public synchronized void withdraw (int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " снимает " + amount);
            balance -= amount;
            System.out.println("Остаток : " + balance);
        } else {
            System.out.println("Недостаточно средств для " + Thread.currentThread().getName());
        }
    }
}
