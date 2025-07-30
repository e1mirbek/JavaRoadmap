package annotationsAndReflections.testApp;

public class Test {
    public static void main(String[] args) {

    }
}


class Worker {
    public void toWork () {
        System.out.println("Hey!");
    }
}

class Developer extends Worker {
    @Override
    public void toWork () {
        System.out.println("Hello world");
    }
}