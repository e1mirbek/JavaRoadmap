package udemy.course.lesson11;

// Кастинг - привидение примитивный типов данных

public class EleventhLs {
    public static void main(String[] args) {
        long newId = 1_000_000_000_000L;
        int id =  (int) newId; // явный кастинг (привидение) long -> int
        int id1 = Math.toIntExact(newId);
        System.out.println(id1);
    }
}
