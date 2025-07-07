package oop.abstraction.interfaceExample;

public class Main {
    public static void main(String[] args) {
        PaymentMethod payment = new CreditCardPayment();
        payment.pay(1000.0);
        payment = new PayPalPayment();
        payment.pay(2000.0);
        payment = new OiMoneyPayment();
        payment.pay(5000);
    }
}
