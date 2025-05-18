package oop.encapsulation.bank;

public class Bank {
    // приватные поля - инкапсуляция
    private  String accountNumber;
    private  String ownerName;
    private  double balance;

    // Конструктор
    public Bank (String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }


    // getter для получения значение
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }


     // setter для операцций
    public void setBalance(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Депозит на " + amount + "успешно выполнен ваш текущий баланс : " + balance);
        } else {
            System.out.println("Ошибка : сумма депозита должно быть полажительной !!! ");
        }
    }


    // метод снятие деньги
    public void withdraw (double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снятие " + amount + "успешно ваш текущий баланс : " + balance);

        } else {
            System.out.println("Ошибка : Недостаточно средств или неверная сумма для снятия");
        }
    }

    // setter с проверкой для имени владельца
    public  void setOwnerName(String ownerName) {
        if (ownerName != null && !ownerName.isEmpty()) {
            this.ownerName = ownerName;
            System.out.println("Имя владельца успешно изменено");
        } else {
            System.out.println("Имя владельца не должно быть пустым !!! ");
        }
    }

    // метод для вывода информаций


    public  void displayAccountInfo () {
        System.out.println("\n--- Информация о счете ---");
        System.out.println("Номер счета : " + accountNumber);
        System.out.println("Владелец : " + ownerName);
        System.out.println("Баланс : " + balance);
    }


}
