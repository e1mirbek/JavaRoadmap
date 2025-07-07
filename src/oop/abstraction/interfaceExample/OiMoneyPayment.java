package oop.abstraction.interfaceExample;

public class OiMoneyPayment implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " сом через O! деньги");
    }

}
