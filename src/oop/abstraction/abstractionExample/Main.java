package oop.abstraction.abstractionExample;

public class Main {
    public static void main(String[] args) {


        Payment payment = new BankTransfer("Элмирбек Абдуманапов");

        payment.processPayment(2000.0);



    }

}
