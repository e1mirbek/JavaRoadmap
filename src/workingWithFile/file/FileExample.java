package workingWithFile.file;

import java.io.File;

// Java предлагает два основных API для работы с файлами

public class FileExample {
    public static void main(String[] args) {
        // File — это представление имени файла или директории, но не сам файл
        File file = new File("example.txt");

        // 🔹 file.getName()
        //    Возвращает имя файла
        //📌 Например, если путь "C:/folder/example.txt" → getName() вернёт "example.txt".
        System.out.println("Имя файла : " + file.getName());

        // 🔹  file.exists()
        //     Проверяет, существует ли файл физически на диске.
        //     true — если файл реально есть в указанной папке
        //     false — если файла нет (например, ты его не создавал или он был удалён)
        System.out.println("Существует ли файл : " + file.exists());

        // 🔹 file.isFile()
        //    Проверяет, является ли путь файлом, а не папкой.
        //    true — если это файл
        //    false — если это папка или путь вообще не существует
        System.out.println("Этот файл ? " + file.isFile());
    }
}
