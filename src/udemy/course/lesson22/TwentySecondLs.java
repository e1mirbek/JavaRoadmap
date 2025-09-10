package udemy.course.lesson22;

// Сокращенная форма if-then-else

public class TwentySecondLs {
    public static void main(String[] args) {

        int age = 20;
        String result;

        // обычный if else

        if (age >= 18) {
            result = "Не совершеннолетний";
        } else {
            result = "Совершеннолетний";
        }
        System.out.println("Результат выполнения обычный if else : " + result);


        // сокращенный

        int height = 150;

        System.out.println(result =  (height >= 160) ? "Высокий" : "Не высокий");



    }
}
