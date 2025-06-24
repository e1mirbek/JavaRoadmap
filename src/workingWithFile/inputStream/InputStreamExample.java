package workingWithFile.inputStream;


import java.io.FileInputStream;
import java.io.IOException;

//  Классы InputStream и OutputStream (байтовый поток)
//  Используются для чтения и записи байтов (например, изображений, файлов).
public class InputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("example.txt")) {
            int byteData;
            while ((byteData = in.read()) != -1) {
                System.out.println((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
