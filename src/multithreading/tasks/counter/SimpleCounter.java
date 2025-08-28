package multithreading.tasks.counter;

public class SimpleCounter {
    private int count;

    public SimpleCounter () {
        this.count = 0;
    }

    public void increment () {
        count++;
    }

    public int get () {
        return count;
    }
}
