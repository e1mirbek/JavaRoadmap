package exceptions;



// 📘 Что такое исключение (exception) ?
// Исключение — это ошибка, → которая возникает во время выполнения программы

// Например:
// делишь на ноль → ошибка
// пытаешься открыть файл, которого нет → ошибка
// обращаешься к элементу массива, которого нет → ошибка

// создаётся объект исключения,
// и программа может либо → обработать её, либо → завершиться с ошибкой.

// 🚨 Типы исключений

// 1. Checked exceptions — заставляет тебя обрабатывать такие исключения
// → (например, IOException)

// 2. Unchecked exceptions — такие исключения можно не обрабатывать
// → (например, ArithmeticException, NullPointerException)

// 3. Errors — серьёзные ошибки, которые не обрабатываются
// → (например, нехватка памяти)

//        try {
//            // код который может вызвать исключение (Может быть ошибка)
//        } catch (Exception e){
//            // (оброботка) исключения
//        } finally {
//            // может выполняться всегда
//        }


public class ExceptionExample {
    public static void main(String[] args) {
     try {
         int myInt = Integer.parseInt("parse");
     } catch (NumberFormatException nfa) {
         System.out.println("Hello world");
     }
    }
}
