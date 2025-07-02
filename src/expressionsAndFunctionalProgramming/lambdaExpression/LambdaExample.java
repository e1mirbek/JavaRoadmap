package expressionsAndFunctionalProgramming.lambdaExpression;


// Лямбда-выражения — это короткий способ записать анонимный метод (функцию),
// который можно передать как аргумент или сохранить в переменной.

// 🔹 Простыми словами:
//    Это функция без имени, которая делает код короче и читаемее,
//    особенно когда нужно передать какое-то действие в метод
//    (например, в forEach, sort, filter и т. д.).

public class LambdaExample {
    public static void main(String[] args) {
        // лямда выражения для реализаций интерфейса Runnable
        Runnable runnable = () -> {
            System.out.println("Привет из лямда - выражения");
        };

        new Thread(runnable).start();
    }
}
