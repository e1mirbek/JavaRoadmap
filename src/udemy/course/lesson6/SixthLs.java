package udemy.course.lesson6;


// использование слова return в void методах

import java.time.LocalDateTime;

public class SixthLs {

    public static void main(String[] args) {

        LocalDateTime nowLocalDateTime = LocalDateTime.now();

    }

    void handleTime (LocalDateTime localDateTime) {
        addOneHourIfNotNull(localDateTime);
    }

    void addOneHourIfNotNull (LocalDateTime localDateTime) {

        if (localDateTime == null) {
            System.out.println("DateTime is null !!! ");
            return;
        }

        localDateTime.plusHours(1);

    }


}
