package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArrays {
    public OneDimensionalArrays() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        int[] array = new int[10];

        for(int i = 5; i < array.length; ++i) {
            System.out.println(Arrays.toString(array));
        }

        int[] numbers = new int[]{10, 20, 30, 40, 50, 60, 80};
        int sum = 0;

        for(int num : numbers) {
            sum += num;
        }

        double average = (double)sum / (double)numbers.length;
        System.out.println("Сумма : " + sum);
        System.out.println("Среднее значение : " + average);
        int[] findMinMaxValue = new int[]{7, 2, 9, -1, 1};
        int min = findMinMaxValue[0];
        int max = findMinMaxValue[0];

        for(int i = 1; i < findMinMaxValue.length; ++i) {
            if (findMinMaxValue[i] < min) {
                min = findMinMaxValue[i];
            }

            if (findMinMaxValue[i] > max) {
                max = findMinMaxValue[i];
            }
        }

        System.out.println("MIN сумма : " + min);
        System.out.println("MAX сумма : " + max);
        String[] students = new String[]{"Адилет", "Гаухар, Элмирбек, Кайрат"};
        String straightStudent = "Адилет";
        String averageStudent = "Элмирбек";

        for(int i = 1; i < students.length; ++i) {
            if (students[i].equals(straightStudent)) {
                System.out.println("Троченик : " + students[i]);
            }

            if (students[i].equals(averageStudent)) {
                System.out.println("Отличник : " + students[i]);
            }
        }

        System.out.println("Отличник : " + straightStudent);
        System.out.println("Троечник : " + averageStudent);
    }

    class ExplorationOfTheArrays {
        ExplorationOfTheArrays() {
        }

        public static void main(String[] args) {
            int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(Arrays.toString(numbers));
            System.out.println(numbers.length);
            int[] array = new int[20];

            for(int i = 0; i < array.length; ++i) {
                array[i] = i * 10;
            }

            System.out.println(Arrays.toString(array));
            System.out.println(array.length);
        }
    }
}
