package udemy.course.lesson2;


// термины statement (предложение) и expression (выражение)


// statement - (сосотовляет законченный юнит исполнения)


// expression - (комбинация переменных, операторов, вызовов методов, которая возврощает значение) точнее (выражение что то вычисляет)

public class SecondLs {


    // вызов метода

    void main () {
        print(); // statement
        System.out.println("expression - 1 выражение : " + result);
        System.out.println("expression - 2 выражение : " + name);
    }



    // пример expression
    int a = 5;
    int b = 5;
    int result = a + b; // 1 ) выражение - которая вычисляет

    String name = "Elmirbek"; // 2) выражение - которая возврощает строку



    // деклорация метода (создание - метода)
    void print () {
        System.out.println("Hello World"); // 1 statement (законченный unit исполнения)
    }

}
