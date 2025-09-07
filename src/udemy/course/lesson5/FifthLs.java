package udemy.course.lesson5;


// Краткие итоги по методам возврат значений из методов выбрасывание исключений 



public class FifthLs {


    void main () {
        try{
            methodThrowsExceptionExample(55, 0);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        }
        methodReturnValueExample(5, 8);
        methodThrowsExceptionExample(55, 0);
        System.out.println(methodReturnValueExample(6, 6));
        System.out.println("Hello World");
    }



    void voidMethodExample () {
        System.out.println("Hello Java !!");
    }

    int methodReturnValueExample (int a, int b) {
        return  a + b;
    }

    int methodThrowsExceptionExample (int number1, int number2) {
        return number1 / number2;

    }
}
