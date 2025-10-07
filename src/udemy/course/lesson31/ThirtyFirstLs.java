package udemy.course.lesson31;


// Как сравнить строки, String pool (пул строк)

public class ThirtyFirstLs {

    public static void main(String[] args) {
        int a = 20;

        int b = 6;

        System.out.println(a != b);

        String name1 = "Elmirbek";

        String name2 = "Elmirbek";

        String name3 = new String("Elmirbek");

        System.out.println(name1.equals(name3));
    }


}
