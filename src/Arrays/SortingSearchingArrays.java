package Arrays;


import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortingSearchingArrays {
    public SortingSearchingArrays() {
    }

    public static void main(String[] args) {
        int sizeNumbers = 10;
        int[] array = new int[sizeNumbers];
        Random random = new Random();

        for(int i = 0; i < sizeNumbers; ++i) {
            array[i] = random.nextInt(100);
        }

        Arrays.sort(array);
        System.out.println("Сортировка : " + Arrays.toString(array));
        System.out.println("Введите число для поиска : ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int result = Arrays.binarySearch(array, userInput);
        if (result >= 0) {
            System.out.println("Число " + userInput + " найдено в массиве");
        } else {
            System.out.println("Число " + userInput + " не найдено в массиве");
        }

        int[] numbers1 = new int[]{1, 2, 3, 4, 55, 66, -1, 55, 56, 88};
        Arrays.sort(numbers1);
        System.out.println("Сортировка массива : " + Arrays.toString(numbers1));
        int[] numbers2 = new int[]{22, 33, 4, 5, 6, 78, -1, 88, 9};
        Arrays.sort(numbers2, 2, 5);
        System.out.println("Сортировка массива : " + Arrays.toString(numbers2));
        int[] numbers3 = new int[]{33, 5, -1, 66, 90, 85, -9, 55, 66, 77, 88, 99, 76};
        Arrays.sort(numbers3, 2, 7);
        System.out.println("Сортировка массива : " + Arrays.toString(numbers2));
        String studentsSort = "Элмирбек, Кайрат, Акылбек, Кубаныч, Бакыт, Эрасыл";
        String[] student = studentsSort.split(",\\s*");
        Arrays.sort(student);
        System.out.println("Сортировка обьектов массива : " + Arrays.toString(student));
        int[] arr1 = new int[]{1, 2, 3};
        int[] var10000 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{6, 7, 8};
        PrintStream var34 = System.out;
        boolean var10001 = Arrays.equals(arr1, arr3);
        var34.println("int Метод equals : " + var10001);
        String[] hello = new String[]{"Hello World"};
        String[] hello1 = new String[]{"Hello World"};
        String[] var35 = new String[]{"Hello Java"};
        PrintStream var36 = System.out;
        var10001 = Arrays.equals(hello, hello1);
        var36.println("String Метод equals : " + var10001);
        int[][] arr4 = new int[][]{{1, 2}, {3, 4}};
        int[][] var37 = new int[][]{{1, 2}, {3, 4}};
        int[][] arr6 = new int[][]{{9, 10}, {11, 12}};
        PrintStream var38 = System.out;
        var10001 = Arrays.deepEquals(arr4, arr6);
        var38.println("int Метод deepEquals с многомерным массивом : " + var10001);
        String[][] arrayNames = new String[][]{{"Elmirbek, Bakdoolot, Nursultan"}, {"Elmirbek, Bakdoolot, Nursultan"}};
        String[][] var39 = new String[][]{{"Elmirbek, Bakdoolot, Elina"}, {"Elmirbek, Bakdoolot, Nursultan"}};
        String[][] arrayNames2 = new String[][]{{"Elmirbek, Bakdoolot, Nursultan"}, {"Elmirbek, Bakdoolot, Nursultan"}};
        PrintStream var40 = System.out;
        var10001 = Arrays.deepEquals(arrayNames, arrayNames2);
        var40.println("String Метод deepEquals с многомерным массивом : " + var10001);
        int[] original = new int[]{1, 2, 3};
        int[] copy = Arrays.copyOf(original, 3);
        int[] copy1 = Arrays.copyOf(original, 5);
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(copy1));
        String[] students = new String[]{"Элмирбек", "Жаркынай", "Сезим"};
        String[] copyStudents = (String[])Arrays.copyOf(students, 3);
        String[] copyStudents1 = (String[])Arrays.copyOf(students, 5);
        System.out.println("Скапировать три элемента : " + Arrays.toString(copyStudents));
        System.out.println("Добавление еще 2 элемента : " + Arrays.toString(copyStudents1));
        int[] arr7 = new int[5];
        Arrays.fill(arr7, 7);
        System.out.println("Заполнение массива с значением  7 : " + Arrays.toString(arr7));
        char[] favorite = new char[5];
        Arrays.fill(favorite, '❤');
        System.out.println("Заполнение массива с значнем ❤ : " + Arrays.toString(favorite));
        String[] names = new String[5];
        Arrays.fill(names, "Elmirbek");
        System.out.println("Заполнение массива с начением Elmirbek " + Arrays.toString(names));
    }
}
