package Arrays;


import java.util.Scanner;

public class MultiDimensionalArrays {
    public MultiDimensionalArrays() {
    }

    public static void main(String[] args) {
        int[][] numbers = new int[][]{{1, 2}, {3, 4}};
        int sum = 0;

        for(int i = 0; i < numbers.length; ++i) {
            for(int j = 0; j < numbers[i].length; ++j) {
                sum += numbers[i][j];
            }
        }

        System.out.println("Сумма : " + sum);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Катарлардын саны : ");
        int rows = scanner.nextInt();
        System.out.println("Тилкелердин санын : ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Матрицанын элементтерин киргизинис : ");

        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < cols; ++j) {
                System.out.print("Элемент [" + i + "] [" + j + "] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n Матрица : ");

        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < cols; ++j) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        scanner.close();
    }
}

