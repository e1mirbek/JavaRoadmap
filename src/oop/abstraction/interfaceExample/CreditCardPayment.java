package oop.abstraction.interfaceExample;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " сом с кредитной карты");
    }

}
