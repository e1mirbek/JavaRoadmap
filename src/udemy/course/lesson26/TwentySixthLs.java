package udemy.course.lesson26;

// Switch case (Классический switch стейтмент и обновленный switch экспрешен)

public class TwentySixthLs {
    public static void main(String[] args) {

        int dayNumber = 7;

        int dayMouthNumber = 1;


        if (dayNumber == 1) {
            System.out.println("Понедельник");
        } else if (dayNumber == 2) {
            System.out.println("Вторник");
        } else if (dayNumber == 3){
            System.out.println("Среда");
        } else {
            System.out.println("Ошибка !!!");
        }

        // switch case

        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскерсенье");
                break;
            default:
                System.out.println("Ошибка !!!");
        }


        switch (dayMouthNumber) {
            case 1 -> System.out.println("31");
            case 2 -> System.out.println("30");
            case 3 -> System.out.println("29");
            default -> System.out.println("Ошибка !!!");
        }




    }
}
