package exceptions.arrayGoingBeyondBoundaries;


// Массив и выход за границы
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        try{
            System.out.println(numbers[5]); // нет такого индекса
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка: Индекс вне диапазона массива");
        }
    }
}
