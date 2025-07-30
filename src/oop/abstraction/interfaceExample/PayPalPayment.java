package oop.abstraction.interfaceExample;

public class PayPalPayment implements PaymentMethod{


    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " сом через PayPal");
    }
}
