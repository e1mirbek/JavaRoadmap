package workingWithFile;


// Получить список файлов и папок

import java.io.File;
import java.io.IOException;

public class listFile {

    public static final File PATH = new File("/Users/user/Desktop/test");

    public static void main(String[] args) throws IOException {
        File myFile = new File(PATH.toURI());
        File newFile = new File(myFile, "test.txt");
        if (!newFile.exists()) {
            newFile.createNewFile();
        }
        if (myFile.exists() && myFile.isDirectory()) {
            File[] files = myFile.listFiles(); // получаем массив файлов
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println("Файл : " + file.getName());
                    } else if (file.isDirectory()) {
                        System.out.println("Папка : " + file.getName());
                    }
                }
            } else  {
                System.out.println("Папка пустая или ошибка чтения.");
            }
        } else  {
            System.out.println("Указанная папка не существует !!! ");
        }
    }
}
