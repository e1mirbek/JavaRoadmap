package oop.abstraction.abstractionExample;

abstract class Payment {

    String receiver;

    public Payment(String receiver) {
        this.receiver = receiver;
    }

    // Абстрактный метод должен быть реализован подклассах
    abstract void processPayment (double amount);


    // Общий метод
    void printReceipt () {
        System.out.println("Чек для  " + receiver);
    }
}
