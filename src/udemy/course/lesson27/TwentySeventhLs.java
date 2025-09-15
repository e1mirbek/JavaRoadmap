package udemy.course.lesson27;

// Цикл while

public class TwentySeventhLs {
    public static void main(String[] args) {

        int x = 5;


        while (x > 0) {
            System.out.println("Hello World + " + x);
            x--;
        }
        System.out.println("Next programming");

        // модификация цикла

        do {
            System.out.println(x);
            x--;
        } while (x > 0);
    }
}
