package annotationsAndReflections.annotation;

public class MyTest {
    @MyAnnotation("Привет")
    public void sayHello () {
        System.out.println("Hello");
    }
}
