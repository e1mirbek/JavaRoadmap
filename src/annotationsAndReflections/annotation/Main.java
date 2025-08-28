package annotationsAndReflections.annotation;


// Что такое аннотации

// Аннотации это метки
// Они не влияют напрямую на выполнение кода,
// но могут использоваться инструментами, компилятором или во время выполнения программы.

// | Аннотация           | Назначение                                             |
//| ------------------- | ------------------------------------------------------ |
//| `@Override`         | Показывает, что метод переопределяет метод суперкласса |
//| `@Deprecated`       | Помечает метод устаревшим                              |
//| `@SuppressWarnings` | Подавляет предупреждения компилятора                   |

// Что такое рефлексия (Reflection)

// Рефлексия — это механизм,
// позволяющий исследовать и изменять структуру классов во время выполнения программы.
// Например: получить имя класса, список методов, аннотации, вызвать методы и т.д.


import annotationsAndReflections.testApp.Test;

import java.lang.reflect.Method;

// Пример получения информации через рефлексию:
public class Main {
    public static void main(String[] args) throws Exception {
        Class <?> clazz = Test.class; // получаем обьект класса

        // clazz.getDeclaredMethods() — возвращает все методы, объявленные в классе Test
        for (Method method : clazz.getDeclaredMethods()) {

            // ищем методы с аннотацией MyAnnotation
            if (method.isAnnotationPresent(MyAnnotation.class)){

                // получаем объект аннотации
                MyAnnotation a = method.getAnnotation(MyAnnotation.class);

                // выводим значение из аннотации
                System.out.println("Найден метод с аннотацией" + a.value());

                // вызываем метод (sayHello()) у нового объекта Test
                method.invoke(new MyTest());
            }
        }
    }
}

