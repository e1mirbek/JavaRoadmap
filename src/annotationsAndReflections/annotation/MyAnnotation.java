package annotationsAndReflections.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // доступна во время выполнения
@Target(ElementType.METHOD)         // можно ставить только на методы
public @interface MyAnnotation {
    String value();
}



