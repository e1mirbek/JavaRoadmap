package udemy.course.lesson19;

// оператор ! (логическое нет)

public class NineteenthLs {

    public static void main(String[] args) {

        boolean notTrue = !true;

        int value = -5;
        boolean isValueIsNegative = value < 0;
        System.out.println(isValueIsNegative);

        int number = 4;
        // проерка является ли число четным
        boolean isEven = 4 % 2 == 0;
        System.out.println(!isEven); // (логическое нет)

    }

}
