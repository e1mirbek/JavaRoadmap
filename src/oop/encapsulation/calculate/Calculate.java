package oop.encapsulation.calculate;

public class Calculate {
    // приватные поля - инкапсуляций
    private double result;

    // конструктор
    public  Calculate() {
        this.result = 0;
    }

    public double getResult () {
        return result;
    }

    // метод сложение
    public void addition (double number) {
        result += number;
    }

    // метод вычитание

    public void subtraction (double number) {
        result -= number;
    }

    // метод умнажение

    public void multiplication (double number) {
        result *= number;
    }

    // метод деление

    public void division (double number) {
        result /= number;
    }

    // метод остаток от деления

    public  void mod (double number) {
        result %= number;
    }

    // метод для сброс

    public void reset () {
        result = 0;
    }

  //    метод для отображение результата
    public void displayCalculate () {
        System.out.println("Текущий результат: " + result);
    }
}
