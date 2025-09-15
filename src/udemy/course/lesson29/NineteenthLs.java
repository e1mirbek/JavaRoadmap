package udemy.course.lesson29;

// Перегрузка методов (over loading)

public class NineteenthLs {
    public static void main(String[] args) {
        int thousandInt = 1000;
        long thousandLong = 1000L;
        double thousandDouble = 1000.0;

    String string = String.valueOf(thousandDouble);
        System.out.println(string);

    }


    // использование один и тот же метод несколько раз с разными комьинациями

    int multiply (int firstNumber, int secondNumber) {

        return  firstNumber * secondNumber;

    }


    int multiply (String  firstNumber, String secondNumber) {

        return Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);

    }

    // отдельный метод а не over loading !!!

    String getmultiplicationAsString (int firstNumber, int secondNumber) {

        int result =  firstNumber * secondNumber;

        return String.valueOf(result);

    }
}
