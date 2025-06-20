package Arrays;


import java.util.Arrays;

public class AdditionalMethodsWithArrays {
    public AdditionalMethodsWithArrays() {
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 44, 66, 666, 777, 888, 90, 21};
        System.out.println("Первый массив : " + Arrays.toString(numbers));
        int max = findMax(numbers);
        System.out.println("Максимальное число : " + max);
        int[] numbers1 = new int[]{22, 4, 66, -1, -5, 90, -6, 92, 75, 4, 55};
        System.out.println("Второй массив ; " + Arrays.toString(numbers1));
        int min = findMin(numbers1);
        System.out.println("Минимальное число : " + min);
    }

    public static int findMax(int[] array) {
        if (array != null && array.length != 0) {
            int max = array[0];

            for(int i = 0; i < array.length; ++i) {
                if (array[i] > max) {
                    max = array[i];
                }
            }

            return max;
        } else {
            throw new IllegalArgumentException("Аргумент не должно быть пустым");
        }
    }

    public static int findMin(int[] array) {
        if (array != null && array.length != 0) {
            int min = array[0];

            for(int i = 0; i < array.length; ++i) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            return min;
        } else {
            throw new IllegalArgumentException("Аргуемнт не должно быть пустым");
        }
    }
}
