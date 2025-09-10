package udemy.course.lesson23;

// Задача : найти наибольшее из трех чисел с помощью if else

public class TwentyThirdLs {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1);
        } else  if (number2 > number3){
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }

    }
}
