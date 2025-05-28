package oop.polymorphism.bankingSystem;


// SavingsAccount — процент 5% годовых
public class SavingsAccount extends  BankAccount {
    public  SavingsAccount (String accountNumber, double initialBalace) {
        super(accountNumber, initialBalace);
    }




   // Реализация абстрактного метода: добавляем 5% к балансу
    @Override
    public  void calculateInterest () {
        balance += balance * 0.05; // добавить 5% к балансу
    }

    @Override
    public  double deposit (double amount) {
        balance += amount;
        System.out.println("На счет + " + acccountNumber + "вынесено" + amount);
        return  balance;
    }


}
