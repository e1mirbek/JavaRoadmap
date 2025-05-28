package oop.polymorphism.bankingSystem;



// Родительский (базовый) абстрактный класс
public abstract class BankAccount {
    public  String acccountNumber; // номер счета
    public  double balance; // номер баланс

    BankAccount(String acccountNumber, double initialBalance) {
        this.acccountNumber = acccountNumber;
        this.balance = initialBalance;
    }
    // метод пополнение баланса
    public double deposit (double amount) { // положить деньги (увеличить баланс)
        balance += amount;
        return balance;
    }


    // метод снятие денег
    public double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return  balance;
        } else {
            System.out.println("Недостоточно средств !!! ");
            return balance;
        }
    }

    // абстрактный метод - реализация зависит от типа счета
    public  abstract  void calculateInterest();

    public double getBalance () {
        return  balance;
    }

    public String getAcccountNumber () {
        return  acccountNumber;
    }




}
