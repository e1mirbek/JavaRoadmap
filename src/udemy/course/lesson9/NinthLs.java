package udemy.course.lesson9;

// арифметические операторы часть 2

// инкремент и декремент

// префиксная форма: ++number
// постфиксная форма: number++

// Сравнение пошагово

// ++x → увеличить, потом использовать

// x++ → использовать, потом увеличить



public class NinthLs {
    public static void main(String[] args) {

        int number = 10;
        int updateWithPrefix = ++number;
        System.out.println(updateWithPrefix);

        // ----------------------------------

        int number1 = 10;
        int updateWithPostfix = number1++;
        System.out.println(updateWithPostfix);

    }
}
