package udemy.course.lesson25;

// тернарный оператор (?)

public class TwentyFifthLs {
    public static void main(String[] args) {
        int number = 5;
        int number1 = -1;

        String result = (number > 0) ? "Положительный число" : "Отрицательный число !";

        if (number1 > 0) {
            System.out.println("Положительный число");
        } else {
            System.out.println("Отрицательный число");
        }

        System.out.println(result);
    }
}
