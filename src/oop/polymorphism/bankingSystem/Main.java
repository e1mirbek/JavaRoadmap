package oop.polymorphism.bankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Создать список обьектов типа BankAccount (Родительский тип)
        List<BankAccount> accounts = new ArrayList<>();

        // Создать обьекты дочерных классов
        BankAccount savings = new SavingsAccount("12345", 1000);
        BankAccount checking = new CheckingAccount("67890", 500.0);


        // ⬇️ добавить в список - тип BankAccount но обьекты разные
        accounts.add(savings);
        accounts.add(checking);

        //  🔁 Проходить по всем счетам
        for (BankAccount account : accounts) {
            // 💥 Полиморфизм: вызывается реализация метода из соответствующего класса
            account.calculateInterest(); // SavingsAccount начислит 5%, у CheckingAccount — ничего
            System.out.println("Счет : " + account.getAcccountNumber() + " Баланс : " + account.getBalance());
        }
    }
}
