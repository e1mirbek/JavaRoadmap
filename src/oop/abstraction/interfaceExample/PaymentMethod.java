package oop.abstraction.interfaceExample;


// Это абстракция через interface:
// мы не знаем, как работает каждая реализация,
// мы просто знаем, что можно вызвать pay()

public interface PaymentMethod {
    void pay (double amount);
}
