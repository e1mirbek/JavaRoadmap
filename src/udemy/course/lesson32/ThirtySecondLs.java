package udemy.course.lesson32;


// Метод String join 

public class ThirtySecondLs {

    public static void main(String[] args) {
        String fistName = "Elmirbek";
        String lastName = "Abdumanapov";

        int age = 20;

        String info = String.join(" ", fistName, lastName, String.valueOf(age));

        System.out.println(info);




    }
}
