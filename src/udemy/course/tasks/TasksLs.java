package udemy.course.tasks;


// Задача

// 1) - создать 4 переменные и сохранить в них чисел 12, -5, -6, и 50
// 2) - вычислить среднее значение этих чисел
// 3) - сохранить результат вычесления в переменную
// 4) Вывести результат в терминал

public class TasksLs {
    public static void main(String[] args) {

        int number = 12;
        int number1 = -5;
        int number2 = -6;
        int number3 = 50;

        int sum = number + number1 + number2 + number3;
        System.out.println("Сумма : " + sum);

        // найти среднее значение

        double average = (double) sum / 4;
        System.out.println("Среднее значение : " + average);

    }

}
