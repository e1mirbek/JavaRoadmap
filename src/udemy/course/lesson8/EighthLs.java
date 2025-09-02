package udemy.course.lesson8;

// Классы обертки / Wrapper classes

// Примитивные (int, long, double, char и т.д.)
// Ссылочные (обёртки) (Integer, Long, Double, Character и т.д.)

// int / long = быстрее, проще, но всегда есть значение.
// Integer / Long = объект, можно хранить null, использовать методы, класть в коллекции.

public class EighthLs {

    public static void main(String[] args) {

        int primitiveInt = 5;
        Integer objectInt = 5;

        long primitiveLong = 1_000_000_000L;
        Long objectLong = 1_000_000_000L;

        double primitiveDouble = .01;
        Double objectDouble = .01;

        char primitiveChar = 'с';
        Character objectChar = 'с';

        boolean primitiveBoolean = true;
        Boolean objectBoolean = true;

    }
}
