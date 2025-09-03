package udemy.course.lesson12;

// Переполнение на примере задачи valid Perfect Square

public class TwelfthLs {


    public boolean isPerfectSquare (int num) {

        if (num < 2) return true;
        long left = 0;
        long right = num;

        return rec(left, right, num);



    }





    private boolean rec (long left, long right, long num) {
        if (left < right) {
            return false;
        }
        long mid = (left + right) / 2;
        if (mid * mid > num) {
            return rec(left, mid - 1, num);
        } else {
            return  rec(mid + 1, right, num);
        }
    }
}
