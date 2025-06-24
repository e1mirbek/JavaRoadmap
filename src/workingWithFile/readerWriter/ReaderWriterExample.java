package workingWithFile.readerWriter;


// 🔹 3. Классы Reader и Writer (символьный поток)
// Для работы с текстом (вместо байтов).

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterExample {
    public static void main(String[] args) {


        try (FileWriter fileWriter = new FileWriter("text.text")) {
            fileWriter.write("Hello! Мир");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader reader = new FileReader("text.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
