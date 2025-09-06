package udemy.course.lesson15;

// Конкатенация строк — это просто склеивание (соединение) строк в одну.

public class FifteenthLs {

    public static void main(String[] args) {

        String firstName = "Elmirbek";
        String lastName = "Abdumanapov";

        int age = 19;

        String userInformation = "Elmirbek " + "Abdumanapov " +  19;

        System.out.println(userInformation);

        FifteenthLs user = new FifteenthLs();
        user.userInformations("Elmirbek", "Abdumanapov", 19);


    }

    void userInformations (String firstName, String lastName, int age) {

        System.out.println("Имя : " + firstName);
        System.out.println("Фамилия : " + lastName);
        System.out.println("Возраст : " + age);


    }

}



