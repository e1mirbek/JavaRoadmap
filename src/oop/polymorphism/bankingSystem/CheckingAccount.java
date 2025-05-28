package oop.polymorphism.bankingSystem;

public class CheckingAccount extends  BankAccount{

    CheckingAccount (String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }


    // Реализация: проценты не начисляются
    @Override
    public  void calculateInterest () {
        System.out.println("проценты не начисляются (0%)");
    }
}
