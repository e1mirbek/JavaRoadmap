package oop.abstraction.abstractionExample;

public class BankTransfer extends Payment {

    public BankTransfer(String receiver) {
        super(receiver);
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Перевод + " + amount + " сом на банковский счет " + receiver);
    }
}
