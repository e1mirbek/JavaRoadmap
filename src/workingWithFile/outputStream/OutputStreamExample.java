package workingWithFile.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream outputStream = new FileOutputStream("example.txt")) {
            String data = "Hello! Java";
            outputStream.write(data.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
