package udemy.course.lesson18;

// Операптор сравнения - часть 2

public class EighteenthLs {

    public static void main(String[] args) {

        int userScore = 50;
        int scoreToGetBonus1 = 100;
        int scoreToGetBonus2 = 1000;

      boolean result1 =  userScore == scoreToGetBonus1;
      boolean result2 = userScore == scoreToGetBonus2;

      boolean finalResult = userScore == scoreToGetBonus1 ||  userScore == scoreToGetBonus2;

        System.out.println(finalResult);

    }

}
