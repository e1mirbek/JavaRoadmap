package udemy.course.lesson17;

// Оператор сравнения - часть 1

public class SeventeenthLs {

    public static void main(String[] args) {

        int userInput = 2005;

        int from = 1900;
        int to = 2025;

        boolean result = userInput >= from;
        boolean result2 = userInput <= to;

       boolean result3 = userInput >= from && userInput <= to;
                          // true
        System.out.println(result3);

    }

}
