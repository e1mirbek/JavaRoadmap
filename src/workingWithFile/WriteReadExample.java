package workingWithFile;

import java.io.*;

// InputStream - для чтение
// OutputStream - для записи

public class WriteReadExample {
    public static void main(String[] args) {
        File file = new File("/Users/user/Desktop/test", "test.txt");
        try {
            InputStream inputStream = new FileInputStream(file);

            byte[] bytes = new byte[1024];
            int len = inputStream.read(bytes);
            System.out.println("Содержимое : " + new String(bytes));


        } catch (FileNotFoundException e) {
            System.out.println("File не существет ");
        } catch (IOException e) {
            System.out.println("Ошибка записи");
        }
    }
}
